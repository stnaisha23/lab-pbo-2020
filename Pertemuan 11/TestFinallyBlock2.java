public class TestFinallyBlock2{
	public static void main(String args[]){
		try{
			int data=25/0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		finally{
			System.out.println("finally block is always executed");
		}

		System.out.println("rest of the code...");
	}
}

/*
Program diatas adalah contoh dari penggunaan Exception dan cara menanganinya
dengan menggunakan blok try-catch-finally.  Walaupun namanya seperti itu, tetapi 
catch dan finally adalah pilihan, yang berarti boleh ada atau tidak ada. Contoh 
diatas lebih tepatnya adalah contoh pada finally, finally ini merupakan blok yang 
akan selalu dilakukan, saat ada ataupun tidak ada Exeption.
Nah program diatas terdapat Exception karena pada pembagi 25/0 dimana penyebutnya
adalah 0 maka akan muncul ArithmeticException. Lalu setelah muncul exception tersebut
akan ditangi menggunakan finally, seperti kode diatas bahwa blok finally akan selalu
ditulis sesudah blok try-catch.
java.lang.ArithmeticException: / by zero
finally block is always executed
rest of the code...
*/