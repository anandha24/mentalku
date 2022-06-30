package mentalku;

public class CekOrang extends HitungTidak {
    private char gender;
    // private String kerja;
    private String riwayat;
    // private String pengaruh;
    private String remote;
    private int jenisGender;
    private int jenisRiwayat;
    private int jenisRemote;
    // private int jenisGenderYa;
    // private int jenisGenderTidak;
    // private int jenisKerjaYa;
    // private int jenisKerjaTidak;
    // private int jenisRiwayatYa;
    // private int jenisRiwayatTidak;
    // private int jenisPengaruhYa;
    // private int jenisPengaruhTidak;
    // private int jenisRemoteYa;
    // private int jenisRemoteTidak;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // public void setKerja(String kerja) {
    // this.kerja = kerja;
    // }

    public void setRiwayat(String riwayat) {
        this.riwayat = riwayat;
    }

    // public void setPengaruh(String pengaruh) {
    // this.pengaruh = pengaruh;
    // }

    public void setRemote(String remote) {
        this.remote = remote;
    }

    public String getGender() {
        String Gender = Character.toString(this.gender);
        Gender = Gender.toUpperCase();
        return Gender;
    }

    // public String getKerja() {
    // return this.kerja;
    // }

    public String getRiwayat() {
        return this.riwayat;
    }

    // public String getPengaruh() {
    // return this.pengaruh;
    // }

    public String getRemote() {
        return this.remote;
    }

    public void setJenisGender() {
        if (gender == 'l') {
            this.jenisGender = 0;
        } else {
            this.jenisGender = 1;
        }
    }

    public int getJenisGender() {
        return this.jenisGender;
    }

    // public int getJenisGenderYa() {
    // return jenisGenderYa;
    // }

    // public int getJenisGenderTidak() {
    // return jenisGenderTidak;
    // }

    // public void setJenisKerja() {
    // if (kerja.toLowerCase().equals("iya")) {
    // this.jenisKerjaYa = 70;
    // this.jenisKerjaTidak = 68;
    // } else {
    // this.jenisKerjaYa = 542;
    // this.jenisKerjaTidak = 545;
    // }
    // }

    // public int getJenisKerjaYa() {
    // return jenisKerjaYa;
    // }

    // public int getJenisKerjaTidak() {
    // return jenisKerjaTidak;
    // }

    public void setJenisRiwayat() {
        if (riwayat.toLowerCase().equals("iya")) {
            this.jenisRiwayat = 1;
        } else {
            this.jenisRiwayat = 0;
        }
    }

    public int getJenisRiwayat() {
        return this.jenisRiwayat;
    }

    // public int getJenisRiwayatYa() {
    // return jenisRiwayatYa;
    // }

    // public int getJenisRiwayatTidak() {
    // return jenisRiwayatTidak;
    // }

    // public void setJenisPengaruh() {
    // if (pengaruh.toLowerCase().equals("sering")) {
    // this.jenisPengaruhYa = 116;
    // this.jenisPengaruhTidak = 20;
    // } else if (pengaruh.toLowerCase().equals("kadang-kadang")) {
    // this.jenisPengaruhYa = 343;
    // this.jenisPengaruhTidak = 106;
    // } else if (pengaruh.toLowerCase().equals("jarang")) {
    // this.jenisPengaruhYa = 119;
    // this.jenisPengaruhTidak = 50;
    // } else if (pengaruh.toLowerCase().equals("tidak pernah")) {
    // this.jenisPengaruhYa = 30;
    // this.jenisPengaruhTidak = 181;
    // } else {
    // this.jenisPengaruhYa = 4;
    // this.jenisPengaruhTidak = 256;
    // }
    // }

    // public int getJenisPengaruhYa() {
    // return jenisPengaruhYa;
    // }

    // public int getJenisPengaruhTidak() {
    // return jenisPengaruhTidak;
    // }

    public void setJenisRemote() {
        if (remote.toLowerCase().equals("iya")) {
            this.jenisRemote = 1;
        } else {
            this.jenisRemote = 0;
        }
    }

    public int getJenisRemote() {
        return this.jenisRemote;
    }

    // public int getJenisRemoteYa() {
    // return jenisRemoteYa;
    // }

    // public int getJenisRemoteTidak() {
    // return jenisRemoteTidak;
    // }

    public void setJenisUmur() {
        super.setJenisUmur();
    }

    public int getJenisUmur() {
        return super.getJenisUmur();
    }

    // public int getJenisUmurTidak() {
    // return super.getJenisUmurTidak();
    // }

    public String prediksi() {
        String Ya = "Iya, Anda butuh Pengobatan Kesehatan Mental\nPersentase Akurasi (%) -> ";
        String Tidak = "Tidak, Anda tidak perlu Pengobatan Kesehatan Mental\nPersentase Akurasi (%) -> ";

        if (getProbBayesYa() > getProbBayesTidak()) {
            return Ya + (getProbBayesYa() / (getProbBayesYa() + getProbBayesTidak())) * 100;
        } else {
            return Tidak + (getProbBayesTidak() / (getProbBayesYa() + getProbBayesTidak())) * 100;
        }
    }
}
