package lesson3;

public class EmployeeInstances {
	public static void main (String[] args) {
		Employee employee1 = new Employee ();
		employee1.setName("John");
		employee1.setRate(7);
		employee1.setHours(8);
		
		Employee employee2 = new Employee ("Marusia", 8);
		employee2.setHours(6);
				
		Employee employee3 = new Employee("Nastya", 10, 7);
		
		System.out.println(employee1.getSalary() + employee2.getSalary() 
		+ employee3.getSalary());
		
		int salary1 = employee1.getSalary();
		int salary2 = employee2.getSalary();
		int salary3 = employee3.getSalary();
		
		int salarySum = salary1 + salary2 + salary3;
		
		System.out.println(salarySum);
	}
}
