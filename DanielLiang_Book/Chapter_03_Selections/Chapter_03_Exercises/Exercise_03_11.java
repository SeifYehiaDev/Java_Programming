/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 31/07/2024
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
        days = (month == 2) ? (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28 : (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;
        System.out.printf("%s %d had %d days", MONTHS[month - 1], year, days);
    }
}

//                                                 _Output One_
/*
Enter the month as integer: 2
Enter the year as integer: 2024
February 2024 had 29 days
 */

//                                                 _Output Two_
/*
Enter the month as integer: 2
Enter the year as integer: 2023
February 2023 had 28 days
 */

//                                                 _Output Three_
/*
Enter the month as integer: 8
Enter the year as integer: 2024
August 2024 had 31 days
 */

//                                                 _Output Four_
/*
Enter the month as integer: 11
Enter the year as integer: 2024
November 2024 had 30 days
 */