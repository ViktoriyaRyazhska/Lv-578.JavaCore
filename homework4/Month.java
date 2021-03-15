import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {
	public int getNumberOfDays(int mnum, BufferedReader br) throws NumberFormatException, IOException {
		int[][] month = {{1,31}, {3, 31}, {4, 30}, {5, 31},
				{6,30}, {7, 31}, {8,31}, {9, 30}, {10, 31}, {11, 30},
				{12, 31}};
		if (mnum == 2) {
			System.out.println("Is it a common(1) or a leap(2) year?");
			int year = Integer.parseInt(br.readLine());
			if(year == 1) {
				return 28;
			}
			else if(year == 2) {
				return 29;
			}
		}
		for(int[] m : month) {
			if(m[0] == mnum) {
				return m[1];
			}
		}
		return 0;
	}
	
	public int getSumOrProduct(int[] numbs) {
		int sum = 0;
		int product = 1;
		int positive = 0;
		for(int i=0; i<5; i++) {
			if (numbs[i] > 0) {
				positive++;
				sum+=numbs[i];
			}
		}
		if (positive == 5) {
			return sum;
		}
		for (int i=5; i<numbs.length; i++) {
			product *= numbs[i];
		}
		return product;
	}
	
	public int getSecondPositive(int[] numbs) {
		int counter = 0;
		for(int number: numbs) {
			if(number > 0) {
				counter++;
			}
			if (counter == 2) {
				return number;
			} 
		}
		return 0;
	}
	
	public int[] getMin(int[] numbs) {
		int min = numbs[0];
		int index = 0;
		for(int i=0; i< numbs.length; i++) {
			if(numbs[i] < min) {
				min = numbs[i];
				index = i;
			}
		}
		int[] res = {min, index};
		return res;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Month cls = new Month();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter the number of month:");
		int mnum = Integer.parseInt(br.readLine());
		System.out.println("The number of days in this month is " + cls.getNumberOfDays(mnum, br));
		
		
		int[] numbers = new int[10];
		for (int i=0; i<numbers.length; i++) {
			System.out.println("Please, enter a number:");
			numbers[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(cls.getSumOrProduct(numbers));
		
		
		int[] new_numbers = new int[5];
		int product = 1;
		for (int i=0; i<new_numbers.length; i++) {
			System.out.println("Please, enter a number:");
			new_numbers[i] = Integer.parseInt(br.readLine());
			if(new_numbers[i] < 0) {
				break;
			}
			if((new_numbers[i] % 2) == 0) {
				product *= new_numbers[i];
			}
		}
		System.out.println("The product is " + product);
		System.out.println("The second positive number is " + cls.getSecondPositive(new_numbers));
		System.out.println("The Minimum value is " + cls.getMin(new_numbers)[0]);
		System.out.println("Its index is " + cls.getMin(new_numbers)[1]);
		
	}

}
