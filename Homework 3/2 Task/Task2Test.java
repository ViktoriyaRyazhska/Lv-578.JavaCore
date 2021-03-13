import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {
    Main main = new Main();
    Dog dog1 = new Dog("Dog1", Breed.Terrier, 0);
    Dog dog2 = new Dog("Dog2", Breed.Beagle, 1);
    Dog dog3 = new Dog("Dog3", Breed.Pug, 22);

    @Test
    public void namesShouldNotRepeat() {
        assertTrue(main.checkSameName(dog1, dog2, dog3) == false);
    }

    @Test
    public void shouldReturnOldestDog() {
        assertEquals("Dog3Pug", main.findOldestDog(dog1, dog2, dog3));
    }
}
