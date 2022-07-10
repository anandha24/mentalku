package mentalku;
public abstract class Orang extends Data{
    protected String nama;
    protected int umur;

    public abstract void setNama(String nama);

    public abstract String getNama();

    public abstract void setUmur(int umur);

    public abstract int getUmur();
}
