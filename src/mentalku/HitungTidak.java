package mentalku;
public class HitungTidak extends HitungYa {
    private int jumlahDataSampel = super.getJumlahSampel();
    private int jumlahDataSampelYa = super.getJumlahSampelYa();
    private int jumlahDataSampelTidak = super.getJumlahSampelTidak();

    double ProbYa;
    double ProbTidak;
    double ProbSampelYa;
    double ProbSampelTidak;
    double ProbNBayesYa;
    double ProbNBayesTidak;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double ProbYa(int FYa, int FTidak) {
        return super.ProbYa(FYa, FTidak);
    }

    public double ProbTidak(int FYa, int FTidak) {
        this.jumlahDataSampelTidak = super.getJumlahSampelTidak();
        this.ProbTidak = (double) FTidak / jumlahDataSampelTidak;
        return this.ProbTidak;
    }

    public double ProbNBayesYa(double ProbYa, double ProbTidak) {
        return super.ProbNBayesYa(ProbYa, ProbTidak);
    }

    public double ProbNBayesTidak(double ProbYa, double ProbTidak) {
        this.jumlahDataSampel = super.getJumlahSampel();
        ProbSampelYa = (double) jumlahDataSampelYa / jumlahDataSampel;
        ProbSampelTidak = (double) jumlahDataSampelTidak / jumlahDataSampel;
        this.ProbNBayesTidak = ProbSampelTidak * ProbTidak / ((ProbSampelYa * ProbYa) + (ProbSampelTidak * ProbTidak));
        return this.ProbNBayesTidak;
    }

    public double getProbTidak() {
        return this.ProbTidak;
    }

    public double getProbBayesTidak() {
        return this.ProbNBayesTidak;
    }

}
