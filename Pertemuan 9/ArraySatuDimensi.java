import java.util.Arrays;

public class ArraySatuDimensi {

	public static void main(String[] args) {

		System.out.println("Array of primitives");
		int[] ints = {9, 6, 3};
		Arrays.sort(ints);
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}

		System.out.println("Array of strings");
		String[] strings = {"Merah", "Hijau", "Biru"};
		Arrays.sort(strings);
		for (String color : strings) {
			System.out.println(color);
		}

		System.out.println("Setting an initial size");
		int[] sized = new int[10];
		for (int i = 0; i < sized.length; i++) {
			sized[i] = i * 100;
		}
		for (int value : sized) {
			System.out.println(value);
		}

		System.out.println("Copying an array");
		int[] copied = new int[5];
		System.arraycopy(sized, 5, copied, 0, 5);
		for (int value : copied) {
			System.out.println(value);
		}
	}
}

/*
Array satu dimensi adalah array yang paling umum digunakan. Array
berupa data yang menyimpan elemen yang sama berbasis indeks yang dimulai
dengan indeks 0 dan elemen terakhirnya adalah n-1.
Kode diatas akan mencetak nilai 9, 6 dan 3 sesuai dengan urutan array nya.
dimulai dari indeks 0 bernilai 9, indek 1 bernilai 6 dan indeks 2 bernilai 3.
Begitu juga dengan array yang mengandung String akan mencetak warna Merah,
hijau, dan biru. Begitu juga dengan contoh kode dibawahnya lagi

*/