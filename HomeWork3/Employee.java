
public class Employee {
	private String name;
	private int rate;
	private int hours;
	private static double totalSum = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
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



	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}

	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee() {

	}
	public double getSalary(int rate,int hours) {
		totalSum += (this.rate * this.hours);
		return rate*hours;
		
	}
	
	

	public static double getTotalSum() {
		return totalSum;
	}

	public static void setTotalSum(double totalSum) {
		Employee.totalSum = totalSum;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	public double changeRate(int rate) {
			return rate * hours;
	}
	public double getBonuses(int rate , int hours) {
		return this.rate*this.hours*0.1; 
		
	}


	
}