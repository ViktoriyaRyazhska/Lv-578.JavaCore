public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Dog dog1 = new Dog("Chop", Breed.Beagle, 4);
        Dog dog2 = new Dog("Terry", Breed.Pug, 2);
        Dog dog3 = new Dog("Sparky", Breed.Terrier, 6);

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        main.checkSameName(dog1,dog2,dog3);
        main.findOldestDog(dog1,dog2,dog3);
    }

        public boolean checkSameName(Dog dog1, Dog dog2, Dog dog3){
            System.out.println();
            if (dog1.getName() == dog2.getName() ||
                    dog1.getName() == dog3.getName() ||
                    dog2.getName() == dog3.getName()) {
                System.out.println("There are a few dogs with the same name");
                return true;
            } else {
                System.out.println("There are no dogs with the same name");
                return false;
            }
        }

        public String findOldestDog(Dog dog1, Dog dog2, Dog dog3){
            int maxAge = Math.max(Math.max(dog1.getAge(),dog2.getAge()),dog3.getAge());

            if(maxAge == dog1.getAge()){
                System.out.println("The oldest dog is "+ dog1.getName()+", "+dog1.getBreed());
                return dog1.getName()+" "+dog1.getBreed();
            }
            else if(maxAge == dog2.getAge()){
                System.out.println("The oldest dog is "+ dog2.getName()+", "+dog2.getBreed());
                return dog2.getName()+" "+dog2.getBreed();
            }
            else {
                System.out.println("The oldest dog is "+ dog3.getName()+", "+dog3.getBreed());
                return dog3.getName()+dog3.getBreed();
            }
        }

}
