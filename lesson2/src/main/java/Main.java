import dto.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("Robert");
        emp1.setRate(9);
        emp1.setHours(12);

        Employee emp2 = new Employee("Karl", 8.4);
        emp2.setHours(10);

        Employee emp3 = new Employee("Mark", 9.4, 8);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println();
        System.out.println( emp1.getName() + ": salary = "  + emp1.getSalary());
        System.out.println( emp1.getName() + ": bonuses = " + emp1.getBonuses());
        System.out.println();
        System.out.println( emp2.getName() + ": salary = " + emp2.getSalary());
        System.out.println( emp2.getName() + ": bonuses = " + emp2.getBonuses());
        System.out.println();
        System.out.println( emp3.getName() + ": salary = " + emp3.getSalary());
        System.out.println( emp3.getName() + ": bonuses = " + emp3.getBonuses());
        System.out.println();
        System.out.println("Total sum: " + Employee.getTotalSum());
        emp1.changeRate(10);
        emp2.changeRate(7);
        emp3.changeRate(12);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println();
        System.out.println("Total sum: " + Employee.getTotalSum());

        HomeWork2 homeWork2 = new HomeWork2();
        homeWork2.task1();
    }

}
