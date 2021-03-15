package HomeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import HomeWork5.Car.YearComparator;
import PracticalTasks5.Employee;

public class App {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		  
		
		// task 1
		System.out.print("Task 1 \nPlease enter the number of month (1-12): ");
		int[] amountDays = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		try {
			int month = Integer.parseInt(bufferedReader.readLine());
			if(1 <= month && month <= 12 ) {
				System.out.println("Amount of days in this month: " + amountDays[month-1]);
			}else {System.out.println("ERROR! You enter not correct number.");}
		}catch (NumberFormatException e) {System.out.println(e);}
	
		// task 2
		System.out.print("\nTask 2 \nPlease enter 10 numbers separated by spaces: ");
		int[] nums = stringNumArrayToInt(bufferedReader.readLine().split(" "));
		if(nums.length < 10) {
			System.out.println("ERROR! You enter so few numbers.");
		}else {
			System.out.println("Your result: " + getResFoTask2(nums));
		}
		
		// task 3.1
		int pos = getPosOfSecondPositive(nums);
		System.out.println(pos > 0 ? "\nTask 3.1 \nPosition of second positive number: " + pos 
				: "\nTask 3.1 \nWe haven't two positive numbers.");
		
		// task 3.2
		int res[] = getMinAndPos(nums);
		System.out.printf("\nTask 3.2 \nMinimum number %d on position %d.", res[0], res[1]);
		
		// task 4
		System.out.println("\nTask 4 \nPlease enter a sequence of numbers separated by \"Enter\": ");
		System.out.println("Product of all entered positive numbers: " 
		+ getArrayListProduct(readSequence(bufferedReader)));
	
		// task 5		
		Car c1 = new Car("Mazda", "CX-9", CarType.SUV, 2017, 2.5);
		Car c2 = new Car("Dodge", "Dart", CarType.Sedan, 2015, 2.4);
		Car c3 = new Car("Infiniti", "QX70", CarType.SUV, 2016, 3.7);
		Car c4 = new Car("Nissan", "Titan", CarType.Pickup, 2018, 5.0);
		
		System.out.print("\nTask 5.1 \nPlease enter a model year of car (2015-2018): ");
		try {
			System.out.print("All cars of a certain model year:\nType\t\tMake Model\tModel year\tcapacity" 
		+ getCarByYear(Integer.parseInt(bufferedReader.readLine()), c1, c2, c3, c4));
		}catch (NumberFormatException e) {
			System.out.println(e);
		}
		
		System.out.print("\n\nTask 5.2 \nCres ordered by the model year:\nType\t\tMake Model\tModel year\tcapacity" 
		+ sortingCarByYear(c1, c2, c3, c4));
	}
	
	private static int[] stringNumArrayToInt(String ... strings) {
		int length = strings.length;
		int[] res = new int[length];
		try {
			for(int i = 0; i < length; i++){
				res[i] = Integer.parseInt(strings[i]);
			}
		}catch (NumberFormatException e) {
			System.out.println(e);}
		return res;
	}
	
	private static boolean isFivePositive(int ... nums) {
		for(int i = 0; i < 5; i++) {
			if(nums[i] < 0) {
				return false;
			}
		}
		return true;
	}
	
	private static int getResFoTask2(int ... nums) {
		int res;
		if(isFivePositive(nums)) {
			res = 0;
			for(int i = 0; i < 5; i++){
				res+=nums[i];
			}
		}else{
			res = 1;
			for(int i = 5; i < 10; i++){
				res*=nums[i];
			}
		}
		return res;
	}
	
	private static int getPosOfSecondPositive(int ... nums) {
		int count = 0;
		for(int i = 0; i < 5; i++){
			if(nums[i] > 0) {
				count++;
			}
			if(count == 2) {
				return i;
			}
		}
		return -1;
	}
	
	private static int[] getMinAndPos(int ... nums) {
		int[] res = new int[]{2147483647, -1};
		for(int i = 0; i < 5; i++){
			if(res[0] > nums[i]) {
				res[0] = nums[i];
				res[1] = i;
			}
		}
		return res;
	}
	
	private static ArrayList<Integer> readSequence(BufferedReader bufferedReader) throws IOException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num = 0;
		while (true) {
			try {
				num = Integer.parseInt(bufferedReader.readLine());
				if(num < 0) {break;}
				list.add(num);
				}catch (NumberFormatException e) {System.out.println(e);}
		  }
		return list;
	}
	
	private static int getArrayListProduct(ArrayList<Integer> list) {
		int product = 1;
		for(int i : list) {
			product*=i;
		}
		return product;
	}
	
	private static ArrayList<Car> getCarByYear(int i, Car ... cars) {
		ArrayList<Car> list = new ArrayList<Car>();
		for(Car c : cars) {
			if(c.getYear() == i) {
				list.add(c);
			}
		}
		return list;
	}
	
	private static ArrayList<Car> sortingCarByYear(Car ... cars) {
		ArrayList<Car> list = new ArrayList<Car>();
		for(Car c : cars) {
			list.add(c);
		}
		YearComparator yearComparator = new YearComparator();
	    list.sort(yearComparator);
		return list;
	}
}
