import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PhoneCalls {

	public static void main(String[] args) throws IOException {
		int total_cost = 0; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter c1, c2, c3 splitted by a space");
		String[] stringC = br.readLine().split(" ");
		int c[] = new int[3];
		for (int i = 0; i < 3; i++) {
		    c[i] = Integer.parseInt(stringC[i]);
		} 
		System.out.println("Please, enter t1, t2, t3 splitted by a space");
		String[] stringT = br.readLine().split(" ");
		int t[] = new int[3];
		for (int i = 0; i < 3; i++) {
		    t[i] = Integer.parseInt(stringT[i]);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("The cost of the phonecall number " + i +" will be " + (c[i] * t[i]));
			total_cost += c[i] * t[i];
		}
		System.out.println("The total cost of the  phonecalls will be " + total_cost);

	}

}
