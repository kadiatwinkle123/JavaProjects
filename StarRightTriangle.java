import java.io.*;

public class StarRightTriangle {
	
	public static void StarRightTriangle(int n)
	{
		int a, b;

		
		for (a = 0; a <= n; a++) {

			
			for (b =( n-a) ;b >=0; b--) {
				
				System.out.print("* ");
			}

			// end-line
			System.out.println();
		}
	}

	// Driver Function
	public static void main(String args[])
	{
		int k = 5;
		StarRightTriangle(k);
	}
}

* * * * *
* * * *
* * *
* *
*