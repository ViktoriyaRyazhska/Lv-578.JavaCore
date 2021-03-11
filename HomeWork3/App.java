package HomeWork3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 1; i < 6; i++){
		    System.out.printf("\nPlease enter information about person %d. First name, last name and birth year, for example \"Vasia Pupkin 1990\".\n", i);
		    Person person = new Person();
			person.input(bufferedReader);
			person.output();
		}
	}
}
