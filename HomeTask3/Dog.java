enum Breed {
	German_Shepherd, Bulldog, Labrador, Poodle, Chihuahua
}

public class Dog {
	private String name;
	private String breed;
	private int age;
	
	public Dog() {}
	
	public Dog(String name) {
		this.name = name;
	}
	
	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed.name();
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name - " + name + ", breed - " + breed;
	}
}
