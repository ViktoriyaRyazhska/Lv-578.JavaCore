import java.util.Scanner;

public class Homework1{
    public static void main(String[] args) {
        double pi = 3.14;
        double area;
        double perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = sc.nextDouble();
        area = pi * radius * radius;
        perimeter = 2 * pi * radius;
        System.out.println("Your area:" + area + "Your perimeter:" + perimeter);

    }
}
