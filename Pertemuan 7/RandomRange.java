import java.util.Random;

public class RandomRange {

	public static void main(String[] args) {

		Random num = new Random();
		int randomnum = num.nextInt(10)+4;
		System.out.println("Random Number: " + randomnum);
	}
}

/*
program diatas adalah contoh penggunaan class Random. Class Random ini
memiliki method untuk mengembalikan nilai acak yang bertipe integer,
double, boolean, float dan long. Maka kita perlu menambahkan import 
java.util.Random sehingga hasil dari kode diatas akan menghasilkan
nilai acak. Outputnya :

Random Number: 10

*/