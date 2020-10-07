public class CobaBreak
{
	public static void main(String arg[])
	{
		for (int i=0; i<10; i++)
		{
			for (int j=0; j<i+1; j++)
			{
				if(j==5)
					break;
				System.out.print('*');
			}
			System.out.println();
		}
	}
}

/* Program diatas untuk mencoba statemen break
yang menyebabkan suatu kondisi untuk keluar dari
perulangan. break akan mengeluarkan perulangan dari
perulangan tempat statemen break itu berada */