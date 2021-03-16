// 2.	Утворити та видрукувати послідовність  , елементи якої  утворюються за наступним правилом:

package HW5;

public class Sequence {

	public static void main(String[] args) {
			
		double seq[] = new double[19];
		seq[0] = 0;
		seq[1] = 5.0/8;
		for (int i = 2; i < 19; i++) {
			seq [i] = (seq[i - 1] / 2) + ((3/4) * seq[i - 2]);
		}
		for (int i = 0; i < 19; i++) System.out.println(seq[i]);

	}

}
