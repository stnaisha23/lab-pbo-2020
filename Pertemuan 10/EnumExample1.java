class EnumExample1{
	public enum Season { WINTER, SPRING, SUMMER, FALL}
	public static void main(String[] args) {
		for (Season s : Season.values())
			System.out.println(s);
	}
}

/*
Program diatas adalah contoh penggunaan Enum, Enum ini merupakan
tipe data yang mengandung kumpulan konstans tetap, enum juga dapat
dianggap seperti class, contohnya seperti kode diatas yang memiliki
nilai yang tetap dari Season, yiatu ada winter, spring, summer dan fall. 
Sehingga pada class main class Season tersebut dipanggil objek nya dan 
objek tersebut dicetak, sehingga akan mencetak keempat kata tersebut.
WINTER
SPRING
SUMMER
FALL
*/ 