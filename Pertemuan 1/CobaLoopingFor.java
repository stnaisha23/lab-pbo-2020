public class CobaLoopingFor
{
	public static void main(String arg[])
	{
		for (int i=0; i<10; i++)
		{
			for (int j=0; j<i+1; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}

/* Program diatas untuk mencoba looping for 
yang digunakan ketika kita melakukan perulangan
dengan jumlah yang sudah diketahui pasti */