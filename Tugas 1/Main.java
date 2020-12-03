import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        boolean fix = true;
        
        while (fix) {
            System.out.println("=========SELAMAT DATANG========");
            System.out.println("===== BUS TRANS KOETARAJA =====");
            System.out.println("MENU : \n 1. Naikkan Penumpang\n 2. Turunkan Penumpang\n 3. Lihat Penumpang\n 4. Berhenti");
            System.out.println("Masukkan Pilihan :");
            int menu = input.nextInt();
        
            if (menu==1) {
                System.out.println("Nama Penumpang : ");
                String nama = input.next();
                System.out.println("Umur : ");
                int umur = input.nextInt();
                System.out.println("Hamil (y/n) : ");
                Boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("y")?true:false;
                Penumpang p1 = new Penumpang(nama, umur, hamil);
                Bus bus1 = new Bus();
                bus1.naikPenumpang(p1);
                bus1.toString();
                System.out.println(" ");
            } else if (menu==2) {
                System.out.println("Nama Penumpang : ");
                String nama = input.next();
                Bus bus1 = new Bus();
                bus1.turunPenumpang(nama);
                System.out.println("Penumpang Telah Turun!");
                bus1.toString();
                System.out.println(" ");
            } else if (menu==3) {
                Bus bus1 = new Bus();
                bus1.toString();
                System.out.println(" ");
            } else {
                fix = false;
            }
        } 
    }
}