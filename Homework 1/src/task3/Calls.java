package task3;

import java.util.Scanner;

public class Calls {
public static void main(String[] args) {
	double c1 = 23.5;
	double c2 = 18.25;
	double c3 = 20.15;
	
	System.out.println("Duration of your first call: ");
	Scanner sc = new Scanner(System.in);
	int t1 = sc.nextInt();
	System.out.println("Duration of your second call: ");
	int t2 = sc.nextInt();
	System.out.println("Duration of your third call: ");
	int t3 = sc.nextInt();
	
	double firstCallCost = c1 * t1;
	double secondCallCost = c2 * t2;
	double thirdCallCost = c3 * t3;
	
	double sumOfCallsCosts = firstCallCost + secondCallCost + thirdCallCost;
	
	System.out.println("\n Cost of the first call is " + firstCallCost 
			+ "\n Cost of the second call is " + secondCallCost 
			+ "\n Cost of the third call is " + thirdCallCost
			+ "\n\n Sum of all calls cost is " + sumOfCallsCosts);
}
}
