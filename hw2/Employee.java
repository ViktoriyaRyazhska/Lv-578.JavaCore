package soft;

public class Employee {

    static int totalSum;
    private String name;
    private int rate;
    private int hours;

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
        totalSum -= salary() + bonuses();
        this.rate = rate;
        totalSum += salary() + bonuses();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        totalSum -= salary() + bonuses();
        this.hours = hours;
        totalSum += salary() + bonuses();
    }

    public Employee() {
        totalSum += salary() + bonuses();
    }

    public Employee(String name, int rate) {
        this.name = name;
        setRate(rate);
        totalSum += salary() + bonuses();
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        setRate(rate);
        setHours(hours);
        totalSum += salary() + bonuses();
    }

    int salary() {
        return rate * hours;
    }

    int bonuses() {
        return salary() / 10;
    }

    void changeRate(int newRate){
        totalSum -= salary() + bonuses();
        setRate(newRate);
        totalSum += salary() + bonuses();
    }

    @Override
    public String toString() {
    	return "Employee [name=" + name + ", hours=" + hours + ", rate=" + rate + ", Salary=" + salary() + "]";
        
   

    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setName("Sasha");
        e1.setHours(24);
        e1.setRate(100);

        Employee e2 = new Employee("Tamara", 100);
        Employee e3 = new Employee("Julia", 200, 120);

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println("\nTotal Compensation: " + Employee.totalSum);
        e1.changeRate(200);
        System.out.println(e1.toString());
        System.out.println("\nTotal Compensation: " + Employee.totalSum);

    }
}