package com.site;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Please, input information about person №" + i + "\n" );
			Person person = new Person();
			person.input();
			person.output();
		}
	}

}
