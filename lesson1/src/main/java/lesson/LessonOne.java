package lesson;

import java.util.Scanner;

public class LessonOne {
    private static final Scanner sc = new Scanner(System.in);

    public static void task1() {

        System.out.println("Name : ");
        String name = sc.nextLine();
        System.out.println("Age : ");
        int age = sc.nextInt();

        System.out.println();
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void task2() {

        System.out.println("How are you?");
        String answer = sc.nextLine();
        System.out.println("You are " + answer);
    }

    public static void task3() {

        int a;
        int b;
        System.out.println("Ведіть число a = ");
        a = sc.nextInt();
        System.out.println("Ведіть число b = ");
        b = sc.nextInt();
        System.out.println();
        System.out.println("a + b =" + (a + b));
        System.out.println("a * b =" + (a * b));
        System.out.println("a - b =" + (a - b));
        System.out.println("a / b =" + (a / b));
    }

    public static void task4() {

        double k;
        System.out.println("Введіть радіус вашого квітника");
        k = sc.nextDouble();
        double area = Math.PI * (k * k);
        double perimeter = Math.PI * 2 * k;
        System.out.println("Площа вашого квітника = " + (area));
        System.out.println("Периметр вашого квітника = " + (perimeter));
    }

    public static void task5() {

        System.out.println("Як Вас звати : ");
        String name = sc.nextLine();
        System.out.println((name) + ", де ви проживаєте? ");
        String home = sc.nextLine();
        System.out.println((name) + "проживає за адресою" + (home));
    }

    public static void task6() {
        double c1 = 1.5;
        double c2 = 2.5;
        double c3 = 4.5;
        int t1 = 3;
        int t2 = 5;
        int t3 = 9;
        double price1 = (c1 * t1);
        double price2 = (c2 * t2);
        double price3 = (c3 * t3);
        double priceAll = (c1 * t1 + c2 * t2 + c3 * t3);
        System.out.println("Ціна за першу розмову " + (price1));
        System.out.println("Ціна за другу розмову " + (price2));
        System.out.println("Ціна за третю розмову " + (price3));
        System.out.println("Загальна ціна за усі розмови " + (priceAll));
    }
}
