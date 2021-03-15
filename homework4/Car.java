import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Car {
	private String type;
	private int yearOfProduction;
	private int engineCapacity;
	
	public Car() {}
	
	public Car(String type, int yearOfProduction, int engineCapacity) {
		this.type = type;
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", yearOfProduction=" + yearOfProduction + ", engineCapacity=" + engineCapacity
				+ "]";
	}
	
	public ArrayList<Car> getCarsOfCertainYear(ArrayList<Car> cars, int year) {
		ArrayList<Car> new_cars = new ArrayList<>();
		for(int i=0; i<cars.size(); i++) {
			if(cars.get(i).getYearOfProduction() == year) {
				new_cars.add(cars.get(i));
			}
		}
		return new_cars;
	}
	
	public ArrayList<Car> sortCarsByYear(ArrayList<Car> cars) {
		Car tmp;
		for (int i = 0; i < cars.size() - 1; i++) {
			for (int j = i + 1; j > cars.size(); j++) {
				if (cars.get(i).getYearOfProduction() < cars.get(j).getYearOfProduction()) {
					tmp = cars.get(i);
					cars.set(i, cars.get(j));
					cars.set(j, tmp);
				}
			}
		}
		return cars;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(new Car("sedan", 2007, 192));
		cars.add(new Car("sedan", 2021, 252));
		cars.add(new Car("coupe", 2021, 420));
		cars.add(new Car("hatchback", 2018, 147));
		System.out.println("Please, enter certain model year:");
		int year = Integer.parseInt(br.readLine());
		System.out.println("Here are your cars:");
		ArrayList<Car> certainYearCars = cars.get(0).getCarsOfCertainYear(cars, year);
		for(Car car : certainYearCars) {
			System.out.println(car);
		}
		System.out.println("Here are sorted cars:");
		ArrayList<Car> sortedCars = cars.get(0).sortCarsByYear(cars);
		for(Car car : sortedCars) {
			System.out.println(car);
		}

	}

}
