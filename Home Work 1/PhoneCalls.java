// Phone calls from three different countries are �1, �2 and �3 standard units per minute. 
// Talks continued t1, t2 and t3 minutes. How much computer will count for each call separately and all talk together? 
// Input all source data from console, make calculations and output to the screen.

import java.util.Scanner;

public class PhoneCalls {

	public static void main(String[] args) {
		 
		float c1, c2, c3, t1, t2, t3;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("������ ���� ������� ������� � �������?");
		c1 = in.nextFloat();
		System.out.println("������ ���� ������� ������� � �������?");
		c2 = in.nextFloat();
		System.out.println("������ ���� ������� ������� � ³����?");
		c3 = in.nextFloat();
		
		System.out.println("��� ������� 1 �� ������� � �������?");
		t1 = in.nextFloat();
		System.out.println("��� ������� 1 �� ������� � �������?");
		t2 = in.nextFloat();
		System.out.println("��� ������� 1 �� ������� � ³����?");
		t3 = in.nextFloat();
		
		System.out.println("������� � ������� ����� " + c1*t1 + "���");
		System.out.println("������� � ������� ����� " + c2*t2 + "���");
		System.out.println("������� � ������� ����� " + c3*t3 + "���");
		System.out.println("�������� �������� ���� ������ " + (c1*t1+c2*t2+c3*t3) + "���");
		
	}

}
