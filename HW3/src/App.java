import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < 6; i++){
		    System.out.printf("\nPlease enter information about person %d. First name, last name and birth year, for example \"Vasia Pupkin 1990\".\n", i);
		    Person person = new Person();
			person.input();
			person.output();
		}
	}
}
