import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.println("What is your name? :");
		String name = scaner.next();
		System.out.println("Where are u live " + name);
		String adress = scaner.next();
		System.out.println(name);
		System.out.println(adress);
	}
}
