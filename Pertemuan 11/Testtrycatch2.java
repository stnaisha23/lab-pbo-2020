public class Testtrycatch2{
	public static void main(String args[]){
		try{
			int data=10/0;
		} catch(ArithmeticException e) {
			System.out.println(e); 
		}
		
		System.out.println("rest of the code...");
	}
}

/*
Program diatas merupakan contoh dari penggunaan exception, dimana 
exception ini suatu kondisi abnormal yang terjadi saat program 
dijalankan yang dapat mengganggu jalannya suatu program secara 
normal. Jadi program diatas pada operasi pembagian10/0, jika 
penyebutnya adalah 0 maka akan muncul ArithmeticException.
Hasil output dari program diatas adalah
java.lang.ArithmeticException: / by zero
rest of the code...
*/