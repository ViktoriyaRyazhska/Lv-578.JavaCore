import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork3 {
    public void task5(float a, float b, float c) {
        if (5 < a && a > -5) {
            System.out.println("a belong to the range ");
        }
        if (5 < b && b > -5) {
            System.out.println("b belong to the range ");
        }
        if (5 < c && c > -5) {
            System.out.println("c belong to the range ");
        }
    }

    public void task6(int a, int b, int c) {
        if (a > b & a > c) {
            System.out.println("a max integer numbers ");
        } else if (b > a & b > c) {
            System.out.println("b max integer numbers ");
        } else if (c > a & c > b) {
            System.out.println("c max integer numbers ");

        }
        if (a < b & a < c) {
            System.out.println("a min integer numbers ");
        } else if (b < a & b < c) {
            System.out.println("b min integer numbers ");
        } else if (c < a & c < b) {
            System.out.println("c min integer numbers ");
        }
    }

    public String task7(String code) {
        switch (code) {
            case "400":
                return HTTP.BAD_REQUEST.toString();
            case "401":
                return HTTP.UNAUTHORIZED.toString();
            case "402":
                return HTTP.PAYMENT_REQUIRED.toString();
            case "403":
                return HTTP.FORBIDDEN.toString();
            case "404":
                return HTTP.NOT_FOUND.toString();
            case "405":
                return HTTP.METHOD_NOT_ALLOWED.toString();
            default:
                return "Wrong code";

        }
    }

    public void task8() {
        List<Dog> dogs = new ArrayList<>();
        Dog oldestDog;
        dogs.add(new Dog("Jack", Breed.LABRADOR, 4));
        dogs.add(new Dog("Ben", Breed.LABRADOR, 2));
        dogs.add(new Dog("Ben", Breed.MASTIFF, 3));
        dogs.add(new Dog("Lily", Breed.BEAGLE, 5));
        dogs.add(new Dog("Lily", Breed.LABRADOR, 1));
        oldestDog = dogs.get(0);
        for (Dog dog : dogs) {
            if (oldestDog.getAge() < dog.getAge()) {
                oldestDog = dog;
            }
        }
        for (int i = 0; i < dogs.size() - 1; i++) {
            String name = dogs.get(i).getName();
            boolean repeated = false;
            for (int j = i + 1; j < dogs.size(); j++) {
                if (dogs.get(j).getName().equals(name)) {
                    System.out.println("Name " + name + " repeated");
                    repeated = true ;
                    break;
                }
            }
            if (!repeated){
                System.out.println("Name " + name + " is not repeated");
            }
        }
        System.out.println("The oldest dog is " + oldestDog);
    }

}

