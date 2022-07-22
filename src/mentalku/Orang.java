package mentalku;
public abstract class Orang extends Data{
    protected String nama;
    protected String Jkel;
    protected String Pend;
    protected String username;
    protected String tanggalLahir;

    public abstract void setNama(String nama);

    public abstract String getNama();

    public abstract void settanggalLahir(String tanggalLahir);

    public abstract String gettanggalLahir();

    public abstract void setJkel(String Jkel);

    public abstract String getJkel();

    public abstract void setPendidikan(String Pend);

    public abstract String getPendidikan();

    public abstract void setUsername(String Username);

    public abstract String getUsername();
}
