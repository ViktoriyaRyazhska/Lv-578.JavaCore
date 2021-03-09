import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter the radius");
		int rds = Integer.parseInt(br.readLine());
		double area = Math.PI * Math.pow(rds, 2);
		double prmtr = 2 * Math.PI * rds;
		System.out.println("The area of the flower bed is " + area);
		System.out.println("The perimeter of the flower bed is " + prmtr);

	}

}