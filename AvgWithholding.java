
import java.util.Scanner;

public class AvgWithholding {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weekly amount: ");

        double[] taxRates = {0.1, 0.15, 0.2, 0.3};

        double userInput = scanner.nextDouble();
        //String stringHoldingOutput = Double.toString(userInput);
        String formattedMessage = "Weekly withholdings: $";

        if (userInput < 500) {
            System.out.println(formattedMessage + (userInput * taxRates[0]));
        } else if (userInput >= 500 && userInput < 1500) {
            System.out.println(formattedMessage + (userInput * taxRates[1]));
        } else if (userInput >= 1500 && userInput < 2500) {
            System.out.println(formattedMessage + (userInput * taxRates[2]));
        } else {
            System.out.println(formattedMessage + (userInput * taxRates[3]));
        }

    }
}
