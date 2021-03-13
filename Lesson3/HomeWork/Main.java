public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.setName("Vasya");
        employee1.setRate(15); //USD
        employee1.setHours(4);

        employee2.setName("Jon");
        employee2.setRate(23); //USD
        employee2.setHours(8);

        employee3.setName("Sanya");
        employee3.setRate(8); //USD
        employee3.setHours(10);

        System.out.println(employee1.getName() + " " + employee1.getSalary() + " USD + bonus: "
                + employee1.getBonuses() + " Total: " + employee1.getTotalSalary());
        System.out.println(employee2.getName() + " " + employee2.getSalary() + " USD + bonus: "
                + employee2.getBonuses() + " Total: " + employee2.getTotalSalary());
        System.out.println(employee3.getName() + " " + employee3.getSalary() + " USD + bonus: "
                + employee3.getBonuses() + " Total: " + employee3.getTotalSalary());

        System.out.println("Total salary of all employee: " + ((int)(employee1.getTotalSalary() + employee2.getTotalSalary() + employee3.getTotalSalary())));
    }
}
