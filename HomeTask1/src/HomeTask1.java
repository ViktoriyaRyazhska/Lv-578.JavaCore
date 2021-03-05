import java.util.Scanner;

public class HomeTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//First task "Circumference"
		System.out.println("Task 1");
		System.out.print("Please, input circle radius: ");
		double radius = input.nextDouble();
		System.out.println("Circumference = " + String.format("%.2f",(Math.PI * 2 * radius)) + "\n\n");
		//System.out.print("\n\n");
		
		//Second task "Name and address"
		System.out.println("Task 2");
		System.out.println("What is your name?");
		String name = input.next();
		System.out.println("Where do you live, " + name + "?");
		String address = input.next();
		System.out.println(name + ", your address is " + address + ".\n\n");
		
		//Third task "Call price"
		System.out.println("Task 3");
		System.out.println("Please, enter calling rates");
		
		System.out.print("Country 1: ");
		int c1 = input.nextInt();
		System.out.print("Country 2: ");
		int c2 = input.nextInt();
		System.out.print("Country 3: ");
		int c3 = input.nextInt();
		
		System.out.println("Please, enter call durations (in minutes)");
		
		System.out.print("Call 1: ");
		int t1 = input.nextInt();
		System.out.print("Call 2: ");
		int t2 = input.nextInt();
		System.out.print("Call 3: ");
		int t3 = input.nextInt();
		
		System.out.println("First call will cost " + (c1 * t1) + " standart units");
		System.out.println("Second call will cost " + (c2 * t2) + " standart units");
		System.out.println("Third call will cost " + (c3 * t3) + " standart units");
		System.out.println("Total: " + (c1 * t1 + c2 * t2 + c3 * t3) + " standart units");
	}

}
