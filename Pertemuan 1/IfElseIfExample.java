public class IfElseIfExample {
	public static void main(String[] args) {
		int marks=65;
	if(marks<50){
	System.out.println("fail");
	}
	else if(marks>=50 && marks<60){
		System.out.println("D grade");
		}
		else if(marks>=60 && marks<70){
			System.out.println("C grade");
			}
			else if(marks>=70 && marks<80){
			System.out.println("B grade");
			}
			else if(marks>=80 && marks<90){
			System.out.println("A grade");
			}else if(marks>=90 && marks<100){
			System.out.println("A+ grade");
			}else{
			System.out.println("Invalid!");
		}
	}
}

/* Program diatas untuk seleksi if else if digunakan 
ketika Jika kondisi pertama tidak terpenuhi atau bernilai 
false, maka kode program akan lanjut ke kondisi IF di bawahnya. 
Jika ternyata tidak juga terpenuhi, akan lanjut lagi ke kondisi 
IF di bawahnya, dst hingga blok ELSE terakhir atau terdapat 
kondisi IF yang bernilai true */