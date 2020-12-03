public class Penumpang
{
    // instance variables - replace the example below with your own
    private String nama;
    private int umur;
    private boolean hamil;
    private boolean prioritas;

    public Penumpang(String nama, int umur, boolean hamil)
    {
        this.nama = nama;
        this.umur = 0;
        this.hamil = hamil;
    }
    
    public String getNama()
    {
        return this.nama;
    }
    
    public int getUmur()
    {
        return this.umur;
    }
    
    public boolean getHamil()
    {
        return this.hamil;
    }
}