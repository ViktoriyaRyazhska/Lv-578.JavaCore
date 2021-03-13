import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));


        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        System.out.println("Enter information about person1");
        System.out.print("Name: ");
        person1.setFirstName(sc.readLine());
        System.out.print("Last name: ");
        person1.setLastName(sc.readLine());
        System.out.print("Birthday: ");
        person1.setBirthYear(Integer.parseInt(sc.readLine()));

        System.out.print("");
        System.out.println("Enter information about person2");
        System.out.print("Name: ");
        person2.setFirstName(sc.readLine());
        System.out.print("Last name: ");
        person2.setLastName(sc.readLine());
        System.out.print("Birthday: ");
        person2.setBirthYear(Integer.parseInt(sc.readLine()));

        person2.output();

        System.out.println("Enter information about person3");
        System.out.print("Name: ");
        person3.setFirstName(sc.readLine());
        System.out.print("Last name: ");
        person3.setLastName(sc.readLine());
        System.out.print("Birthday: ");
        person3.setBirthYear(Integer.parseInt(sc.readLine()));

        System.out.println("Enter information about person4");
        System.out.print("Name: ");
        person4.setFirstName(sc.readLine());
        System.out.print("Last name: ");
        person4.setLastName(sc.readLine());
        System.out.print("Birthday: ");
        person4.setBirthYear(Integer.parseInt(sc.readLine()));

        System.out.println("Enter information about person5");
        System.out.print("Name: ");
        person5.setFirstName(sc.readLine());
        System.out.print("Last name: ");
        person5.setLastName(sc.readLine());
        System.out.print("Birthday: ");
        person5.setBirthYear(Integer.parseInt(sc.readLine()));

    }
}
