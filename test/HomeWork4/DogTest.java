package HomeWork4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//task 3
class DogTest {
	Dog dog = new Dog("Bob", Breeds.POODLES, 3);
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
    public void testDogName() {
        String actual = "Bob";
        String expected = dog.getName();
        assertEquals(actual, expected);
    }
	
	@Test
    public void testDogBreed() {
		Breeds actual = Breeds.POODLES;
        Breeds expected = dog.getBreed();
        assertEquals(actual, expected);
    }
	
	@Test
    public void testAdd() { assertTrue(dog.getAge() == 3);}

}
