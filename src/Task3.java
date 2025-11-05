import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int birthYear = InputHelper.getRangedInt(scan,"Enter your birth year: ", 1950, 2010 );
        int birthMonth = InputHelper.getRangedInt(scan,"Enter your birth month ", 1, 12 );
        if (birthMonth.equals 9 || birthMonth.equals 4 || birthMonth.equals 6 || birthMonth.equals 11 ) {
            int birthDay = InputHelper.getRangedInt(scan,"Enter your birth 'day': ", 1, 30 );
        }
        else if (birthMonth.equals 29) {
            int birthDay = InputHelper.getRangedInt(scan,"Enter your birth 'day': ", 1, 28 );
            else {
                int birthDay = InputHelper.getRangedInt(scan,"Enter your birth 'day': ", 1, 30 );
            }
            int birthHour = InputHelper.getRangedInt(scan,"Enter which hour you were born on: ", 1, 24 );
            int birthSeconds= InputHelper.getRangedInt(scan,"Enter which minute you were born on ", 1, 60 );
        }
    }
}
