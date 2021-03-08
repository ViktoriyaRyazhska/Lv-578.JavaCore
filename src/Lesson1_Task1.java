import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int Sum = 0;
        System.out.println("Enter first number:");
        int a = scan.nextInt();
        System.out.println("Enter second number:");
        int b = scan.nextInt();

        System.out.println("Enter you action\n1.Plus\n2.Minus\n3.Multiplication\n4.Division");
        int actions = scan.nextInt();

        switch (actions){
            case 1:
                Sum = a + b;
                break;
            case 2:
                Sum = a - b;
                break;
            case 3:
                Sum = a * b;
                break;
            case 4:
                Sum = a / b;
                break;
            default:
                Sum = 0;
                break;
        }
        System.out.println("You result:" + Sum);
    }
}
