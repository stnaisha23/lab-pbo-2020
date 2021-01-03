public class TestMultipleCatchBlock{
	public static void main(String args[]){
		try{
			int a[]=new int[5];
			a[5]=30/0;
		} catch (ArithmeticException e) {
			System.out.println("task1 is completed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 completed");
		} catch (Exception e) {
			System.out.println("common task completed");
		}

		System.out.println("rest of the code...");
	}
}

/*
Program diatas merupakan contoh dari penggunaan Exception dan
blok try-catch. Kode diatas terdapat exception lebih tepatnya 
ArithmeticException pada pembagian 30/0. Karena hal tersebut 
terjadi karena ArithmeticException maka program akan mecetal 
pada catch pertama. Sehingga output program nya adalah :
task1 is completed
rest of the code...
*/