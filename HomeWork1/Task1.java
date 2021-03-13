import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите радиус: ");
	      float radius = scanner.nextFloat();	     
	      double area = Math.PI * (radius * radius);
	      System.out.println("Площадь круга равна: " + area);
	      double circumference= Math.PI * 2*radius;
	      System.out.println("Длина окружности равна: " + circumference);

	}

}
