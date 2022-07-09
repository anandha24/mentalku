package mentalku;
public abstract class Orang extends Data{
    protected String nama;
    protected int umur;
    protected int jenisUmur;

    public abstract void setNama(String nama);

    public abstract String getNama();

    public abstract void setUmur(int umur);

    public abstract int getUmur();

    public void setJenisUmur() {
        if (umur > 35) {
            this.jenisUmur = 1;
        } else {
            this.jenisUmur = 0;
        }
    }

    public int getJenisUmur() {
        return this.jenisUmur;
    }
}
