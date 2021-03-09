import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public Person(String firstName, String lastName, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Person() {
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
		Date date = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);		
		return calendar.get(Calendar.YEAR) - birthYear;
	}
	
	public void changeName(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}
	
	public void input() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please, enter information: ");
		
		String[] info = bufferedReader.readLine().split(" ");
		 
	    firstName = info[0];
	    lastName = info[1];
	    birthYear = Integer.parseInt(info[2]);
	}

	public void output() {
		System.out.println(firstName + " " + lastName + " was born in " + birthYear + ", and his age " + getAge() + ".");
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear + "]";
	}
}
