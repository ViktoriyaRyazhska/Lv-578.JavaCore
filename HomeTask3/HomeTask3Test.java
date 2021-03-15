import static org.junit.Assert.*;

import org.junit.Test;

public class HomeTask3Test {
	Dog dog1 = new Dog("Jef", Breed.German_Shepherd, 10);
	Dog dog2 = new Dog("Kate", Breed.Labrador, 3);
	Dog dog3 = new Dog("Moose", Breed.Poodle, 12);

	@Test
	public void testNumberInRange() {
		assertTrue(HomeTask3.numberInRange(-2) == true);
	}
	
	@Test
	public void testNumberNotInRange() {
		assertFalse(HomeTask3.numberInRange(6) == true);
	}
	
	@Test
	public void testMin() {
		int expected = 2;
		int actual = HomeTask3.min(6, 2, 8);
		assertEquals(actual, expected);
	}
	
	@Test
	public void testMax() {
		int expected = 8;
		int actual = HomeTask3.max(6, 2, 8);
		assertEquals(actual, expected);
	}
	
	@Test
	public void testErrorCode() {
		String expected = "Forbidden";
		String actual = HomeTask3.errorName(403);
		assertEquals(actual, expected);
	}
	
	@Test
	public void testSameDogNames() {
		assertTrue(HomeTask3.sameDogNames(dog1, dog2, dog3) == false);
	}
	
	@Test
	public void testOldestDog() {
		String expected = "The oldest dog: " + dog3;
		String actual = HomeTask3.oldestDog(dog1, dog2, dog3);
		assertEquals(actual, expected);
	}

}
