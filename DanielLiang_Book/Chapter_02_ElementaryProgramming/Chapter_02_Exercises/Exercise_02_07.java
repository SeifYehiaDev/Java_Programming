/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 27/07/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_07 {
    public static void main(String[] args) {
        final int MINUTES_IN_DAY = 1_440;
        long minutes, totalDays, years, days;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        minutes = input.nextLong();
        totalDays = minutes / MINUTES_IN_DAY;
        years = totalDays / 365;
        days = totalDays % 365;
        System.out.printf("%d minutes is approximately %d years and %d days", minutes, years, days);
    }
}

//                                                 _Output_
/*
Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days
 */