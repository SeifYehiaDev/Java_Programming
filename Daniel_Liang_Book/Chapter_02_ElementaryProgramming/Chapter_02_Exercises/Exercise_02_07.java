/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 09/01/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_07 {
    public static void main(String[] args) {
        final int MINUTES_IN_YEAR = 525_600, MINUTES_IN_DAY = 1440;
        long minutes, days, years;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        minutes = input.nextLong();
        years = minutes / MINUTES_IN_YEAR;
        days = minutes % MINUTES_IN_YEAR / MINUTES_IN_DAY;
        System.out.print(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}

//                                                 _Output_
/*
Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days
 */