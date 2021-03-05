import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the flower bed: ");
        float radius = scanner.nextFloat();

        System.out.printf("Perimeter: %.2f\n", radius * 2 * Math.PI);
        System.out.printf("Array: %.2f", radius * radius * Math.PI);
    }
}