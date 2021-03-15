import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassWork3 classWork3 = new ClassWork3();
        HomeWork3 homeWork3 = new HomeWork3();
        while (true) {
            System.out.println("What task do you want to check:");
            switch (sc.nextInt()) {
                case 1:
                    task1(sc, classWork3);
                    break;
                case 2:
                    task2(sc, classWork3);
                    break;
                case 3:
                    task3(sc, classWork3);
                    break;
                case 4:
                    task4(classWork3);
                    break;
                case 5:
                    task5(sc, homeWork3);
                    break;
                case 6:
                    task6(sc, homeWork3);
                    break;
                case 7:
                    task7(sc, homeWork3);
                    break;
                case 8:
                    task8(homeWork3);

            }
        }
    }


    private static void task2(Scanner sc, ClassWork3 classWork3) {
        System.out.println("Enter day : ");
        String dayNumber = sc.next();
        System.out.println(classWork3.task2(dayNumber));

    }

    private static void task1(Scanner sc, ClassWork3 classWork3) {
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();
        classWork3.task1(a, b, c);
    }

    private static void task3(Scanner sc, ClassWork3 classWork3) {
        System.out.println("Enter country : ");
        String country = sc.next();
        System.out.println(classWork3.task3(country));

    }

    private static void task4(ClassWork3 classWork3) {
        classWork3.task4();
    }

    private static void task5(Scanner sc, HomeWork3 homeWork3) {
        System.out.println("Enter a: ");
        float a = sc.nextFloat();
        System.out.println("Enter b: ");
        float b = sc.nextFloat();
        System.out.println("Enter c: ");
        float c = sc.nextFloat();
        homeWork3.task5(a, b, c);
    }

    private static void task6(Scanner sc, HomeWork3 homeWork3) {
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();
        homeWork3.task6(a, b, c);
    }

    private static void task7(Scanner sc, HomeWork3 homeWork3) {
        System.out.println("Enter HTTP code : ");
        String code = sc.next();
        System.out.println(homeWork3.task7(code));

    }

    private static void task8(HomeWork3 homeWork3) {
        homeWork3.task8();
    }
}
