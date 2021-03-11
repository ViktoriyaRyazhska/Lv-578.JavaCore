package HomeWork1;

import java.util.Scanner;

public class task2 {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name, human?");
		String name = sc.nextLine();
		System.out.println("Where are you live, " + name + "?");
		String address = sc.nextLine();
		System.out.println("Hi, " + name + ", from " + address + "!");
	}

}
