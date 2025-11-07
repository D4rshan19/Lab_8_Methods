import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int birthYear = InputHelper.getRangedInt(scan,"Enter your birth year: ", 1950, 2010 );
        int birthMonth = InputHelper.getRangedInt(scan,"Enter your birth month ", 1, 12 );
        if (birthMonth == 9 || birthMonth == 4 || birthMonth == 6 || birthMonth == 11 ) {
            int birthDay = InputHelper.getRangedInt(scan,"Enter your birth 'day': ", 1, 30 );
        }
        else if (birthMonth == 2) {
            int birthDay = InputHelper.getRangedInt(scan, "Enter your birth 'day': ", 1, 28);
        }
            else {
                int birthDay = InputHelper.getRangedInt(scan,"Enter your birth 'day': ", 1, 31 );
            }
            int birthHour = InputHelper.getRangedInt(scan,"Enter which hour you were born on: ", 1, 24 );
            int birthSeconds= InputHelper.getRangedInt(scan,"Enter which minute you were born on ", 1, 59 );
        }
    }
}
