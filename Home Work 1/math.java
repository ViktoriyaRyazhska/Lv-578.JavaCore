// Define integer variables a and b. Read values a and b from Console and calculate: 
// a + b; a - b; a * b; a / b. 
// Output obtained results.

import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		int a, b;
		float Q, X, Y, Z; 		
		Scanner scan = new Scanner (System.in);
		System.out.println("введіть значення a");
		a = scan.nextInt();
		System.out.println("");
		System.out.println("введіть значення b");
		b = scan.nextInt();
		System.out.println("");
		Q = a + b;
		X = a - b;
		Y = a * b;
		Z = a / b;
		System.out.println("a + b =" + Q);
		System.out.println("a - b =" + X);
		System.out.println("a * b =" + Y);
		System.out.println("a / b =" + Z);
	}

}


