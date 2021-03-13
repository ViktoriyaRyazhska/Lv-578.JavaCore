import java.util.ArrayList;

enum DogBreed{AKITA, ALASKAN_MALAMUTE, BASSET_HOUND, BEAGLE, CHIHUAHUA,
	DACHSHUND, FOX_TERRIER, MALTESE, POMERANIAN, SHIBA_INU, YORKSHIRE_TERRIER}

public class Dog {
	private String name;
	private DogBreed breed;
	double age;
	
	public Dog() {}
	
	public Dog(String name, DogBreed breed, double age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DogBreed getBreed() {
		return breed;
	}

	public void setBreed(DogBreed breed) {
		this.breed = breed;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(age);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (Double.doubleToLongBits(age) != Double.doubleToLongBits(other.age))
			return false;
		if (breed != other.breed)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public ArrayList<Dog> checkForSameDogs(ArrayList<Dog> dogs) {
		for(int i=0; i<dogs.size(); i++) {
			for(int j=0; j<dogs.size(); j++) {
				if(i!=j) {
					if(dogs.get(i).equals(dogs.get(j)) == true) {
						dogs.remove(i);
					}
					
				}
			}
		}
		return dogs;
	}
	
	public Dog getOldest(ArrayList<Dog> dogs) {
		double oldest = dogs.get(0).getAge();
		Dog oldestDog = dogs.get(0);
		for(int i = 1;i < dogs.size(); i++ ) {
			if (dogs.get(i).getAge() > oldest) {
				oldest = dogs.get(i).getAge();
				oldestDog = dogs.get(i);
			}
		}
		System.out.println(oldestDog.name + " " + oldestDog.breed);
		return oldestDog;
	}

	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog("Bob", DogBreed.FOX_TERRIER, 5));
		dogs.add(new Dog("Lucky", DogBreed.BEAGLE, 7));
		dogs.add(new Dog("Ponochka", DogBreed.MALTESE, 2));
		dogs.add(new Dog("Bob", DogBreed.FOX_TERRIER, 5));
		dogs.add(new Dog("Ponochka", DogBreed.SHIBA_INU, 3));
		dogs.get(0).getOldest(dogs);
		ArrayList<Dog> checkedDogs = dogs.get(0).checkForSameDogs(dogs);
		for(Dog dog : checkedDogs) {
			System.out.println(dog.getName());
		}
	}

}
