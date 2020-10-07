import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		int age=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan umur anda:");

		age = sc.nextInt();
		if(age>=17)
		System.out.print("Anda sudah boleh buat KTP");
	}
}

/* Program diatas untuk mencoba seleksi if yang digunakan untuk
suatu keadaan yang mengembalikan boolean, sehingga pernyataan if hanya
akan dilakukan jika keadaan mengemnbalikan nilai boolean true. seperti
jika pada umur kita masukkan angka lebih dari atau sama dengan 17, maka
akan muncul keluaran bahwa kita sudah boleh buat KTP. Begitu juga sebaliknya
jika umur kita dibawah 17 maka hasil keluaran diatas tidak akan keluar */