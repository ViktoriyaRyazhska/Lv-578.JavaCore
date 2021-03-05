import java.util.Scanner;

public class task3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.print("Enter the cost per minute for Germany: ");
		double c1 = sc.nextDouble();
		System.out.print("How long your call (minuts)? ");
		double t1 = sc.nextDouble();
		System.out.print("Enter the cost per minute for USA: ");
		double c2 = sc.nextDouble();
		System.out.print("How long your call (minuts)? ");
		double t2 = sc.nextDouble();
		System.out.print("Enter the cost per minute for China: ");
		double c3 = sc.nextDouble();
		System.out.print("How long your call (minuts)? ");
		double t3 = sc.nextDouble();
		System.out.println("\n\tReceipt");
		System.out.println("Countries \t Prise");
		System.out.println("----------------------");
		System.out.println("Germany \t " + c1*t1);
		System.out.println("USA \t\t " + c2*t2);
		System.out.println("China \t\t " + c3*t3);
		System.out.println("----------------------");
		System.out.println("\t \t " + (c1*t2+c2*t2+c3*t3));
	}
}
