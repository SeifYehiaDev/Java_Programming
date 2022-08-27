/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Find the number of years) Write a program that prompts the user to enter the minutes (e.g., 1 billion),
 * and displays the number of years and days for the minutes For simplicity, assume a year has 365 days.
 * Here is a sample run:
 * Enter the number of minutes: 1000000000
 * 1000000000 minutes is approximately 1902 years and 214 days
 * */
//                                                 _Solution_
public class Exercise_02_07 {
    public static void main(String[] args) {
        final long NUMBER_OF_MINUTES_IN_YEAR = 525600L; // 365 * 24 * 60 = 525600 MINUTES
        final int NUMBER_OF_MINUTES_IN_Day = 1440; // 24 * 60 = 1440 MINUTES
        long minutes, years, days;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        minutes = input.nextLong();
        years = minutes / NUMBER_OF_MINUTES_IN_YEAR;
        /*
         * 1 day = 1440 minutes
         * x day = (minutes % NUMBER_OF_MINUTES_IN_YEAR) minutes
         * */
        days = minutes % NUMBER_OF_MINUTES_IN_YEAR / NUMBER_OF_MINUTES_IN_Day;
        System.out.println(minutes + " minutes is approximately " + years + " and " + days + " days");
    }
}

/*                                                 _Output_
 * Enter the number of minutes: 1000000000
 * 1000000000 minutes is approximately 1902 and 214 days
 * */