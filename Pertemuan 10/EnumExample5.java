class EnumExample5{
	enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
SATURDAY}

	public static void main(String args[]){
		Day day=Day.MONDAY;
		switch(day){
			case SUNDAY: System.out.println("sunday");
				break;
			case MONDAY: System.out.println("monday");
				break;
			default:
				System.out.println("other day");
		}
	}
}

/*
Kode diatas juga merupakan contoh dari enum yang memiliki nilai dari
nama-nama hari, karena nama-nama hari sifat nya konstan yang tetap sehingga
termasuk ke dalam enum. Kode diatas terdapat class Enum Day, lalu di class
main objek day dipanggil dengan menyebutkan hari monday. sehingga dengan
menggunakan case untuk menentukan suatu keputusan akan mencetak hari monday,
apabila pada case Sunday sudah benar, maka proses akan berhenti. Dan program
berhenti pada case Monday. Jika tidak kedua nya maka secara default akan
tercetak "other day". Maka output kode diatas mencetak kata Monday.
*/