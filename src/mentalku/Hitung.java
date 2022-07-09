package mentalku;
public abstract class Hitung extends Orang {
    int jumlahSampel = super.getTotalSampel();
    int jumlahSampelTidak = super.getTotalSampel(super.getTotalSampel());
    int jumlahSampelYa = super.getTotalSampel(this.jumlahSampelTidak, this.jumlahSampel);
    int jenisLimb; 
    int jenisSuhu;
    int jenisOksigen; 
    int jenisDetak;
    int FYa = 0;
    int FTidak = 0;
    double ProbYa = 0;
    double ProbTidak = 0;
    double ProbSampelYa = 0;
    double ProbSampelTidak = 0;

    public abstract double ProbYa(int FYa, int FTidak);

    public abstract double ProbTidak(int FYa, int FTidak);

    public abstract double ProbNBayesYa(double ProbYa, double ProbTidak);

    public abstract double ProbNBayesTidak(double ProbYa, double ProbTidak);

    public void setFYaTidak(int jenisLimb, int jenisSuhu,
            int jenisOksigen, int jenisDetak) {
                this.jumlahSampel = super.getTotalSampel();
        this.jumlahSampelTidak = super.getTotalSampel(super.getTotalSampel());
        this.jumlahSampelYa = super.getTotalSampel(this.jumlahSampelTidak, this.jumlahSampel);
        this.ProbSampelYa = (double) this.jumlahSampelYa / this.jumlahSampel;
        this.ProbSampelTidak = (double) this.ProbSampelTidak / this.jumlahSampel;
        if (jenisLimb == 0 && jenisSuhu == 0 && jenisOksigen == 0 && jenisDetak == 0) {
            this.FYa = super.getFrekuensiPrediksiYa(0);
            this.FTidak = super.getFrekuensiPrediksiTidak(0);
        } else if (jenisLimb == 1 && jenisSuhu == 0 && jenisOksigen == 0 && jenisDetak == 0) {
            this.FYa = super.getFrekuensiPrediksiYa(1);
            this.FTidak = super.getFrekuensiPrediksiTidak(1);
        } else if (jenisLimb == 0 && jenisSuhu == 1 && jenisOksigen == 0 && jenisDetak == 0) {
            this.FYa = super.getFrekuensiPrediksiYa(2);
            this.FTidak = super.getFrekuensiPrediksiTidak(2);
        } else if (jenisLimb == 0 && jenisSuhu == 0 && jenisOksigen == 1 && jenisDetak == 0) {
            this.FYa = super.getFrekuensiPrediksiYa(3);
            this.FTidak = super.getFrekuensiPrediksiTidak(3);
        } else if (jenisLimb == 0 && jenisSuhu == 0 && jenisOksigen == 0 && jenisDetak == 1) {
            this.FYa = super.getFrekuensiPrediksiYa(4);
            this.FTidak = super.getFrekuensiPrediksiTidak(4);
        } else if (jenisLimb == 1 && jenisSuhu == 1 && jenisOksigen == 0 && jenisDetak == 0) {
            this.FYa = super.getFrekuensiPrediksiYa(5);
            this.FTidak = super.getFrekuensiPrediksiTidak(5);
        } else if (jenisLimb == 1 && jenisSuhu == 0 && jenisOksigen == 1 && jenisDetak == 0) {
            this.FYa = super.getFrekuensiPrediksiYa(6);
            this.FTidak = super.getFrekuensiPrediksiTidak(6);
        } else if (jenisLimb == 1 && jenisSuhu == 0 && jenisOksigen == 0 && jenisDetak == 1) {
            this.FYa = super.getFrekuensiPrediksiYa(7);
            this.FTidak = super.getFrekuensiPrediksiTidak(7);
        } else if (jenisLimb == 0 && jenisSuhu == 1 && jenisOksigen == 1 && jenisDetak == 0) {
            this.FYa = super.getFrekuensiPrediksiYa(8);
            this.FTidak = super.getFrekuensiPrediksiTidak(8);
        } else if (jenisLimb == 0 && jenisSuhu == 1 && jenisOksigen == 0 && jenisDetak == 1) {
            this.FYa = super.getFrekuensiPrediksiYa(9);
            this.FTidak = super.getFrekuensiPrediksiTidak(9);
        } else if (jenisLimb == 0 && jenisSuhu == 0 && jenisOksigen == 1 && jenisDetak == 1) {
            this.FYa = super.getFrekuensiPrediksiYa(10);
            this.FTidak = super.getFrekuensiPrediksiTidak(10);
        } else if (jenisLimb == 1 && jenisSuhu == 1 && jenisOksigen == 1 && jenisDetak == 0) {
            this.FYa = super.getFrekuensiPrediksiYa(11);
            this.FTidak = super.getFrekuensiPrediksiTidak(11);
        } else if (jenisLimb == 1 && jenisSuhu == 1 && jenisOksigen == 0 && jenisDetak == 1) {
            this.FYa = super.getFrekuensiPrediksiYa(12);
            this.FTidak = super.getFrekuensiPrediksiTidak(12);
        } else if (jenisLimb == 1 && jenisSuhu == 0 && jenisOksigen == 1 && jenisDetak == 1) {
            this.FYa = super.getFrekuensiPrediksiYa(13);
            this.FTidak = super.getFrekuensiPrediksiTidak(13);
        } else if (jenisLimb == 0 && jenisSuhu == 1 && jenisOksigen == 1 && jenisDetak == 1) {
            this.FYa = super.getFrekuensiPrediksiYa(14);
            this.FTidak = super.getFrekuensiPrediksiTidak(14);
        } else if (jenisLimb == 1 && jenisSuhu == 1 && jenisOksigen == 1 && jenisDetak == 1) {
            this.FYa = super.getFrekuensiPrediksiYa(15);
            this.FTidak = super.getFrekuensiPrediksiTidak(15);
        }
    };

    public int getFYa() {
        return this.FYa;
    }

    public int getFTidak() {
        return this.FTidak;
    }

        public int getJumlahSampel() {
        return this.jumlahSampel;
    }

    public int getJumlahSampelYa() {
        return this.jumlahSampelYa;
    }

    public int getJumlahSampelTidak() {
        return this.jumlahSampelTidak;
    }

    public double getProbYa() {
        return ProbYa;
    }

    public double getProbTidak() {
        return ProbTidak;
    }
}
