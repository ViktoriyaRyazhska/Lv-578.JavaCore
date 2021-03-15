package HomeWork5;

import java.util.Comparator;

public class Car {
	private String make;
	private String model;
	private CarType type;
	private int year;
	private double capacity;
	
	public Car(String make, String model, CarType type, int model_year, double capacity) {
		this.make = make;
		this.model = model;
		this.type = type;
		this.year = model_year;
		this.capacity = capacity;
		
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "\n" + type + "\t\t" + make + " " + model + "\t" + year + "\t\t" + capacity + "L";
	}
	
	public static class YearComparator implements Comparator<Car> {
	    public int compare(Car c1, Car c2) {
			return (c1.getYear() - c2.getYear());
	    }	   
	}
	
}
