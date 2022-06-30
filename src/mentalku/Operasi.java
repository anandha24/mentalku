package mentalku;
public interface Operasi {
    // int totalData = 1225;
    int totalData = 50;
    int totalDataYa = 25;
    int totalDataTidak = totalData - totalDataYa;

    // double PTotal(int jumlahSampel, int jumlahData);

    // double PUmur(int jenisUmur, int jumlahData);

    // double PGender(int jenisKelamin, int jumlahData);

    // double PKerja(int jenisKerja, int jumlahData);

    // double PRiwayat(int jenisRiwayat, int jumlahData);

    // double PPengaruh(int jenisPengaruh, int jumlahData);

    // double PRemote(int jenisRemote, int jumlahData);

    double ProbYa(int PYa, int PTidak);

    double ProbTidak(int PTidak, int PYa);

    double ProbBayesYa(double ProbYa, double ProbTidak);

    double ProbBayesTidak(double ProbYa, double ProbTidak);

    void setPYaTidak(int jenisKelamin, int jenisUmur,
            int jenisRiwayat, int jenisRemote);

}
