import java.util.Scanner;

public class Apply {

	public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.setName("Andrey");
	e1.setRate(9);
	e1.setHours(120);
	Employee e2 = new Employee("Roman",7);
	e2.setHours(110);
	Employee e3 = new Employee("Oleg",6,130);
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	System.out.println("Employee's 1 salary is : " + e1.getSalary(9, 120));
	System.out.println("Employee's 2 salary is : " + e2.getSalary(7, 110));
	System.out.println("Employee's 3 salary is : " + e3.getSalary(6, 130));
	System.out.println("Total salary is: " + e1.getTotalSum());
	System.out.println("10% bonus for Employe 1 is: " + e1.getBonuses(9, 120));
	System.out.println("10% bonus for Employe 2 is: " + e2.getBonuses(7, 110));
	System.out.println("10% bonus for Employe 3 is: " + e3.getBonuses(6, 130));
	System.out.println("Do u wanna change rate?: \n1.Yes\n2.No");
	Scanner sc = new Scanner(System.in);
	int userInput = sc.nextInt();
	if(userInput == 1) {
		System.out.println("Which employee u wanna change?: \nEmployee 1 - Press 1\nEmployee 2 - Press 2\nEmployee 3 - Press 3");
		int userInput1 = sc.nextInt();
		if(userInput1 == 1) {
			System.out.println("What rate?: ");
			int userInpute1 = sc.nextInt();
			System.out.println("Salary of Employee 1 with changed rate is: " + e1.changeRate(userInpute1));
			}
		else if (userInput1 == 2) {
			System.out.println("What rate?: ");
			int userInpute2 = sc.nextInt();
			System.out.println("Salary of Employee 2 with changed rate is: " + e2.changeRate(userInpute2));
		}
		else if(userInput1 == 3) {
			System.out.println("What rate?: ");
			int userInpute3 = sc.nextInt();
			System.out.println("Salary of Employee 3 with changed rate is: " + e3.changeRate(userInpute3));
		}
	}
	else {
		System.out.println();
	}
	
	
	}
}
