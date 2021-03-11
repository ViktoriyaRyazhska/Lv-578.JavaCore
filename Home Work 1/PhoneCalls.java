// Phone calls from three different countries are с1, с2 and с3 standard units per minute. 
// Talks continued t1, t2 and t3 minutes. How much computer will count for each call separately and all talk together? 
// Input all source data from console, make calculations and output to the screen.

import java.util.Scanner;

public class PhoneCalls {

	public static void main(String[] args) {
		 
		float c1, c2, c3, t1, t2, t3;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("ск≥льки часу тривала розмова з ѕарижем?");
		c1 = in.nextFloat();
		System.out.println("ск≥льки часу тривала розмова з Ѕерл≥ном?");
		c2 = in.nextFloat();
		System.out.println("ск≥льки часу тривала розмова з ¬≥днем?");
		c3 = in.nextFloat();
		
		System.out.println("яка варт≥сть 1 хв розмови з ѕарижем?");
		t1 = in.nextFloat();
		System.out.println("яка варт≥сть 1 хв розмови з Ѕерл≥ном?");
		t2 = in.nextFloat();
		System.out.println("яка варт≥сть 1 хв розмови з ¬≥днем?");
		t3 = in.nextFloat();
		
		System.out.println("розмова з ѕарижем коштуЇ " + c1*t1 + "грн");
		System.out.println("розмова з ѕарижем коштуЇ " + c2*t2 + "грн");
		System.out.println("розмова з ѕарижем коштуЇ " + c3*t3 + "грн");
		System.out.println("загальна вартысть всых розмов " + (c1*t1+c2*t2+c3*t3) + "грн");
		
	}

}
