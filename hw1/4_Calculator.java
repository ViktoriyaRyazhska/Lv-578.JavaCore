package com.site;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How are you?");
		String answer = scan.nextLine();
		System.out.println("You are " + answer);
		System.out.println();

		System.out.println("Input value: \"a\"");
		int a = scan.nextInt();
		System.out.println("Input value: \"b\"");
		int b = scan.nextInt();
		
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));

		
	}

}
