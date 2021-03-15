package PracticalTasks5;

import java.util.Comparator;

public class Employee{
	String name; 
	int department_number;
	float salary;
	
	public Employee(String name, int department_number, float salary) {
		super();
		this.name = name;
		this.department_number = department_number;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartment_number() {
		return department_number;
	}

	public void setDepartment_number(int department_number) {
		this.department_number = department_number;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\n" + name + "\t\t" + department_number + "\t\t" + salary;
	}
	
	public static class SalaryComparator implements Comparator<Employee> {
	    public int compare(Employee e1, Employee e2) {
			return (int)(e2.getSalary() - e1.getSalary());
	    }
	    
	   
	}
}
