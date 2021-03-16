import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfWeek;
        numberOfWeek = sc.nextInt();

        switch (numberOfWeek) {
            case 1:
                System.out.println("Monday");
                System.out.println("월요일"); //korean
                System.out.println("सोमवार"); //hindi
                break;
            case 2:
                System.out.println("Tuesday");
                System.out.println("화요일"); //korean
                System.out.println("मंगलवार"); //hindi
                break;
            case 3:
                System.out.println("Wednesday");
                System.out.println("수요일"); //korean
                System.out.println("बुधवार"); //hindi
                break;
            case 4:
                System.out.println("Thursday");
                System.out.println("목요일"); //korean
                System.out.println("गुरूवार"); //hindi
            case 5:
                System.out.println("Friday");
                System.out.println("금요일"); //korean
                System.out.println("शुक्रवार"); //hindi
                break;
            case 6:
                System.out.println("Saturday");
                System.out.println("토요일"); //korean
                System.out.println("शनिवार"); //hindi
                break;
            case 7:
                System.out.println("Sunday");
                System.out.println("일요일"); //korean
                System.out.println("रविवार"); //hindi
                break;
        }
    }
}
