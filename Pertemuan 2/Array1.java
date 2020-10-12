public class Array1 {
	public static void main(String args[]) {
	int nilai[]=new int[3];
		nilai[0]=70;
		nilai[1]=80;
		nilai[2]=65;
		double ratarata=0.0;

		for(int i=0; i<nilai.length; i++)
			ratarata+=nilai[i];

		ratarata/=nilai.length;
		System.out.println("Nilai rata-rata = " + ratarata);
	}
}

/* Program diatas untuk mencoba mencari nilai rata-rata dengan
 menggunakan array. Array memungkinkan untuk menyimpan data maupun
 referensi objek dalam jumlah banyak dan terindeks. Dan hasil dari
 Program diatas nilai rata-rata nya adalah 71.66 */