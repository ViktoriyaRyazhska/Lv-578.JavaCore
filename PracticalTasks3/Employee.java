
public class Employee {
	private static double totalSum = 0;
	
	private String name;
	private double rate;
	private double hours;
	
	public Employee(String name, double rate, double hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}

	public Employee(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getRate() {
		return rate;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public double getHours() {
		return hours;
	}
	
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public double getSalary() {
		totalSum+=(rate*hours);
		return rate*hours;
	}
	
	public void changeRate(double rate){
		totalSum-=(rate*hours);
		this.rate = rate;
		totalSum+=(rate*hours);
	}

	public double getBonuses(){
		totalSum+=rate*hours*0.1;
		return rate*hours*0.1;
	}
	
	public double getTotalSum() {
		return totalSum;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", hours=" + hours + ", rate=" + rate + ", Salary=" + getSalary() + ", Bonuses=" + getBonuses() + "]";
	}
	
	
}
