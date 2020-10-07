public class CobaLoopingWhile
{
	public static void main(String arg[])
	{
		int i=0;

		while (i<10)
		{
			int j=0;
			while (j<i+1)
			{
				System.out.print('*');
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

/* Program diatas untuk mencoba looping while
yang digunakan saat kita melakukan perulangan
dengan jumlah yang belum pasti diketahui. while
akan dikerjakan setelah pengecekan kondisi pada 
while true */