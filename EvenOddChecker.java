import java.util.Scanner;

public class EvenOddChecker {

    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        return number;
    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
    public static void main(String[] args) {
        int number = getIntegerInput();
        String resultMessage = checkEvenOrOdd(number);
        System.out.println(resultMessage);
    }
}
