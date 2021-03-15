package homework3;

import java.time.Year;
import java.util.Scanner;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	
	
	public Person() {
		super();
	}
	
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public int getAge() {
		int year = Year.now().getValue();
		return year - birthYear;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name.");
		String firstName = sc.nextLine();
		System.out.println("Enter your last name.");
		String lastName = sc.nextLine();
		changeName(firstName, lastName);
		System.out.println("Enter your birthYear.");
		this.birthYear = sc.nextInt();
	}


	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear + "]";
	}
	
	public void output() {
		System.out.println(toString());
	}
	
	public void changeName(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
}


