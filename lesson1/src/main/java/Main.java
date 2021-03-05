import lesson.LessonOne;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        choseTaskFromLessonOne();
    }

    private static void choseTaskFromLessonOne() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Яке завдання Ви хочете запустити ?");
            int chose = sc.nextInt();
            switch (chose) {
                case 1: {
                    LessonOne.task1();
                    break;
                }
                case 2: {
                    LessonOne.task2();
                    break;
                }
                case 3: {
                    LessonOne.task3();
                    break;
                }
                case 4: {
                    LessonOne.task4();
                    break;
                }
                case 5: {
                    LessonOne.task5();
                    break;
                }
                case 6: {
                    LessonOne.task6();
                    break;
                }
                default:
                    System.out.println("Введений неправильний номер завдання");
            }
        }
    }
}

