import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DogTest {
	private ArrayList<Dog> dogs = new ArrayList<>();
	@Test
	void testgetOldest() {
		Dog lucky = new Dog("Lucky", DogBreed.BEAGLE, 7);
		dogs.add(new Dog("Bob", DogBreed.FOX_TERRIER, 5));
		dogs.add(new Dog("Lucky", DogBreed.BEAGLE, 7));
		dogs.add(new Dog("Ponochka", DogBreed.MALTESE, 2));
		Assertions.assertEquals(dogs.get(0).getOldest(dogs), lucky);
	}
	
	@Test
	void testcheckForSameDogsSame() {
		int counter = 0;
		dogs.add(new Dog("Bob", DogBreed.FOX_TERRIER, 5));
		dogs.add(new Dog("Lucky", DogBreed.BEAGLE, 7));
		dogs.add(new Dog("Ponochka", DogBreed.MALTESE, 2));
		ArrayList<Dog> new_dogs = new ArrayList<>(dogs);
		dogs.add(new Dog("Bob", DogBreed.FOX_TERRIER, 5));
		ArrayList<Dog> checked_dogs =dogs.get(0).checkForSameDogs(dogs);
		for(Dog dog : checked_dogs) {
			if(new_dogs.contains(dog)) {
				counter++;
			}
		}
		Assertions.assertEquals(new_dogs.size(), counter);
		
	}
	void testcheckForSameDogsDifferent() {
		int counter = 0;
		dogs.add(new Dog("Bob", DogBreed.FOX_TERRIER, 5));
		dogs.add(new Dog("Lucky", DogBreed.BEAGLE, 7));
		dogs.add(new Dog("Ponochka", DogBreed.MALTESE, 2));
		dogs.add(new Dog("Ponochka", DogBreed.SHIBA_INU, 3));
		ArrayList<Dog> checked_dogs =dogs.get(0).checkForSameDogs(dogs);
		for(Dog dog : checked_dogs) {
			if(dogs.contains(dog)) {
				counter++;
			}
		}
		Assertions.assertEquals(dogs.size(), counter);
		
	}

}
