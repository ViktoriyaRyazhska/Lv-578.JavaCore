import java.util.Scanner;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	int currentYear = 2021;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setFirstName(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
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

	public String toString() {
		return firstName + " " + lastName + " was born in " + birthYear + ". Now is " + this.getAge() + " years old.";
	}
	public int getAge() {
		return currentYear - birthYear; 
	}
	public void input(Scanner userScaner) {
		
		System.out.println("Set your Name: ");
		firstName = userScaner.next();
		System.out.println("Set your LastName: ");
		lastName = userScaner.next();
		System.out.println("Set your birth: ");
		birthYear = userScaner.nextInt();
	}
	
	
}