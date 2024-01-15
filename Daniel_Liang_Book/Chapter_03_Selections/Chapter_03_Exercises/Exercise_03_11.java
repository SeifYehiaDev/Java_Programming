/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 15/01/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_11 {
    public static void main(String[] args) {
        final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int month, year, days;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month as integer: ");
        month = input.nextInt();
        System.out.print("Enter the year as integer: ");
        year = input.nextInt();
        days = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? (month == 2) ? 29 : 28 : (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;
        System.out.printf("%s %d had %d days.", MONTHS[month - 1], year, days);
    }
}

//                                                 _Output One_
/*
Enter the month as integer: 2
Enter the year as integer: 2024
February 2024 had 29 days.
 */

//                                                 _Output Two_
/*
Enter the month as integer: 3
Enter the year as integer: 2015
March 2015 had 31 days.
 */