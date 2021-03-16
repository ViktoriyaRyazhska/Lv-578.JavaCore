// За введеним натуральним числом y - номером деякого року нашої ери,  обчислити c – номер його століття 
//(врахувати, що, наприклад, початком ХХ століття був 1901, а не 1900 рік) та вивести на екран

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
