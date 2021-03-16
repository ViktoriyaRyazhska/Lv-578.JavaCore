//Create an array of ten integers. Display 
//the biggest of these numbers;
//the sum of positive numbers in the array;
//the amount of negative numbers in the array.
//What values there are more: negative or positive?

package HW5;

import java.util.Arrays;

public class Compare {

	public static void main(String[] args) {
		int[] number = { 4, -4, 6, -8, 5, -7, 9, -2, 3, 10 };
		
		int max = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] > max){
				max = number[i];}
		}
		System.out.println("the max numbers in array is " + max);
		System.out.println("");
		
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] > 0) {sum = sum + number[i];}
		}
		System.out.println("sum of positive numbers in array is " + sum);
		System.out.println("");
		
		int amount = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] < 0) { amount++; }
		}
		System.out.println("the amount of negative numbers in array is = " + amount);
		System.out.println("");
		
		int amppos = 0;
		int ampneg = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] < 0) { amppos++;} 
			else { ampneg++; }
			
			for (amppos > ampneg) System.out.println("There are more positive values in array");
			else ("There are more negative values in array");
		}
	}
}
