package HomeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		// task 1.1
		System.out.print("Task 1.1 \nPlease enter three numbers separated by spaces: ");
		System.out.println(checkRange(bufferedReader.readLine().split(" ")));
		
		// task 1.2
		System.out.print("\nTask 1.2 \nPlease enter three numbers separated by spaces: ");
		System.out.println(checkMaxMin(bufferedReader.readLine().split(" ")));
		
		// task 1.3
		System.out.print("\nTask 1.3 \nPlease enter number of HTTP Error: ");
		System.out.println(HTTPError.get(bufferedReader.readLine()).getMessage());
		
		// task 2
		Dog dog1 = new Dog("Bob", Breeds.POODLES, 3);
		Dog dog2 = new Dog("Bob", Breeds.GOLDEN_RETRIEVERS, 1);
		Dog dog3 = new Dog("Jack", Breeds.FRENCH_BULLDOGS, 4);
		
		System.out.print("\nTask 2");
		checkDogByName(dog1, dog2, dog3);
		System.out.print("\nThe oldest dog: " + getOldestDog(dog1, dog2, dog3));
	}
	
	private static String checkRange(String ... nums) {
		try {
			for(String num : nums) {
				float f = Float.parseFloat(num);
				if(-5 > f || f > 5) {
					return "One of the numbers don't belong to the range [-5.5].";
				}
			}		
		}catch (NumberFormatException e) {
			return e.toString();
		}
		return "All numbers belong to the range [-5,5]";
	}
	
	private static String checkMaxMin(String ... nums) {
		int max = -2147483648, min = 2147483647;
		try {
			for(String num : nums) {
				int i = Integer.parseInt(num);
				if(i > max) {
					max = i;
				}
				if(i < min){
					min = i;
				}
			}		
		}catch (NumberFormatException e) {
			return e.toString();
		}
		return "Max number: " + max + ". Min number: " + min + ".";
	}
	
	private static void checkDogByName(Dog dog1, Dog dog2, Dog dog3) {
		if (dog1.getName().equalsIgnoreCase(dog2.getName())){
			System.out.print("\nWe have two dogs with the same name: " + dog1.getName());
		}else if (dog1.getName().equalsIgnoreCase(dog3.getName())){
			System.out.print("\nWe have two dogs with the same name: " + dog1.getName());
		}else if (dog2.getName().equalsIgnoreCase(dog3.getName())){
			System.out.print("\nWe have two dogs with the same name: " + dog2.getName());
		}else {
			System.out.print("\nWe haven't two dogs with the same name.");
		}
	}
	
	private static Dog getOldestDog(Dog dog1, Dog dog2, Dog dog3) {
		if(dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
			return dog1;
		}else if(dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
			return dog2;	
		}
		return dog3;
	}
}

