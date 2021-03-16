enum CarType {
	Hatchback, Sedan, MPV, SUV, Crossover, Coupe, Convertible
}

public class Car implements Comparable<Car>{
	private CarType type;
	private int yearOfProduction;
	private double engineCapacity;
	
	public Car() {}
	
	public Car(CarType type, int yearOfProduction, double engineCapacity) {
		this.type = type;
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;
	}

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	@Override
	public String toString() {
		return "Car type- " + type + ", engine capacity- " + engineCapacity + ", produced in " + yearOfProduction;
	}
	
	@Override
	public int compareTo(Car car) {
		return this.yearOfProduction - car.getYearOfProduction();
	}
}
