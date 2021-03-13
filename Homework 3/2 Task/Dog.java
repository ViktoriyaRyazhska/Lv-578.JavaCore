public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed.toString();
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog's name: " + name + ", breed: " + breed + ", age: " + age;
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
}

enum Breed {
    Beagle, Terrier, Pug;
}
