import org.junit.Test;
import static org.junit.Assert.*;

public class Task1Test {

    Task1 task1 = new Task1();

    @Test
    public void numbersShouldBeInRange() {
        assertTrue(task1.checkRange(1, 2, -3) == true);
        assertTrue(task1.checkRange(20, 2, 3) == false);
    }

    @Test
    public void shouldReturnMaxNumber() {
        assertEquals(10, task1.findMax(1, 2, 10));
    }

    @Test
    public void shouldReturnMinNumber() {
        assertEquals(1, task1.findMin(1, 2, 10));
    }

    @Test
    public void errorNumberShouldReturnCorrectMessage() {
        assertTrue(task1.readHTTPError(400) == "Bad_Request");
        assertTrue(task1.readHTTPError(0) == "Input error");
    }
}