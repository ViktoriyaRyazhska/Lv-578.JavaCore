import java.util.Scanner;

public class task1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.print("Please enter the radius: ");
	    double radius = sc.nextDouble();
	    double circumference= Math.PI * 2*radius;
	    System.out.println("Perimeter of cicle: " + circumference) ;
	    double area = Math.PI * (radius * radius);
	    System.out.println("Area of cicle: " + area);
	}
}
