package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int x = sc.nextInt();
        System.out.println("Введите число 2: ");
        int y = sc.nextInt();
        System.out.println("Выберите что нужно сделать: \n1.Плюс\n2.Минус\n3.Умножение\n4.Деление\n" );
        int actions = sc.nextInt();
        System.out.println("Введите ваше возраст: ");
        int age = sc.nextInt();
        System.out.println("Введите ваше имя: ");
        sc.nextLine();
        String name = sc.nextLine();
        switch(actions){
            case 1:
                result = x + y;
                break;
            case 2:
                result = x - y;
                break;
            case 3:
                result = x * y;
                break;
            case 4:
                result = x / y;
                break;
            default:
                result = 0;
        }
        System.out.println("Ваше имя = "+name+"\nВаш возраст = "+age+"\nВаше число = "+result);
    }
}
