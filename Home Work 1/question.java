// Output question “How are you?“. Define string variable answer. 
// Read the value answer and output: “You are (answer)". 

import java.util.Scanner;

public class question {

	
	public static void main(String[] args) {
		String answer;
		System.out.println("How are you?");
		Scanner sc = new Scanner(System.in);
		answer = sc.nextLine();
		System.out.println();
		System.out.println("You are" + answer);
	}

}
