package mentalku;

public class CekOrang extends HitungTidak {
    private double suhu;
    private double limb;
    private double oksigen;
    private double detak;
    private int jenisSuhu;
    private int jenisLimb;
    private int jenisOksigen;
    private int jenisDetak;
    private Double ProbNbayesYa = getProbBayesYa();
    private Double ProbNbayesTidak = getProbBayesTidak();

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setSuhu(Double Suhu) {
        this.suhu = Suhu;
    } 

    public void setLimb(Double Limb) {
        this.limb = Limb;
    }

    public void setOksigen(Double Oksigen) {
        this.oksigen = Oksigen;
    }

    public void setDetak(Double Detak) {
        this.detak = Detak;
    }

    public Double getSuhu() {
        return this.suhu;
    }

    public Double getLimb() {
        return this.limb;
    }

    public Double getOksigen() {
        return this.oksigen;
    }

    public Double getDetak() {
        return this.detak;
    }

    public void setJenisSuhu() {
        if (suhu > 97.000) {
            this.jenisSuhu = 1;
        } else {
            this.jenisSuhu = 0;
        }
        System.out.println(this.jenisSuhu);
    }

    public int getJenisSuhu() {
        return this.jenisSuhu;
    }

    public void setJenisLimb() {
        if (limb > 10.000) {
            this.jenisLimb = 0;
        } else {
            this.jenisLimb = 1;
        }
        System.out.println(this.jenisLimb);
    }

    public int getJenisLimb() {
        return this.jenisLimb;
    }

    public void setJenisOksigen() {
        if (oksigen > 95.000) {
            this.jenisOksigen = 1;
        } else {
            this.jenisOksigen = 0;
        }
        System.out.println(this.jenisOksigen);
    }

    public int getJenisOksigen() {
        return this.jenisOksigen;
    }

    public void setJenisDetak() {
        if (detak >= 60.000) {
            this.jenisDetak = 1;
        } else {
            this.jenisDetak = 0;
        }
        System.out.println(this.jenisDetak);
    }

    public int getJenisDetak() {
        return this.jenisDetak;
    }

    public void setProb(){
        this.ProbNBayesYa = getProbBayesYa();
        this.ProbNBayesTidak = getProbBayesTidak();
    }

    public String prediksi() {
        String Ya = "Iya, Berdasarkan kondisi fisik anda, anda sedang mengalami kecemasan\nPersentase Akurasi (%) -> ";
        String Tidak = "Tidak, Berdasarkan kondisi fisik anda, anda sedang mengalami kecemasan\nPersentase Akurasi (%) -> ";
        // Double Akurasi = 0.0;
        setProb();

        System.out.println("Probabiltas ya: " + this.ProbNBayesYa);
        System.out.println("Probabilitas Tidak: " + this.ProbNBayesTidak);

        if (this.ProbNbayesYa == this.ProbNbayesTidak && (this.ProbNBayesYa != 0 || this.ProbNBayesTidak != 0) || (Double.isNaN(getProbBayesYa()) && Double.isNaN(getProbBayesTidak()))) {
            return "Prediksi Bias, kemungkinan prediksi \"Iya\" dan \"Tidak\" sama\nPersentase Keakuratan Prediksi (%) -> "
                    + 0.0;       
        } else if (this.ProbNBayesYa < this.ProbNBayesTidak) {
            return Tidak + (this.ProbNBayesTidak / (this.ProbNBayesYa + this.ProbNBayesTidak)) * 100;
        } else if (this.ProbNBayesYa > this.ProbNBayesTidak) {
            return Ya + (this.ProbNBayesYa / (this.ProbNBayesYa + this.ProbNBayesTidak)) * 100;
        } else {
            return "Tidak bisa di prediksi\nPersentase Keakuratan Prediksi (%) -> -";
        }
    }
}
