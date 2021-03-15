package PracticalTasks5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import PracticalTasks5.Employee.SalaryComparator;

public class App {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		// task 1
		System.out.print("Task 1 \nPlease enter a sequence of numbers separated by spaces: ");
		int[] nums = stringNumArrayToInt(bufferedReader.readLine().split(" "));
		//1.1
		System.out.println("The biggest of numbers: " + getBiggestNum(nums));
		//1.2
		System.out.println("The sum of positive numbers: " + getSumOfPositive(nums));
		//1.3
		System.out.println("The amount of negative numbers: " + getAmountOfNegative(nums)); 
		
		// task 2
		Employee e1 = new Employee("Tyberiy Bohus", 1, 8000);
		Employee e2 = new Employee("Ofeliya Semen", 2, 8500);
		Employee e3 = new Employee("Gleb Anton", 3, 7500);
		Employee e4 = new Employee("Maks Anatoli", 1, 8800);
		Employee e5 = new Employee("Taisia Lyuba", 2, 8600);
		
		//2.1
		System.out.print("\nTask 2 \nPlease enter department number (1-3): ");
		try {
			System.out.println("\nAll employees of a certain department: \nname \t\tdepartment number \tsalary" 
		+ getEmployeesByDepartment(Integer.parseInt(bufferedReader.readLine()), e1, e2, e3, e4, e5));
		}catch (NumberFormatException e) {
			System.out.println(e);
		}
		
		//2.2
		System.out.println("\nSorting workers by salary: \nname \t\tdepartment number \tsalary" 
		+ sortingEmployeeBySalary(e1, e2, e3, e4, e5)); 
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
	
	
	private static int getBiggestNum(int ... nums) {
		int max = -2147483648;
		for(int num : nums) {
			if(num > max) {
				max = num;
				}
			}		
		return max;
	}
	
	private static int getSumOfPositive(int ... nums) {
		int sum = 0;
		for(int num : nums) {
			if(num > 0) {
				sum+=num;
				}
			}		
		return sum;
	}
	
	private static int getAmountOfNegative(int ... nums) {
		int amount = 0;
		for(int num : nums) {
			if(num < 0) {
				amount++;
				}
			}		
		return amount;
	}
	
	private static ArrayList<Employee> getEmployeesByDepartment(int i, Employee ... employees) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		for(Employee e : employees) {
			if(e.getDepartment_number() == i) {
				list.add(e);
			}
		}
		return list;
	}
	
	private static ArrayList<Employee> sortingEmployeeBySalary(Employee ... employees) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		for(Employee e : employees) {
			list.add(e);
		}
		SalaryComparator salaryComparator = new SalaryComparator();
	    list.sort(salaryComparator);
		return list;
	}
}
