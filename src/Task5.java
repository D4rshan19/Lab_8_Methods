import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String SSN = InputHelper.getRegExString(scan, "Enter your SSN:", \\d{3}-\\d{2}-\\d{4});
        System.out.println("Your SSN is: " + SSN);
        scan.nextLine();
        String studentNumber = InputHelper.getRegExString(scan, "Enter your student M number:", {M|m)\\d{5});
        System.out.println("Your Student M Number is: " + studentNumber);
        scan.nextLine();
        String menuChoices = InputHelper.getRegExString(scan, "Menu: O - Open  S - Save  V - View  Q - Quit", [OoSsVvQq])
        System.out.println("You chose " + menuChoices);
    }
}
