import java.util.Scanner;

public class Lesson4practice {
	
	public enum Continent {
		EUROPE, ASIA, NORTH_AMERICA, SOUTH_AMERICA, AFRICA, AUSTRALIA
	}

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int oddCount = 0;
		int numbers[] = new int[3];
		int day;
		String country;
		Continent continent = null;
		int numbersCount = 1;
		
		// task 1
		for (int number : numbers) {
			System.out.print("Enter " + numbersCount + " number: ");
			number = userInput.nextInt();
			numbersCount++;
			if (number % 2 != 0) oddCount++;
		}
		
		System.out.println("There are " + oddCount + " odd numbers in provided array.\n\n");
		
		
		//Task 2
		System.out.print("Enter number of the day in the week: ");
		day = userInput.nextInt();
		
		switch (day) {
		case 1:
			System.out.println("Monday, Понедельник, Понеділок");
			break;
		case 2:
			System.out.println("Tuesday, Вторник, Вівторок");
			break;
		case 3:
			System.out.println("Wednesday, Среда, Середа");
			break;
		case 4:
			System.out.println("Thursday, Четверг, Четверг");
			break;
		case 5:
			System.out.println("Friday, Пятница, П'ятниця");
			break;
		case 6:
			System.out.println("Saturday, Суббота, Субота");
			break;
		case 7:
			System.out.println("Sunday, Воскресенье, Неділя");
			break;
		default:
			System.out.println("Wrong input!");
		}
		System.out.print("\n\n");
		
		
		//Task 3
		System.out.print("Enter name of the country: ");
		country = userInput.next();
		
		switch (country.toLowerCase()) {
		case "ukraine": case "germany":
			continent = Continent.EUROPE;
			break;
		case "china": case "japan":
			continent = Continent.ASIA;
			break;
		case "usa": case "canada":
			continent = Continent.NORTH_AMERICA;
			break;
		case "egypt": case "angola":
			continent = Continent.AFRICA;
			break;
		case "brazil": case "colombia":
			continent = Continent.SOUTH_AMERICA;
			break;
		case "australia":
			continent = Continent.AUSTRALIA;
			break;
		default:
			System.out.println("Sorry, this country is not yet in database.");
		}
		
		if (continent != null) {
			System.out.println("This country is located in " + continent);
		}
		
		System.out.println("\n\n");
		
		//Task4
		Product products[] = new Product[4];
		for (Product product : products) {
			product = new Product(); 
			System.out.print("Enter new product name: ");
			product.setName(userInput.next());
			System.out.print("Enter it's price: ");
			product.setPrice(userInput.nextDouble());
			System.out.print("Enter number of items in stock: ");
			product.setQuantity(userInput.nextInt());
			Product.checkProduct(product);
		}
		
		Product.getMostExpensive();
		Product.getMostQuantity();
	}

}
