public class AwalanAkhiranString {
	public static void main(String args[]) {
		String str1 = "Informatika Universitas Syiah Kuala";
		System.out.println(str1.startsWith("Inf"));
		System.out.println(str1.endsWith("kuala"));
		System.out.println(str1.startsWith("Inf",1));
		System.out.println(str1.startsWith("Inf",2));
		System.out.println(str1.startsWith("Inf",3));
	}
}

/* Program diatas untuk menentukan awalan atau akhiran dari
suatu kata. Dapat kita lihat Kalimat diatas menentukan apakah
kata awal atau akhir tersebut true atau false */