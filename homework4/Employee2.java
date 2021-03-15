import java.util.ArrayList;

public class Employee2 {
	private String name;
	private int departmantNumber;
	private double salary;
	
	public Employee2() {}

	public Employee2(String name, int departmantNumber, double salary) {
		this.name = name;
		this.departmantNumber = departmantNumber;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmantNumber() {
		return departmantNumber;
	}

	public void setDepartmantNumber(int departmantNumber) {
		this.departmantNumber = departmantNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public ArrayList<Employee2> getEmploeesOfDepartment(ArrayList<Employee2> employees, int dep) {
		ArrayList<Employee2> new_employees = new ArrayList<>();
		for(int i=0; i<employees.size(); i++) {
			if(employees.get(i).getDepartmantNumber() == dep) {
				new_employees.add(employees.get(i));
			}
		}
		return new_employees;
	}
	
	public ArrayList<Employee2> sortEmployees(ArrayList<Employee2> employees) {
		Employee2 tmp;
		for (int i = 0; i < employees.size() - 1; i++) {
			for (int j = i + 1; j < employees.size(); j++) {
				if (employees.get(i).getSalary() < employees.get(j).getSalary()) {
					tmp = employees.get(i);
					employees.set(i, employees.get(j));
					employees.set(j, tmp);
				}
			}
		}
		return employees;

	}
	
	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", departmantNumber=" + departmantNumber + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		Employee2 emp = new Employee2();
		ArrayList<Employee2> employees = new ArrayList<>();
		employees.add(new Employee2("Bob", 1, 50));
		employees.add(new Employee2("Max", 1, 60));
		employees.add(new Employee2("Layla", 2, 60));
		employees.add(new Employee2("Chad", 2, 50));
		employees.add(new Employee2("Fred", 3, 45));
		ArrayList<Employee2> dep_employees = emp.getEmploeesOfDepartment(employees, 2);
		System.out.println("Theese are employeese from one department");
		for (Employee2 empl: dep_employees) {
			System.out.println(empl);
		}
		System.out.println("Theese are employeese sorted by salary in descreading order");
		ArrayList<Employee2> sorted_employees = emp.sortEmployees(employees);
		for (Employee2 empl: sorted_employees) {
			System.out.println(empl);
		}

	}

}
