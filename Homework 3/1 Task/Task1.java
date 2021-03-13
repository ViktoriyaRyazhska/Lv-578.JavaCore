import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task1 task = new Task1();

        System.out.println("Enter three numbers to check if they are in range of[5:-5]");
        float firstNum = scanner.nextFloat();
        float secondNum = scanner.nextFloat();
        float thirdNum = scanner.nextFloat();
        System.out.println(task.checkRange(firstNum, secondNum, thirdNum));

        System.out.println("Enter three numbers to find max and min");
        firstNum = scanner.nextInt();
        secondNum = scanner.nextInt();
        thirdNum = scanner.nextInt();
        System.out.println("Max " + task.findMax((int)firstNum,(int)secondNum,(int)thirdNum));
        System.out.println("Min " + task.findMin((int)firstNum,(int)secondNum,(int)thirdNum));

        System.out.print("Enter number of your HTTP error(400-402): ");
        System.out.println(task.readHTTPError(scanner.nextInt()));
    }


    public boolean checkRange(float firstNum, float secondNum, float thirdNum) {

        return ((firstNum < 5) && (firstNum > -5)) && ((secondNum < 5) && (secondNum > -5)) && ((thirdNum < 5) && (thirdNum > -5));
    }

    public int findMax(int firstNum, int secondNum, int thirdNum) {

        if (firstNum > secondNum && firstNum > thirdNum) {
            return firstNum;
        } else if (secondNum > firstNum && secondNum > thirdNum) {
            return secondNum;
        } else {
            return thirdNum;
        }
    }
    public int findMin(int firstNum, int secondNum, int thirdNum){
        if (firstNum < secondNum && firstNum < thirdNum) {
            return firstNum;
        } else if (secondNum < firstNum && secondNum < thirdNum) {
            return secondNum;
        } else {
            return thirdNum;
        }
    }

    public String readHTTPError(int errorNum) {
        switch (errorNum) {
            case 400:
                return HTTPError.Bad_Request.toString();

            case 401:
                return HTTPError.Unauthorized.toString();

            case 402:
                return HTTPError.Payment_Required.toString();

            default:
                return "Input error";
        }
    }
}


enum HTTPError {
    Bad_Request, Unauthorized, Payment_Required
}
