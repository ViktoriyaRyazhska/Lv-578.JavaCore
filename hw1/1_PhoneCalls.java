	/*
	 * Phone calls from three different countries are с1, с2 and с3 standard units per minute. 
	 * Talks continued t1, t2 and t3 minutes. How much computer will count for each call separately and all talk together? 
	 * Input all source data from console, make calculations and output to the screen. 
	 * 
	 */

package com.site;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("До скількох країн здійснювали дзвінки?");
		int countOfCountry = Integer.parseInt(br.readLine());
		
		String[] country = new String[countOfCountry];
		for (int i = 0; i < countOfCountry; i++) {
			System.out.println("Введіть назву країни під номером " + (i+1));
			String CountryTemp = br.readLine();
			country[i] = CountryTemp;		
		}
		
		int[] cost = new int[countOfCountry];
		for (int i = 0; i < countOfCountry; i++) {
			System.out.println("Введіть вартість хвилини розмови в країну: " + country[i]);
			int costTemp = Integer.parseInt(br.readLine());
			cost[i] = costTemp;
		}
		
		
		int[] duration = new int[countOfCountry];
		for (int i = 0; i < countOfCountry; i++) {
			System.out.println("Введіть кількість хвилин розмов в країну: " + country[i]);
			int durationTemp = Integer.parseInt(br.readLine());
			duration[i] = durationTemp;
		}
		
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%s%-20s%-10s%-10s%-10s%n", "|", "Країна","| Вартість хв","| Кі-ть хв","| Вартість розмов |");
		System.out.println("--------------------------------------------------------------");
		
		int sum = 0; 
		for (int i = 0; i < countOfCountry; i++) {
			
			System.out.printf("%s%-20s", "|",  country[i]) ;
			System.out.printf("%s%12d", "|", cost[i]);			
			System.out.printf("%s%9d", "|", duration[i]);			
			System.out.printf("%s%17d%s%n", "|", (duration[i] * cost[i]), "|");
			sum += (duration[i] * cost[i]);
			
		}
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%s%s%54d%s%n", "|", "Всього:", sum, "|");
		System.out.println("--------------------------------------------------------------");

	}

}
