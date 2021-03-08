import java.util.Scanner;

public class Homework3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How price in Ukraine?");
        double priceInUkraine = sc.nextDouble(); // 0.3 USD
        System.out.println("How price in France?");
        double priceInFrance = sc.nextDouble(); // 0.5 USD
        System.out.println("How price in Germany?");
        double priceInGermany = sc.nextDouble(); // 0.2 USD
        System.out.println("Duration of first call?");
        int timeFirstCall = sc.nextInt();
        System.out.println("Duration of second call?");
        int timeSecondCall = sc.nextInt();
        System.out.println("Duration of third call?");
        int timeThirdCall = sc.nextInt();

        double firstCallCost = priceInUkraine * timeFirstCall;
        double secondCallCost = priceInFrance * timeSecondCall;
        double thirdCallCost = priceInGermany * timeThirdCall;

        double sumOfCallsCost = firstCallCost + secondCallCost + thirdCallCost;

        System.out.println("\n Cost of the first call is " + firstCallCost + " USD"
                + "\n Cost of the second call is " + secondCallCost + " USD"
                + "\n Cost of the third call is " + thirdCallCost + " USD"
                + "\n Sum of all calls cost is " + sumOfCallsCost);
    }
}
