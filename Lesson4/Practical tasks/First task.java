import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int max = 0;
        int count = 0;
        System.out.println("Enter a:");
        a = sc.nextInt();
        System.out.println("Enter b:");
        b = sc.nextInt();
        System.out.println("Enter c:");
        c = sc.nextInt();

        if (a % 2 != 0) {
            count++;
        }
        if (b % 2 != 0) {
            count++;
        }
        if (c % 2 != 0) {
            count++;
        }
        System.out.println(count);
    }
}
