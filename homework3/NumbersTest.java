import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumbersTest {
	Numbers num = new Numbers();

	@Test
	void testcheckIfBelongPositive() {
		float[] f = {3.5f, 2.1f, 3};
		Assertions.assertEquals(num.checkIfBelong(f), true);
	}
	
	@Test
	void testcheckIfBelongNegative() {
		float[] f = {2.1f, 4.8f, -6.6f};
		Assertions.assertEquals(num.checkIfBelong(f), false);
	}
	@Test
	void testgetMin() {
		int[] numbs = {110, 12, 3};
		Assertions.assertEquals(num.getMinMax(numbs)[0], 3);
	}
	@Test
	void testgetMax() {
		int[] numbs = {110, 12, 3};
		Assertions.assertEquals(num.getMinMax(numbs)[1], 110);
	}
	@Test
	void testgetHTTPErrorPositive() {
		Assertions.assertEquals(num.getHTTPError(404), "NOT FOUND");
	}
	@Test
	void testgetHTTPErrorNegative() {
		Assertions.assertEquals(num.getHTTPError(1), "Wrong");
	}
	
}