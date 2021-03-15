import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;


    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
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
        return LocalDate.now().getYear() - birthYear;
    }
    public void changeName (String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", age=" + getAge() +
                '}';
    }
}
