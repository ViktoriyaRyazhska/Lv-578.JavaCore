// �� �������� ����������� ������ y - ������� ������� ���� ���� ���,  ��������� c � ����� ���� ������� 
//(���������, ��, ���������, �������� �� ������� ��� 1901, � �� 1900 ��) �� ������� �� �����

package HW5;

import java.util.Scanner;

public class EdgeNumber {
	
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("Please input a random year"); 
		
		Scanner input = new Scanner(System.in);
		int y = input.nextInt();
		int c;
		c = y / 100; 
	
		System.out.println("Your are in " + c + " century");
	}

}
