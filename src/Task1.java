import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userName = InputHelper.getZeroLengthString(scan, "Enter your username: ");
        scan.nextLine();
        System.out.println("Your username is " + userName);
    }
}
