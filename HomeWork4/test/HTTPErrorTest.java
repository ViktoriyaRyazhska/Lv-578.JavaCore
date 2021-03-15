package HomeWork4.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import HomeWork4.HTTPError;

//task 3
class HTTPErrorTest {

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
    public void testGet() { 
		assertTrue(HTTPError.get("400") == HTTPError.BAD_REQUEST);
		assertTrue(HTTPError.get("200") == HTTPError.OK);
		assertTrue(HTTPError.get("420") == HTTPError.METHOD_FAILURE);
	}
	
}
