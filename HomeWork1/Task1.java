import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������� ������: ");
	      float radius = scanner.nextFloat();	     
	      double area = Math.PI * (radius * radius);
	      System.out.println("������� ����� �����: " + area);
	      double circumference= Math.PI * 2*radius;
	      System.out.println("����� ���������� �����: " + circumference);

	}

}
