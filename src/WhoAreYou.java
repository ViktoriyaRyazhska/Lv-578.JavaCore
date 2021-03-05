import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class WhoAreYou {

	public static void main(String[] args) throws IOException {
		String name, address;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name?");
		name = br.readLine();
		System.out.println("Where do you live, " + name + "?");
		address = br.readLine();
		System.out.println("Your name is " + name + ". Your address is " + address + ".");
	}

}
