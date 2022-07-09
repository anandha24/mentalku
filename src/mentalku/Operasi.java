package mentalku;
public interface Operasi {
    double ProbYa(int PYa, int PTidak);

    double ProbTidak(int PTidak, int PYa);

    double ProbNBayesYa(double ProbYa, double ProbTidak);

    double ProbNBayesTidak(double ProbYa, double ProbTidak);

    void setFYaTidak(int jenisLimb, int jenisSuhu,
            int jenisOksigen, int jenisDetak);

}
