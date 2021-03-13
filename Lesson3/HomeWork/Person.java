import java.util.Calendar;

public class Person {
        private static String firstName;
        private static String lastName;
        private static int birthYear;
        private static int nowYear = Calendar.getInstance().get(Calendar.YEAR);

        public Person(){}

        public Person(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
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

    public int getAge(){
        return nowYear - birthYear;
    }

    public void input(String firstName, String lastName, int birthYear){
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthYear = birthYear;
    }
    public void output(){
        System.out.println("First name: " + firstName + "\nLast name: " + lastName + "\nBirth Year: " + birthYear);
    }
    public void changeName(String fn, String ln){
            firstName = fn;
            lastName = ln;
    }
}
