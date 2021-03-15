package soft;

import java.time.LocalDate;

public class Apply {
	public static void main(String[] args) {
	        Person p1 = new Person();
	        Person p2 = new Person("Tamara","Lib");
	        Person p3 = new Person("Julia","Melska");
	        Person p4 = new Person("Sasha","Pasichnyk");
	        Person p5 = new Person("Valentyna", "Lykhodiy");
	        LocalDate currentDate = LocalDate.now();

	        p1.input();
	        p2.input();
	        p3.input();
	        p4.input();
	        p5.input();

	        p1.output();
	        p2.output();
	        p3.output();
	        p4.output();
	        p5.output();

	        p1.changeName("Bogdan","Boyko");
	        p1.output();

		                
		        }
}
