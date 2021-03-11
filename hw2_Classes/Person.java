package com.site;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;

public class Person {

	private String firstName;
	private String lastName;
	private int birthYear;

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

	public Person() {
	}

	public Person(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getAge() {

		LocalDate date = LocalDate.now();
		return date.getYear() - birthYear;
	}

	public void input(BufferedReader br) throws IOException {

		System.out.println("Input First Name:");
		String name = br.readLine();
		firstName = name;

		System.out.println("Input Last Name:");
		String lastN = br.readLine();
		lastName = lastN;

		System.out.println("Input year of birth:");
		int year = Integer.parseInt(br.readLine());
		birthYear = year;
	}

	public void output() {
		System.out.println("Person's name is " + firstName + ", his lastname is " + lastName + " and his age is "
				+ getAge() + "\n");
	}

	public void changeName(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}

}
