import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DaysOfTheWeekend {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter a day of the weekend:");
		String day = br.readLine().toLowerCase();
		switch(day) {
		case "sunday":
			System.out.println("�����");
			System.out.println("Sonntag");
			break;
		case "monday":
			System.out.println("��������");
			System.out.println("Montag");
			break;
		case "tuesday":
			System.out.println("³������");
			System.out.println("Dienstag");
			break;
		case "wednesday":
			System.out.println("������");
			System.out.println("Mittwoch");
			break;
		case "thursday":
			System.out.println("������");
			System.out.println("Donnerstag");
			break;
		case "friday":
			System.out.println("�'������");
			System.out.println("Freitag");
			break;
		case "saturday":
			System.out.println("������");
			System.out.println("Samstag");
			break;
		default:
			System.out.println("This is not a day of the weekend");
			break;
		}
	}

}
