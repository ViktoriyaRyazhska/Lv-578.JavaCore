import java.util.Scanner;

public class HomeWork2 {
    private static final Scanner sc = new Scanner(System.in);

    public void task1() {

        System.out.println(" First name : ");
        String firstName = sc.nextLine();
        System.out.println(" Last name : ");
        String lastName = sc.nextLine();
        System.out.println(" Birthday year : ");
        int birthYear = sc.nextInt();
        Person p1 = new Person(firstName, lastName, birthYear);
        System.out.println();
        Person p2 = new Person("Vasil", "Sus", 1997);
        Person p3 = new Person("Oleh", "Sus", 1998);
        Person p4 = new Person("Jora", "Sus", 1999);
        Person p5 = new Person("Bodia", "Sus", 2000);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);


    }


}
