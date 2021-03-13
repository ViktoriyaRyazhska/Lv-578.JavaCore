import java.util.Scanner;

public class Apply {

	public static void main(String[] args) {
		Scanner userScaner = new Scanner(System.in);
		Person person1 = new Person();
		person1.setFirstName("Andrey");
		person1.setLastName("Prixodko");
		person1.setBirthYear(1997);
		Person person2 = new Person();
		person2.setFirstName("Roma", "Andreevich");
		person2.setBirthYear(1993);
		Person person3 = new Person();
		person3.setFirstName("Anna", "Gert");
		person3.setBirthYear(1991);
		Person person4 = new Person();
		person4.input(userScaner);
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);
	}	
}