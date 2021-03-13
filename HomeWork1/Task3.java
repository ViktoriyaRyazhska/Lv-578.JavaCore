import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.println("Enter standart per minute for c1:");
		int c1 = scaner.nextInt();
		System.out.println("Enter standart per minute for c2:");
		int c2 = scaner.nextInt();
		System.out.println("Enter standart per minute for c3:");
		int c3 = scaner.nextInt();
		System.out.println("Hoaw long did u call to t1?:");
		int t1 = scaner.nextInt();
		System.out.println("Hoaw long did u call to t2?:");
		int t2 = scaner.nextInt();
		System.out.println("Hoaw long did u call to t3?:");
		int t3 = scaner.nextInt();
		
		int result1,result2,result3;
		result1 = c1*t1;
		result2 = c2*t2;
		result3 = c3*t3;
		System.out.println("Your result for call ¹1: " + result1);
		System.out.println("Your result for call ¹1: " + result2);
		System.out.println("Your result for call ¹1: " + result3);
		int totalresult = (result1+result2+result3);
		System.out.println("Your total result for calls: " + totalresult);
		
	}

}
