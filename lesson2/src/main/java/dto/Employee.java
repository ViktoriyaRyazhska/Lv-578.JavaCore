package dto;

public class Employee {
    private static double totalSum;
    private double salary;
    private double bonuses;
    private String name;
    private double rate;
    private int hours;


    public Employee() {
    }


    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }


    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        salary = rate * hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Employee[name= " + name + ", rate= " + rate + ", hours= " + hours +
                " salary = " + salary + "," + " bonuses = " + bonuses + "]";

    }

    public double getSalary() {
        this.salary = hours * rate;
        totalSum += salary;
        return salary;
    }

    public double getBonuses() {
        this.bonuses = getSalary() * 0.1;
        return bonuses;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public void changeRate(double newRate) {
        totalSum -= salary;
        rate = newRate;
        getBonuses();
    }


}

