package com.site;

//Create an array of ten integers. Display: 

//the biggest of these numbers;
//the sum of positive numbers in the array;
//the amount of negative numbers in the array.

public class Task1 {

	public static void main(String[] args) {

		int[] array = { 23, 43, 84, -41, 24, 74, 5, -56, 0, 1 };

		int maxValue = array[0];
		int sum = 0;
		int amountPositive = 0;
		int amountNegative = 0;
		String message;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}

			if (array[i] > 0) {
				sum = sum + array[i];
			}

			if (array[i] < 0) {
				amountNegative++;
			} else {
				amountPositive++;
			}

		}
		
		if (amountPositive > amountNegative ) {
			message = "More positive numbers";
		} else {
			message = "More negative numbers";
		}

		System.out.println("The biggest number: " + maxValue);
		System.out.println("The sum of positive numbers in the array: " + sum);
		System.out.println("The amount of negative numbers: " + amountNegative);
		System.out.println(message);
	}

}
