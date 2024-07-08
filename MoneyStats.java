
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MoneyStats {

    // function display results
    public static void main(String[] args) {

        // data types
        ArrayList<Double> userInputList = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        int maxInputs = 5;
        double interestRate = 0.20;

        // loop user input
        for (int i = 0; i < maxInputs; i++) {
            double num = 0;
            System.out.println("Enter a number: $");
            num = scanner.nextDouble();
            total += num;
            userInputList.add(num);
        }

        //scanning no longer required
        scanner.close();

        //Adds space after user input
        System.out.println("");

        //outputs
        // Convert double to float using type casting
        float floatTotal = (float) total;
        System.out.println("Total Value: $" + floatTotal);

        //Outputs converted from double to float via casting.
        double max = Collections.max(userInputList);
        float floatMax = (float) max;
        System.out.println("Max Value: $" + floatMax);

        double min = Collections.min(userInputList);
        float floatMin = (float) min;
        System.out.println("Min Value: $" + floatMin);

        double avg = total / maxInputs;
        float floatAvg = (float) avg;
        System.out.println("Average Value: $" + floatAvg);

        double totalInterest = total * interestRate;
        float floatTotalInterest = (float) totalInterest;
        System.out.println("Interest Value: $" + floatTotalInterest);

    }
}
