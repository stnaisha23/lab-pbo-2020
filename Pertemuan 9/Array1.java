public class Array1{

	public static void main(String[] ar){
		//deklarasi dan inisialisasi array
		int[] bil_bulat = {3, 5, 7};
		String[] warna = {"merah", "hijau", "kuning"};

		//menampilkan array
		for(int i=0;i<bil_bulat.length;i++){
			System.out.print(bil_bulat[i] +" ");
		}
		System.out.println();

		for(int i=0;i<warna.length;i++){
			System.out.print(warna[i] +" ");
		}
		System.out.println();

		//deklarasi dan inisialisasi array 2D
		int arr[][]={{1,2,3},{3,4,5},{5,6,7}};

		//menampilkan array 2D
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

/* Pada kode diatas merupakan contoh dari penggunaan Array, dimana
di deklarasikan suatu bilangan bulat dengan nilai 3, 5, 7 dan juga warna
yaitu merah, hijau dan kuning. Selanjutnya akan kita tampilkan output
sesuai dengan jumlah elemen dari array tersebut.
Maka hasil outputnya akan seperti ini

3 5 7
merah hijau kuning
1 2 3
3 4 5
5 6 7
*/