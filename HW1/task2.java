import java.util.Scanner;

public class task2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("What is your name, human?");
		String name = sc.nextLine();
		System.out.println("Where are you live, " + name + "?");
		String address = sc.nextLine();
		System.out.println("Hi, " + name + ", from " + address + "!");
	}

}
