// Define String variables name and address. 
// Output question "What is your name?" 
// Read the value name and output next question: “Where are you live, (name)?". 
// Read address and write whole information. 

import java.util.Scanner;

public class questions {

	public static void main(String[] args) {
		String name, adress;
		
		System.out.println("What is your name? ");
		Scanner n = new Scanner (System.in);
		name = n.next();
		System.out.println("Where are you live? " + name);
		Scanner a = new Scanner (System.in);
		adress = a.next();
		System.out.println(name + " lives in " + adress);
	}

}