package Lesson3;

public class Employee {
	// non-static fields
	private String name;
	private int rate;
	private int hours;
	// static field
	static int totalSum;

	public Employee(String name, int rate, int hours) {
		super();
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}

	public Employee(String name, int rate) {
		super();
		this.name = name;
		this.rate = rate;
	}

	public Employee() {
		super();
	}

	public static int getTotalSum() {
		return totalSum;
	}

	public static void setTotalSum(int totalSum) {
		Employee.totalSum = totalSum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getSalary() {
		return rate * hours;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}

	public void changeRate(int rate) {
		this.rate = rate;
	}

	public double getBonuses() {
		return getSalary() * 0.1;
	}

}
