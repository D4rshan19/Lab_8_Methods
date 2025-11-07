import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalCost = 0;
        valid = false;
        do {
            double itemPrice  = InputHelper.getRangedDouble(scan, "Enter price of item ($):", 0.50, 9.99);
            scan.nextLine();
            totalCost += itemPrice;
            String YNConfirm = InputHelper.getYNConfirm(scan, "Do you want to add another item? [Y/N]: ");
            valid = true;
        } while (!valid);
    } System.out.printf("%-10s %5.1f", "Your total cost is" + totalCost);
}
