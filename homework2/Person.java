import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;

public class Person {
	private String firstName = null;
	private String lastName = null;
	private int birthYear;
	
	public Person() throws IOException {
		this.input();
	}
	
	public Person(String firstName, String lastName) throws IOException {
		this.firstName = firstName;
		this.lastName = lastName;
		this.input();
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
	
	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Hi, there! ");
		if(firstName == null) {
			System.out.println("Please, enter the first name:");
			this.firstName = br.readLine();
			System.out.println("Please, enter the last name:");
			this.lastName = br.readLine();
		}
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
		System.out.println(p3.getAge());
		p3.changeName("Jasmine", "White");
		System.out.println(p3);
	}
	
}