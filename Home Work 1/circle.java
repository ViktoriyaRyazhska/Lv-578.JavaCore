// Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius. 
// Output obtained results.

import java.util.Scanner;
import java.math.*;

public class circle {

		public static void main(String[] args) {
			double radius;
			double perimeter; // 2Pr 
			double area; // P * r2
			System.out.println("For calculation pleas enter the radius");
			Scanner sc = new Scanner (System.in);
			radius = sc.nextInt();
			System.out.println();
			System.out.println("Area of the circle is " + 3.14 * Math.pow(radius, 2));
			System.out.println();
			System.out.println("Perimeter of the circle is " + 2 * 3.14 * radius);
			
	}

}
