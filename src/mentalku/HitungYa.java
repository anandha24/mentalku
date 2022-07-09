package mentalku;
import java.util.Arrays;
public class HitungYa extends Hitung {
    private int jumlahDataSampel = super.getJumlahSampel();
    private int jumlahDataSampelYa = super.getJumlahSampelYa();
    private int jumlahDataSampelTidak = super.getJumlahSampelTidak();
    private int[] DataPrediksiYa = super.getFrekuensiPrediksiYa();
    private int[] DataPrediksiTidak = super.getFrekuensiPrediksiTidak();

    double ProbYa;
    double ProbTidak;
    double ProbSampelYa;
    double ProbSampelTidak;
    double ProbNBayesYa;
    double ProbNBayesTidak;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return this.umur;
    }

    public double ProbYa(int FYa, int FTidak) {
        this.jumlahDataSampelYa = super.getJumlahSampelYa();
        this.ProbYa = (double) FYa / this.jumlahDataSampelYa;
        // System.out.println("FYa: " + FYa);
        // System.out.println("JumlahDataSampel: " + this.jumlahDataSampel);
        // System.out.println("JumlahDataSampelYa: " + this.jumlahDataSampelYa);
        return this.ProbYa;
    }

    public double ProbTidak(int FYa, int FTidak) {
        this.jumlahDataSampelTidak = super.getJumlahSampelTidak();
        this.ProbTidak = (double) FTidak / jumlahDataSampelTidak;
        return this.ProbTidak;
    }

    public double ProbNBayesYa(double ProbYa, double ProbTidak) {
        this.jumlahDataSampel = super.getJumlahSampel();
        ProbSampelYa = (double) jumlahDataSampelYa / jumlahDataSampel;
        ProbSampelTidak = (double) jumlahDataSampelTidak / jumlahDataSampel;
        // System.out.println("ProbSampelYa: " + this.ProbSampelYa);
        // System.out.println("Ya" + Arrays.toString(DataPrediksiYa));
        // System.out.println("Tidak" + Arrays.toString(DataPrediksiTidak));
        this.ProbNBayesYa = ProbSampelYa * ProbYa / ((ProbSampelYa * ProbYa) + (ProbSampelTidak * ProbTidak));
        return this.ProbNBayesYa;
    }

    public double ProbNBayesTidak(double ProbYa, double ProbTidak) {
        this.jumlahDataSampel = super.getJumlahSampel();
        ProbSampelYa = (double) jumlahDataSampelYa / jumlahDataSampel;
        ProbSampelTidak = (double) jumlahDataSampelTidak / jumlahDataSampel;
        this.ProbNBayesTidak = ProbSampelTidak * ProbTidak / ((ProbSampelYa * ProbYa) + (ProbSampelTidak * ProbTidak));
        return this.ProbNBayesTidak;
    }

    public double getProbYa() {
        return this.ProbYa;
    }

    public double getProbBayesYa() {
        return this.ProbNBayesYa;
    }
}
