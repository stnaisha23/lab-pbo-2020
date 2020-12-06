
/**
 * Write a description of class TesSiswa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TesSiswa
{
    // instance variables - replace the example below with your own

    public static void main(String[] ar)
    {
        Siswa s = new Siswa (12345);
        Siswa ss = new Siswa(8030001, "Upin");
        
        //ini akan menimbulkan error
        //Siswa sss = new Siswa(8030002);
        
        System.out.println(s);
        System.out.println(ss);
    }
}
