import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddNumbers {

	public static void main(String[] args) throws IOException {
		int oddNumbs = 0; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter three numbers splitted by a space:");
		String[] stringNumbs = br.readLine().split(" ");
		for (int i = 0; i < 3; i++) {
		    if (Integer.parseInt(stringNumbs[i]) % 2 != 0) {
		    	oddNumbs++;
		    }
		}
		System.out.println(oddNumbs);
	}

}
