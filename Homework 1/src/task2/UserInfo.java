package task2;

import java.util.Scanner;

public class UserInfo {
	public static void main (String[] args){
		System.out.println("What is your name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("What is your address, " + name + "?");
	    String address = sc.nextLine();
	    System.out.println("Name: " + name + "\tAddress: " + address);
	}

}
