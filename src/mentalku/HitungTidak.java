package mentalku;
public class HitungTidak extends HitungYa {
    private int jumlahDataSampel = jumlahSampel;
    private int jumlahDataSampelYa = jumlahSampelYa;
    private int jumlahDataSampelTidak = jumlahSampelTidak;
    // private double prediksi;
    // private double Ptotal;
    // private double Pumur;
    // private double Pgender;
    // private double Pkerja;
    // private double Priwayat;
    // private double Ppengaruh;
    // private double Premote;
    int PYa;
    int PTidak;
    double ProbYa;
    double ProbTidak;
    double ProbSampelYa;
    double ProbSampelTidak;
    double ProbBayesYa;
    double ProbBayesTidak;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double ProbYa(int PYa, int PTidak) {
        return super.ProbYa(PYa, PTidak);
    }

    public double ProbTidak(int PYa, int PTidak) {
        this.ProbTidak = (double) PTidak / jumlahDataSampelTidak;
        return this.ProbTidak;
    }

    public double ProbBayesYa(double ProbYa, double ProbTidak) {
        return super.ProbBayesYa(ProbYa, ProbTidak);
    }

    public double ProbBayesTidak(double ProbYa, double ProbTidak) {
        ProbSampelYa = (double) jumlahDataSampelYa / jumlahDataSampel;
        // System.out.println("ProbSampelYa: " + ProbSampelYa);
        ProbSampelTidak = (double) jumlahDataSampelTidak / jumlahDataSampel;
        // System.out.println("ProbSampelTidak: " + ProbSampelTidak);
        this.ProbBayesTidak = ProbSampelTidak * ProbTidak / ((ProbSampelYa * ProbYa) + (ProbSampelTidak * ProbTidak));
        return this.ProbBayesTidak;
    }

    // public void setProbBayesTidak() {
    // this.ProbBayesTidak = ProbBayesTidak(ProbYa, ProbTidak);
    // }

    public double getProbTidak() {
        return this.ProbTidak;
    }

    public double getProbBayesTidak() {
        return this.ProbBayesTidak;
    }

    // public double PTotal(int jumlahSampel, int jumlahData) {
    // Ptotal = (double) jumlahSampel / jumlahData;
    // return Ptotal;
    // }

    // public double PUmur(int jenisUmur, int jumlahData) {
    // Pumur = (double) jenisUmur / jumlahData;
    // return Pumur;
    // }

    // public double PGender(int jenisKelamin, int jumlahData) {
    // Pgender = (double) jenisKelamin / jumlahData;
    // return Pgender;
    // }

    // public double PKerja(int jenisKerja, int jumlahData) {
    // Pkerja = (double) jenisKerja / jumlahData;
    // return Pkerja;
    // }

    // public double PRiwayat(int jenisRiwayat, int jumlahData) {
    // Priwayat = (double) jenisRiwayat / jumlahData;
    // return Priwayat;
    // }

    // public double PPengaruh(int jenisPengaruh, int jumlahData) {
    // Ppengaruh = (double) jenisPengaruh / jumlahData;
    // return Ppengaruh;
    // }

    // public double PRemote(int jenisRemote, int jumlahData) {
    // Premote = (double) jenisRemote / jumlahData;
    // return Premote;
    // }

    // public void setPrediksiTidak() {
    // this.prediksi = this.Ptotal * this.Pumur * this.Pgender * this.Pkerja *
    // this.Priwayat * this.Ppengaruh
    // * this.Premote;
    // }

    // public double getPrediksiTidak() {
    // return this.prediksi;
    // }

    // public void setHitungP(int jumlahSampel, int jenisUmur, int jenisKelamin, int
    // jenisKerja, int jenisRiwayat,
    // int jenisPengaruh, int jenisRemote, int jumlahDataUmur, int jumlahDataGender,
    // int jumlahDataKerja, int jumlahDataRiwayat, int jumlahDataPengaruh, int
    // jumlahDataRemote) {
    // this.Ptotal = PTotal(jumlahSampel, jumlahDataSampel);
    // this.Pumur = PUmur(jenisUmur, jumlahDataUmur);
    // this.Pgender = PGender(jenisKelamin, jumlahDataGender);
    // this.Pkerja = PKerja(jenisKerja, jumlahDataKerja);
    // this.Priwayat = PRiwayat(jenisRiwayat, jumlahDataRiwayat);
    // this.Ppengaruh = PPengaruh(jenisPengaruh, jumlahDataPengaruh);
    // this.Premote = PRemote(jenisRemote, jumlahDataRemote);
    // }

    // public void setHitungPY(int jumlahSampel, int jenisUmur, int jenisKelamin,
    // int jenisKerja, int jenisRiwayat,
    // int jenisPengaruh, int jenisRemote, int jumlahDataUmur, int jumlahDataGender,
    // int jumlahDataKerja, int jumlahDataRiwayat, int jumlahDataPengaruh, int
    // jumlahDataRemote) {
    // super.setHitungP(jumlahSampel, jenisUmur, jenisKelamin, jenisKerja,
    // jenisRiwayat, jenisPengaruh, jenisRemote,
    // jumlahDataSampel, jumlahDataUmur, jumlahDataGender, jumlahDataKerja,
    // jumlahDataRiwayat,
    // jumlahDataPengaruh, jumlahDataRemote);
    // }

    // public double getPtotal() {
    // return Ptotal;
    // }

    // public double getPumur() {
    // return Pumur;
    // }

    // public double getPgender() {
    // return Pgender;
    // }

    // public double getPkerja() {
    // return Pkerja;
    // }

    // public double getPriwayat() {
    // return Priwayat;
    // }

    // public double getPpengaruh() {
    // return Ppengaruh;
    // }

    // public double getPremote() {
    // return Premote;
    // }

}
