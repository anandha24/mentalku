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

    // Method untuk menghitung probabilitas sesuai frekuensi input dengan peluang cemas
    public double ProbYa(int FYa, int FTidak) {
        this.jumlahDataSampelYa = super.getJumlahSampelYa();
        this.ProbYa = (double) FYa / this.jumlahDataSampelYa;
        // System.out.println("FYa: " + FYa);
        // System.out.println("JumlahDataSampel: " + this.jumlahDataSampel);
        // System.out.println("JumlahDataSampelYa: " + this.jumlahDataSampelYa);
        return this.ProbYa;
    }

    // Method untuk menghitung probabilitas sesuai frekuensi input dengan peluang tidak cemas
    public double ProbTidak(int FYa, int FTidak) {
        this.jumlahDataSampelTidak = super.getJumlahSampelTidak();
        this.ProbTidak = (double) FTidak / jumlahDataSampelTidak;
        return this.ProbTidak;
    }

    // Method untuk menghitung probabilitas Naive Bayes sesuai input dengan output cemas
    public double ProbNBayesYa(double ProbYa, double ProbTidak) {
        this.jumlahDataSampel = super.getJumlahSampel();
        ProbSampelYa = (double) jumlahDataSampelYa / jumlahDataSampel;
        ProbSampelTidak = (double) jumlahDataSampelTidak / jumlahDataSampel;
        System.out.println("ProbSampelYa: " + this.ProbSampelYa);
        System.out.println("Ya" + Arrays.toString(DataPrediksiYa));
        System.out.println("Tidak" + Arrays.toString(DataPrediksiTidak));
        this.ProbNBayesYa = ProbSampelYa * ProbYa / ((ProbSampelYa * ProbYa) + (ProbSampelTidak * ProbTidak));
        if(Double.isNaN(this.ProbNBayesYa)){
            this.ProbNBayesYa = 0.0;
        }
        return this.ProbNBayesYa;
    }

    // Method untuk menghitung probabilitas Naive Bayes sesuai input dengan output tidak cemas
    public double ProbNBayesTidak(double ProbYa, double ProbTidak) {
        this.jumlahDataSampel = super.getJumlahSampel();
        ProbSampelYa = (double) jumlahDataSampelYa / jumlahDataSampel;
        ProbSampelTidak = (double) jumlahDataSampelTidak / jumlahDataSampel;
        this.ProbNBayesTidak = ProbSampelTidak * ProbTidak / ((ProbSampelYa * ProbYa) + (ProbSampelTidak * ProbTidak));
        return this.ProbNBayesTidak;
    }

    // Method getter probabilitas sesuai input dengan output cemas
    public double getProbYa() {
        return this.ProbYa;
    }

    // Method getter probabilitas Naive Bayes sesuai input dengan output cemas
    public double getProbBayesYa() {
        return this.ProbNBayesYa;
    }
}
