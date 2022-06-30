package mentalku;
public abstract class Hitung extends Orang implements Operasi {
    int jumlahSampel = totalData;
    int jumlahSampelYa = totalDataYa;
    int jumlahSampelTidak = totalDataTidak;
    int jenisUmur;
    int jenisKelamin;
    // int jenisKerja;
    int jenisRiwayat;
    // int jenisPengaruh;
    int jenisRemote;
    int PYa = 0;
    int PTidak = 0;
    double ProbYa = 0;
    double ProbTidak = 0;
    double ProbSampelYa = 0;
    double ProbSampelTidak = 0;
    // double Ptotal = 0.0;
    // double Pumur = 0.0;
    // double Pgender = 0.0;
    // double Pkerja = 0.0;
    // double Priwayat = 0.0;
    // double Ppengaruh = 0.0;
    // double Premote = 0.0;

    // public abstract double PTotal(int jumlahSampel, int jumlahDataSampel);

    // public abstract double PUmur(int jenisUmur, int jumlahDataUmur);

    // public abstract double PGender(int jenisKelamin, int jumlahDataGender);

    // public abstract double PKerja(int jenisKerja, int jumlahDataKerja);

    // public abstract double PRiwayat(int jenisRiwayat, int jumlahDataRiwayat);

    // public abstract double PPengaruh(int jenisPengaruh, int jumlahDataPengaruh);

    // public abstract double PRemote(int jenisRemote, int jumlahDataRemote);

    // public abstract void setPrediksi();

    public abstract double ProbYa(int PYa, int PTidak);

    public abstract double ProbTidak(int Pya, int PTidak);

    public abstract double ProbBayesYa(double ProbYa, double ProbTidak);

    public abstract double ProbBayesTidak(double ProbYa, double ProbTidak);

    public void setPYaTidak(int jenisKelamin,
            int jenisUmur,
            int jenisRiwayat, int jenisRemote) {
        this.ProbSampelYa = (double) this.jumlahSampelYa / this.jumlahSampel;
        this.ProbSampelTidak = (double) this.ProbSampelTidak / this.jumlahSampel;
        if (jenisKelamin == 0 && jenisUmur == 0 && jenisRiwayat == 0 && jenisRemote == 0) {
            this.PYa = 1;
            this.PTidak = 1;
        } else if (jenisKelamin == 1 && jenisUmur == 0 && jenisRiwayat == 0 && jenisRemote == 0) {
            this.PYa = 4;
            this.PTidak = 6;
        } else if (jenisKelamin == 0 && jenisUmur == 1 && jenisRiwayat == 0 && jenisRemote == 0) {
            this.PYa = 1;
            this.PTidak = 2;
        } else if (jenisKelamin == 0 && jenisUmur == 0 && jenisRiwayat == 1 && jenisRemote == 0) {
            this.PYa = 3;
            PTidak = 0;
        } else if (jenisKelamin == 0 && jenisUmur == 0 && jenisRiwayat == 0 && jenisRemote == 1) {
            this.PYa = 0;
            this.PTidak = 4;
        } else if (jenisKelamin == 1 && jenisUmur == 1 && jenisRiwayat == 0 && jenisRemote == 0) {
            this.PYa = 1;
            this.PTidak = 0;
        } else if (jenisKelamin == 1 && jenisUmur == 0 && jenisRiwayat == 1 && jenisRemote == 0) {
            this.PYa = 1;
            this.PTidak = 3;
        } else if (jenisKelamin == 1 && jenisUmur == 0 && jenisRiwayat == 0 && jenisRemote == 1) {
            this.PYa = 1;
            this.PTidak = 0;
        } else if (jenisKelamin == 0 && jenisUmur == 1 && jenisRiwayat == 1 && jenisRemote == 0) {
            this.PYa = 0;
            this.PTidak = 2;
        } else if (jenisKelamin == 0 && jenisUmur == 1 && jenisRiwayat == 0 && jenisRemote == 1) {
            this.PYa = 1;
            this.PTidak = 3;
        } else if (jenisKelamin == 0 && jenisUmur == 0 && jenisRiwayat == 1 && jenisRemote == 1) {
            this.PYa = 3;
            PTidak = 1;
        } else if (jenisKelamin == 1 && jenisUmur == 1 && jenisRiwayat == 1 && jenisRemote == 0) {
            this.PYa = 2;
            this.PTidak = 0;
        } else if (jenisKelamin == 1 && jenisUmur == 1 && jenisRiwayat == 0 && jenisRemote == 1) {
            this.PYa = 1;
            PTidak = 0;
        } else if (jenisKelamin == 1 && jenisUmur == 0 && jenisRiwayat == 1 && jenisRemote == 1) {
            this.PYa = 2;
            this.PTidak = 0;
        } else if (jenisKelamin == 0 && jenisUmur == 1 && jenisRiwayat == 1 && jenisRemote == 1) {
            this.PYa = 3;
            this.PTidak = 1;
        } else if (jenisKelamin == 1 && jenisUmur == 1 && jenisRiwayat == 1 && jenisRemote == 1) {
            this.PYa = 0;
            this.PTidak = 0;
        }
    };

    public int getPYa() {
        return this.PYa;
    }

    public int getPTidak() {
        return this.PTidak;
    }

    // public void setHitungP(int jumlahSampel, int jenisUmur, int jenisKelamin, int
    // jenisKerja, int jenisRiwayat,
    // int jenisPengaruh, int jenisRemote, int jumlahDataSampel, int jumlahDataUmur,
    // int jumlahDataGender,
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
    // int jenisPengaruh, int jenisRemote, int jumlahDataSampel, int jumlahDataUmur,
    // int jumlahDataGender,
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

    public int PYa() {
        return PYa;
    }

    public int PTidak() {
        return PTidak;
    }

    public double getProbYa() {
        return ProbYa;
    }

    public double getProbTidak() {
        return ProbTidak;
    }

    // public double getHitungP() {
    // return getPtotal() * getPumur() * getPgender() * getPkerja() * getPriwayat()
    // * getPpengaruh() * getPremote();
    // }
}
