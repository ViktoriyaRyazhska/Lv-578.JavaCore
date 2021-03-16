package com.site;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinMax {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[3];
		int maxValue = array[0];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the number (int): ");
			int num = Integer.parseInt(br.readLine());
			array[i] = num;
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}

		int minValue = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}

		System.out.println("MaxValue: " + maxValue + " MinValue: " + minValue);
	}

}