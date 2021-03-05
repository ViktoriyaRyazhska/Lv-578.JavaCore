import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter standard unit per minute for call №1");
        int c1 = scanner.nextInt();
        System.out.println("How long did call №1 last");
        int t1 = scanner.nextInt();

        System.out.println("Enter standard unit per minute for call №2");
        int c2 = scanner.nextInt();
        System.out.println("How long did call №2 last");
        int t2 = scanner.nextInt();

        System.out.println("Enter standard unit per minute for call №3");
        int c3 = scanner.nextInt();
        System.out.println("How long did call №3 last");
        int t3 = scanner.nextInt();

        System.out.println();
        int result1 = c1 * t1;
        int result2 = c2 * t2;
        int result3 = c3 * t3;

        System.out.println("Call №1: " + result1);
        System.out.println("Call №2: " + result2);
        System.out.println("Call №3: " + result3);
        System.out.println();
        System.out.println("Total result for all talks: " + (result1 + result2 + result3));


    }
}
