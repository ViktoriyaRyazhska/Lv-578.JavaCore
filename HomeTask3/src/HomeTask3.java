
public class HomeTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		person1.setFirstName("Jack");
		person1.setLastName("Black");
		person1.setBirthYear(1990);
		
		Person person2 = new Person("Bill", "White");
		person2.setBirthYear(1992);
		
		Person person3 = new Person("Kate", "Green");
		person3.setBirthYear(1988);
		
		Person person4 = new Person("Jim", "Grey");
		person4.setBirthYear(1988);
		
		Person person5 = new Person();
		person5.input();
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);
		System.out.println(person5);
	}

}
