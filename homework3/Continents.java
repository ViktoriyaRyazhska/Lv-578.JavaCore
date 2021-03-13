import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum Continent{
	EUROPE, AFRICA, ASIA, NORTH_AMERICA, SOUTH_AMERICA;
}

public class Continents {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter a country:");
		String country = br.readLine().toLowerCase();
		switch(country) {
		case "ukraine": case "france": case "greece":
			System.out.println(Continent.EUROPE);
			break;
		case "egypt": case "kenya": case "ethiopia":
			System.out.println(Continent.AFRICA);
			break;
		case "china": case "india": case "japan":
			System.out.println(Continent.ASIA);
			break;
		case "canada": case "mexico": case "haiti":
			System.out.println(Continent.NORTH_AMERICA);
			break;
		case "brazil": case "bolivia": case "peru":
			System.out.println(Continent.SOUTH_AMERICA);
			break;
		default:
			System.out.println("Sorry, no information about this country");
			break;
		}

	}

}
