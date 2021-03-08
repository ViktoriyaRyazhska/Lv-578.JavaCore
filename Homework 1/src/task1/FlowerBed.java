package task1;

import java.util.Scanner;

public class FlowerBed {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter flower bed radius.");
		double radius = sc.nextDouble();
		double perimeter = Math.PI * (2 * radius);
		System.out.println("Perimeter of the flower bed is " + perimeter);
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("Area of the flower bed is " + area);
	}
}
