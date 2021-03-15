import java.util.Scanner;

public class HomeTask3 {
	
	public static String numbers(float num1, float num2, float num3) {
		return (((num1 >= -5) && (num1 <= 5)) && ((num2 >= -5) && (num2 <= 5)) && ((num3 >= -5) && (num3 <= 5))) ? "All three numbers are in range [-5,5]" : "Some numbers are not in range [-5,5]";
	}
	
	private static void minMax(int num1, int num2, int num3) {
		int min = num1;
		int max = num1;
		if (num2 < min) min = num2;
		else if (num2 > max) max = num2;
		if (num3 < min) min = num3;
		else if (num3 > max) max = num3;
		System.out.println("Min number is " + min);
		System.out.println("Max number is " + max);
	}
	
	enum HTTPError {
		Bad_Request, Unauthorized, Payment_Required, Forbidden, Not_Found, Method_Not_Allowed
	}
	
	private static String errorName(int code) {
		switch (code) {
		case 400:
			return HTTPError.Bad_Request.name();
		case 401:
			return HTTPError.Unauthorized.name();
		case 402:
			return HTTPError.Payment_Required.name();
		case 403:
			return HTTPError.Forbidden.name();
		case 404:
			return HTTPError.Not_Found.name();
		case 405:
			return HTTPError.Method_Not_Allowed.name();
		default:
			return "This code is not yet in database";
		}
	}
	
	private static void oldestDog(Dog dog1, Dog dog2, Dog dog3) {
		int maxAge = dog1.getAge();
		Dog oldest = dog1;
		if (dog2.getAge() > maxAge) {
			maxAge = dog2.getAge();
			oldest = dog2;
		}
		if (dog3.getAge() > maxAge) {
			maxAge = dog3.getAge();
			oldest = dog3;
		}
		System.out.println("The oldest dog: " + oldest);
	}

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Check range task");
		System.out.print("Enter first number: ");
		float firstNumber = userInput.nextFloat();
		System.out.print("Enter second number: ");
		float secondNumber = userInput.nextFloat();
		System.out.print("Enter third number: ");
		float thirdNumber = userInput.nextFloat();
		
		System.out.println(HomeTask3.numbers(firstNumber, secondNumber, thirdNumber));
		
		System.out.println("Min - max task");
		System.out.print("Enter first number: ");
		firstNumber = userInput.nextInt();
		System.out.print("Enter second number: ");
		secondNumber = userInput.nextInt();
		System.out.print("Enter third number: ");
		thirdNumber = userInput.nextInt();
		
		HomeTask3.minMax((int)firstNumber, (int)secondNumber, (int)thirdNumber);
		
		System.out.println("HTTP Error name task");
		System.out.print("Enter HTTP Error code 4xx: ");
		int errorCode = userInput.nextInt();
		System.out.println(HomeTask3.errorName(errorCode));
		
		System.out.println("Dog task");
		Dog dog1 = new Dog("Killer", Breed.Chihuahua, 8);
		Dog dog2 = new Dog("Killer", Breed.Bulldog, 10);
		Dog dog3 = new Dog("Alfy", Breed.Poodle, 5);
		System.out.println((dog1.getName() == dog2.getName()) || (dog1.getName() == dog3.getName()) || (dog3.getName() == dog2.getName()) ? "There are dogs with the same name" : "All dogs have different names");
		HomeTask3.oldestDog(dog1, dog2, dog3);
	}

}
