package soft;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {

	private String firstName;
	private String lastName;
	private int birthYear;
	public static int count = 0;
	LocalDate currentDate = LocalDate.now();
	private int year = currentDate.getYear();

	public Person() {
		count++;
	}

	public Person(String firstName, String lastName, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		count++;
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		count++;
	}

	public int getAge(){
	return year - birthYear;
	
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

	static Person input() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Person p = new Person();
		System.out.print("First name: ");
		p.setFirstName(scan.next());
		System.out.print("Last name: ");
		p.setLastName(scan.next());
		System.out.print("Birth year: ");
		p.setBirthYear(scan.nextInt());
		return p;
	}

	public String output() {
		return "Person{FirstName: " + firstName + ", LastName: " + lastName + ", BirthYear: " + birthYear + ", Age: "
				+ getAge();
	}

	void changeName(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}

	
}
