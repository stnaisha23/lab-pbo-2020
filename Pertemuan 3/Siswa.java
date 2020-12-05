
/**
 * Write a description of class Siswa here.
 *
 * @author (Siti Nur Aisha)
 * @version (05/12/2020)
 */
public class Siswa
{
    // instance variables - replace the example below with your own
    private int nrp;
    private String nama;
    // Merupakan suatu atribut yang bersifat private

    public Siswa(int nrpx, String namax)
    {
        // initialise instance variables
        nrp = nrpx;
        nama = namax;
        /* Method Siswa ini adalah method constructor yang digunakan
           untuk menciptakan objek dengan memberikan niai awal sesuai 
           tipe data*/
    }

    public void setNrp(int nrpx)
    {
        nrp = nrpx;
        /* Ini merupakan method Mutator yang digunakan untuk mengubah
           suatu nilai dari keadaan suatu objek dengan menggunakan kata set,
           method ini bertipe data kembalian sebagai void tetapi memiliki parameter*/
    }
    
    public int getNrp()
    {
        return nrp;
        /* method getNrp adalah method Accessor yang digunakan untuk mengembalikan
           atau mendapatkan nilai dari keadaan suatu objek, dengan menggunakan kata get*/
    }
    
    public void setNama(String namax)
    {
        nama = namax;
    }
    
    public String getNama()
    {
        return nama;
    }
}
