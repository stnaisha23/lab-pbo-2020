public class prak3Lat2 {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		int c = 0;

		c = a + b;
		System.out.println("c = a + b = " + c );

		c += a ;
		System.out.println("c += a = " + c );

		c -= a ;
		System.out.println("c -= a = " + c );

		c *= a ;
		System.out.println("c *= a = " + c );

		a = 10;
		c = 15;
		c /= a ;
		System.out.println("c /= a = " + c );

		a = 10;
		c = 15;
		c %= a ;
		System.out.println("c %= a = " + c );

		c <<= 2 ;
		System.out.println("c <<= 2 = " + c );

		c >>= 2 ;
		System.out.println("c >>= 2 = " + c );

		c >>= 2 ;
		System.out.println("c >>= 2 = " + c );

		c &= a ;
		System.out.println("c &= a = " + c );

		c ^= a ;
		System.out.println("c ^= a = " + c );

		c |= a ;
		System.out.println("c |= a = " + c );
	}
}

/* Program diatas adalah untuk melakukan proses
operator Assignment yang digunakan untuk mengisi
nilai ke dalam variabel tertentu */