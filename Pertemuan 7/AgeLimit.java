import java.util.Scanner;

public class AgeLimit {
	
	public static void main(String args[]) {
		int age=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age ");
		age = sc.nextInt();
		//age=Math.max(age,0);
		age=Math.min(40, age);
		System.out.print("Age is "+age);
	}
}

/* Pada kode diatas adalah salah satu contoh program
pada penggunaan fungsi Math, kode diatas dengan  memberi
nilai awal age adalah 0, lalu program akan meminta user 
untuk menginput usianya, setelah itu program akan mengeluarkan
output usia yang dimasukkan. Contohnya
Enter Age 19 (19 tersebut adalah input user)
Lalu outputnya akan seperti
Age is 19
*/