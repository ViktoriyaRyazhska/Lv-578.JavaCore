import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public Person() {}
	
	public Person(String firstName, String lastName) {
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
		int currYear = Year.now().getValue();
		return currYear - this.birthYear;
	}
	
	public void input(BufferedReader br) throws IOException {
		System.out.println("Hi, there! Please, enter the first name:");
		this.firstName = br.readLine();
		System.out.println("Please, enter the last name:");
		this.lastName = br.readLine();
		System.out.println("Please, enter the year of birth:");
		this.birthYear = Integer.parseInt(br.readLine());
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear + "]";
	}
	
	public void changeName(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person("Jack", "Black");
		Person p4 = new Person("John", "Smith");
		Person p5 = new Person("Kate", "Brown");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		p1.input(br);
		p2.input(br);
		p3.input(br);
		p4.setBirthYear(1977);
		p5.setBirthYear(2001);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p3.getAge());
		p3.changeName("Jasmine", "White");
		System.out.println(p3);
	}
	
}