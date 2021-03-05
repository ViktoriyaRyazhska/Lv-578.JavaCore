import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.next();
        System.out.println("Where do you live? ");
        String address = scanner.next();

        System.out.println("Your name is " + name);
        System.out.println("You live in " + address);
    }
}
