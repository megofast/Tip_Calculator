import java.text.NumberFormat;
import java.util.Scanner;

public class Tip_Calculator {
    public static void main(String args[]) {
        double currentItem = 0, total = 0, tax, tip;
        Scanner scan = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.println("Please enter the cost of items, when you are finished enter 0.");

        do {
            try {
                System.out.print("Value: ");
                currentItem = Double.valueOf(scan.next());
                total = total + currentItem;
            } catch (Exception e) {
                System.out.println("Incorrect input, please try again or type 0 to end input.");
            }
        } while (currentItem != 0);

        // Calculate tax amount
        tax = total * 0.025;

        // Calculate tip amount from pre-tax total
        tip = total * 0.175;

        // Print total before tax
        System.out.println("Sub-Total: " + formatter.format(total));

        System.out.println("Taxes: " + formatter.format(tax));

        System.out.println("Total: " + formatter.format(total + tax));

        System.out.println("Suggested 17.5% tip: " + formatter.format(tip));

    }
}
