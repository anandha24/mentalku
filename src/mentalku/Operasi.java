package mentalku;
public interface Operasi {
    // Method menghitung peluang cemas
    double ProbYa(int FYa, int FTidak);

    // Method menghitung peluang tidak cemas
    double ProbTidak(int FYa, int FTidak);

    // Method menghitung peluang naive bayes input jika diduga cemas 
    double ProbNBayesYa(double ProbYa, double ProbTidak);

    // Method menghitung peluang naive bayes input jika diduga tidak cemas
    double ProbNBayesTidak(double ProbYa, double ProbTidak);

    // Method untuk me-set frekuensi yang digunakan sesuai input
    void setFYaTidak(int jenisLimb, int jenisSuhu,
            int jenisOksigen, int jenisDetak);

}
