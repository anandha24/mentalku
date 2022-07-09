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
    }

    public int getJenisDetak() {
        return this.jenisDetak;
    }


    public void setJenisUmur() {
        super.setJenisUmur();
    }

    public int getJenisUmur() {
        return super.getJenisUmur();
    }

    public String prediksi() {
        String Ya = "Iya, Berdasarkan kondisi fisik anda, anda sedang mengalami kecemasan\nPersentase Akurasi (%) -> ";
        String Tidak = "Tidak, Berdasarkan kondisi fisik anda, anda sedang mengalami kecemasan\nPersentase Akurasi (%) -> ";
        Double Akurasi = 0.0;
        if (Double.isNaN(getProbBayesYa()) || Double.isNaN(getProbBayesYa())){
            Akurasi = 100.0;
        } else if (getProbBayesYa() > getProbBayesTidak()){
            Akurasi = (getProbBayesYa() / (getProbBayesYa() + getProbBayesTidak())) * 100;
        } else{
            Akurasi = (getProbBayesTidak() / (getProbBayesYa() + getProbBayesTidak())) * 100;
        }

        if (getProbBayesYa() > getProbBayesTidak() || Double.isNaN(getProbBayesTidak())) {
            return Ya + Akurasi;
        } else if (getProbBayesYa() < getProbBayesTidak() || Double.isNaN(getProbBayesYa())) {
            return Tidak + Akurasi;
        } else if (getProbBayesYa() == getProbBayesTidak() && (getProbBayesYa() != 0 || getProbBayesTidak() != 0)) {
            return "Prediksi Bias, kemungkinan prediksi \"Iya\" dan \"Tidak\" sama\nPersentase Keakuratan Prediksi (%) -> "
                    + (getProbBayesYa() / (getProbBayesYa() + getProbBayesTidak())) * 100;
        } else {
            return "Tidak bisa di prediksi\nPersentase Keakuratan Prediksi (%) -> -";
        }
    }
}
