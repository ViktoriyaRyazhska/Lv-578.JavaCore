
public class Employee {
	private String name;
	private double hours = 0;
	private double rate = 0;
	private boolean bonuses = false;
	
	private static double totalsum = 0;
	
	public Employee() {}
	
	public Employee(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}
	
	public Employee(String name, double hours, double rate) {
		this.name = name;
		this.hours = hours;
		this.rate = rate;
		Employee.totalsum += getSalary();
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getHours() {
		return hours;
	}
	
	public void setHours(double hours) {
		this.hours = hours;
		Employee.totalsum += getSalary();
	}
	
	public double getRate() {
		return rate;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
		Employee.totalsum += getSalary();
	}
	
	public static double getTotalsum() {
		return totalsum;
	}
	
	public static void setTotalsum(double totalsum) {
		Employee.totalsum = totalsum;
	}
	
	public double getSalary() {
		return this.rate * this.hours;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", hours=" + hours + ", rate=" + rate + "]";
	}
	
	public void changeRate(int rate) {
		Employee.totalsum -= this.getSalary();
		if(this.bonuses) {
			Employee.totalsum-= this.getBonuses();
			this.bonuses = false;
		}
		this.rate = rate;
		Employee.totalsum += this.getSalary();
	}
	
	public double getBonuses(){
		double bns = this.getSalary() * 0.1;
		Employee.totalsum += bns;
		this.bonuses = true;
		return bns;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Bob");
		e1.setHours(10);
		e1.setRate(5);
		Employee e2 = new Employee("Chris", 8);
		e2.setHours(6);
		Employee e3 = new Employee("Mark", 7, 7);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(Employee.getTotalsum());
		e3.changeRate(5);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(Employee.getTotalsum());
		e3.getBonuses();
		System.out.println(Employee.getTotalsum());
		e3.changeRate(6);
		System.out.println(Employee.getTotalsum());
		e3.getBonuses();
		System.out.println(Employee.getTotalsum());
	}
	
}