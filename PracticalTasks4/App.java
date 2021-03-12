package PracticalTasks4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import PracticalTasks3.Employee;

public class App {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		// task 1
		System.out.print("Task 1 \nPlease enter a sequence of numbers separated by spaces: ");
		String[] nums = bufferedReader.readLine().split(" ");
		System.out.printf("You entered %d odd numbers.", oddNumbers(nums));
		
		// task 2
		System.out.print("\n\nTask 2 \nPlease enter number of day: ");
		try {
		int numbOfDay = Integer.parseInt(bufferedReader.readLine());
		LocalDays[] localDays = LocalDays.values();
		for (LocalDays d : localDays) {System.out.print(d.getDay(numbOfDay) + " ");}
		}catch (NumberFormatException e) {System.out.println(e);}
        
        //task 3
        System.out.print("\n\nTask 3 \nPlease enter the country (for example \"Oman\"): ");
        String country = bufferedReader.readLine();
        Continent continent = continentOfCountry(country);
        System.out.print(continent != null ? 
        		(country + " situated at " + continentOfCountry(country) + ".") : "Can't find this country.");
        
        //task 4
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product("Product-1", 37, 74));
		products.add(new Product("Product-2", 16, 82));
		products.add(new Product("Product-3", 88, 39));
		products.add(new Product("Product-4", 72, 24));
		
		Product mostExpensive = getMostExpensive(new ArrayList<>(products));
		Product biggestQuantity = getBiggestQuantity(new ArrayList<>(products));
		
		System.out.printf("\n\nTask 4 \nMost expensive product %s cost %.2f.", mostExpensive.getName(), mostExpensive.getPrice());
		System.out.printf("\nThe biggest quantity of %s.", biggestQuantity.getName());
         
	}
	
	private static int oddNumbers(String ... nums) {
		int count = 0;
		try {
			for(String num :  nums) {
				if (Integer.parseInt(num) % 2 != 0) { 
					count++;
				}
			}
		}catch (NumberFormatException e) {System.out.println(e);}
		return count;
	}
	
	private static Continent continentOfCountry(String string) {
		 for (Continent c : Continent.values()) {
	    	   for(String s : c.getCountries()) {
	    		   if(s.equalsIgnoreCase(string)) {
	    			   return c;   
	    		   }
	    	   } 
	       }
		return null;
	}
	
	private static Product getMostExpensive(ArrayList<Product> products) {		
		while(products.size() > 1) {
			if(products.get(0).getPrice() > products.get(1).getPrice()){
				products.remove(1);
			}else{
				products.remove(0);
			}
		}
		return products.get(0);
	}
	
	private static Product getBiggestQuantity(ArrayList<Product> products) {		
		while(products.size() > 1) {
			if(products.get(0).getQuantity() > products.get(1).getQuantity()){
				products.remove(1);
			}else{
				products.remove(0);
			}
		}
		return products.get(0);
	}
}
