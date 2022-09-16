/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 15/9/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                        /*(Science: day of the week) Zeller’s congruence is an algorithm developed by
                        Christian Zeller to calculate the day of the week. The formula is*/
//                                                 _Solution_
public class Exercise_03_21 {
    public static void main(String[] args) {
        int h, q, m, j, k, year, numberOfDays = Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        year = input.nextInt();
        if (year < 0)
            error("Error: year is a negative number.");
        System.out.print("Enter month: 1-12: ");
        m = input.nextInt();
        if (m >= 1 && m <= 12) {
            numberOfDays = (m == 2) ? (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28 : (m == 4 || m == 6 || m == 9 || m == 11) ? 30 : 31;
            if (m == 1 || m == 2) {
                m = (m == 1) ? 13 : 14;
                year--;
            }
        } else
            error("Error: month should be between 1 and 12.");
        System.out.print("Enter the day of the month: 1-" + numberOfDays + ": ");
        q = input.nextInt();
        if (q < 1 || q > numberOfDays)
            error("Error: number of days should be between 1 and " + numberOfDays);
        j = year / 100;
        k = year % 100;
        h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        System.out.println("Day of the week is " + dayOfTheWeek(h));
    }

    public static void error(String message) {
        System.out.println(message);
        System.exit(0);
    }

    public static String dayOfTheWeek(int day) {
        String stringDay = null;
        switch (day) {
            case 0:
                stringDay = "Saturday";
                break;
            case 1:
                stringDay = "Sunday";
                break;
            case 2:
                stringDay = "Monday";
                break;
            case 3:
                stringDay = "Tuesday";
                break;
            case 4:
                stringDay = "Wednesday";
                break;
            case 5:
                stringDay = "Thursday";
                break;
            case 6:
                stringDay = "Friday";
        }
        return stringDay;
    }
}

/*                                                 _Output One_
 * Enter year: (e.g., 2012): 2015
 * Enter month: 1-12: 1
 * Enter the day of the month: 1-31: 25
 * Day of the week is Sunday
 * */

/*                                                 _Output Two_
 * Enter year: (e.g., 2012): 2022
 * Enter month: 1-12: 2
 * Enter the day of the month: 1-28: 28
 * Day of the week is Monday
 * */

/*                                                 _Output Two_
 * Enter year: (e.g., 2012): 2022
 * Enter month: 1-12: 2
 * Enter the day of the month: 1-28: 29
 * Error: number of days should be between 1 and 28
 * */