import java.time.*;
import java.util.Scanner;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	private int currentYear = LocalDate.now().getYear();
	
	public Person() {}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public int getAge() {
		return currentYear - birthYear;
	}
	
	public void changeName(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}
	
	public void input(Scanner userInput) {
		System.out.print("Please enter first name: ");
		firstName = userInput.next();
		System.out.print("Please enter last name: ");
		lastName = userInput.next();
		System.out.print("Please enter birth Year: ");
		birthYear = userInput.nextInt();
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " was born in " + birthYear + ". Now is " + this.getAge() + " years old.";
	}
	
	
}
