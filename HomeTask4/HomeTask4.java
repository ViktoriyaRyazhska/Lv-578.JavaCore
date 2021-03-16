import java.util.*;

class Number {
	private int value;
	private int position;
	
	public Number() {}
	
	public Number(int value, int position) {
		this.value = value;
		this.position = position;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
}

public class HomeTask4 {
	
	public static int sumFirstFive(int[] array) {
		int sum = 0;
		for (int i = 0; i < 5; i++) sum += array[i];
		return sum;
	}
	
	public static int prodLastFive(int[] array) {
		int prod = 1;
		for (int i = array.length - 1; i >= array.length - 5; i--) prod *= array[i];
		return prod;
	}
	
	public static int secondPositive(int[] array) {
		boolean checker = false;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] > 0) && checker) return ++i;
			if ((array[i] > 0) && !checker) checker = !checker;
		}
		return 0;
	}
	
	public static Number minAndPosition(int[] array) {
		Number min = new Number(array[0], 1);
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min.getValue()) {
				min.setValue(array[i]);
				min.setPosition(i + 1);
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int task2Numbers[] = new int[10];
		int task3Numbers[] = new int[5];
		boolean checker;
		int task4Number = 0;
		int task4Product = 1;
		Car cars[] = new Car[4];
		int year;
		int i;
		
		System.out.println("Task 1. Days in month");
		System.out.print("Enter the number of month: ");
		int monthIndex = userInput.nextInt();
		System.out.println("There are " + month[monthIndex - 1] + " days in this month. \n\n");
		
		System.out.println("Task 2. Sum or product");
		checker = true;
		for (i = 0; i < task2Numbers.length; i++) {
			System.out.print("Enter " + (i +1) + " number: ");
			task2Numbers[i] = userInput.nextInt();
			if ((i < 5) && (task2Numbers[i] < 0)) checker = !checker;
		}
		if (checker) {
			System.out.println("Sum of first 5 numbers is " + sumFirstFive(task2Numbers) + "\n\n");
		} else {
			System.out.println("Product of last 5 numbers is " + prodLastFive(task2Numbers) + "\n\n");
		}
		
		System.out.println("Task3. Positions");
		for (i = 0; i < task3Numbers.length; i++) {
			System.out.print("Enter " + (i +1) + " number: ");
			task3Numbers[i] = userInput.nextInt();
		}
		System.out.println(secondPositive(task3Numbers) != 0 ? "Second positive number is at index " + secondPositive(task3Numbers) : "There is no second positive number!");
		System.out.println("Minimum number is " + minAndPosition(task3Numbers).getValue() + ", it's position is " + minAndPosition(task3Numbers).getPosition() + "\n\n");
		
		System.out.println("Task 4. Conditional input");
		while (task4Number >= 0) {
			System.out.print("Enter next number: ");
			task4Number = userInput.nextInt();
			if ((task4Number % 2 == 0) && (task4Number >= 0)) task4Product *= task4Number; 
		}
		System.out.println(task4Product != 1 ? "Product of entered even numbers is " + task4Product + "\n\n" : "There are no even numbers\n\n");
		
		System.out.println("Task 5. Car");
		checker = true;
		cars[0] = new Car(CarType.Hatchback, 2003, 2.5);
		cars[1] = new Car(CarType.Convertible, 2010, 1.5);
		cars[2] = new Car(CarType.Coupe, 2003, 1.8);
		cars[3] = new Car(CarType.Crossover, 2005, 3.0);
		
		System.out.print("Enter desierd year: ");
		year = userInput.nextInt();
		
		System.out.println("Cars, produced in this year:");
		for (Car car : cars) {
			if (car.getYearOfProduction() == year) {
				System.out.println(car);
				checker = false;
			}
		}
		if (checker) System.out.println("Sorry, there are no such cars.");
		
		System.out.println("List of cars in order: ");
		Arrays.sort(cars);
		for (Car car : cars) {
			System.out.println(car);
		}
	}

}
