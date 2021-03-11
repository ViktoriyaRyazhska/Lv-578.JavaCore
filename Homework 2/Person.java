import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;
    private Scanner scanner = new Scanner(System.in);

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(){
        this.firstName = "First name";
        this.lastName = "Last name";
    }
    public void input(){
        System.out.println("Enter first name: ");
        firstName = scanner.next();
        System.out.println("Enter last name: ");
        lastName = scanner.next();
        System.out.println("Enter birth year: ");
        birthYear = scanner.nextInt();
    }

    public int getAge(){
        return 2021 - birthYear;
    }

    public void output(){
        System.out.println("First name: "+firstName+ "\tLast name: "+ lastName+"\tAge: "+ getAge());
    }

    public void changeName(String fn, String ln){
        firstName = fn;
        lastName = ln;
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

}
