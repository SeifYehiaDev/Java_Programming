/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 20/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

//                                                 _Question_
            /*(Days of a month) Write a program that prompts the user to enter a year and the
            first three letters of a month name (with the first letter in uppercase) and displays
            the number of days in the month.*/
//                                                 _Solution_
public class Exercise_04_17 {
    public static void main(String[] args) {
        int years, numberOfDays, intMonth;
        String stringMonth;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        years = input.nextInt();
        input.nextLine();
        System.out.print("Enter a month: ");
        stringMonth = input.nextLine();
        if (years < 0 || stringMonth.length() != 3 || Character.isLowerCase(stringMonth.charAt(0))) {
            if (years < 0)
                System.out.println("Error: year must be grater than 0");
            if (stringMonth.length() != 3)
                System.out.println("Error: enter the first three letters of a month name");
            if (Character.isLowerCase(stringMonth.charAt(0)))
                System.out.println("Error: first letter must be in uppercase");
            System.exit(1);
        }
        switch (stringMonth) {
            case "Jan": intMonth = 1; break;
            case "Feb": intMonth = 2; break;
            case "Mar": intMonth = 3; break;
            case "Apr": intMonth = 4; break;
            case "May": intMonth = 5; break;
            case "Jun": intMonth = 6; break;
            case "Jul": intMonth = 7; break;
            case "Aug": intMonth = 8; break;
            case "Sep": intMonth = 9; break;
            case "Oct": intMonth = 10; break;
            case "Nov": intMonth = 11; break;
            case "Dec": intMonth = 12; break;
            default: intMonth = 0;
        }
        numberOfDays = (intMonth == 2) ? (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) ? 29 : 28 : (intMonth == 4 || intMonth == 6 || intMonth == 9 || intMonth == 11) ? 30 : 31;
        System.out.println((intMonth == 0) ? "Wrong month!" : stringMonth.concat(" ") + years + " has " + numberOfDays + " days");
    }
}

//                                                 _Output One_
/*
Enter a year: 2016
Enter a month: Jan
Jan 2016 has 31 days
 */

//                                                 _Output Two_
/*
Enter a year: 2016
Enter a month: Feb
Feb 2016 has 29 days
 */

//                                                 _Output Three_
/*
Enter a year: 2022
Enter a month: Oct
Oct 2022 has 31 days
 */

//                                                 _Output Four_
/*
Enter a year: -5
Enter a month: Oct
Error: year must be grater than 0
 */

//                                                 _Output Five_
/*
Enter a year: 2022
Enter a month: October
Error: enter the first three letters of a month name
 */

//                                                 _Output Six_
/*
Enter a year: 2022
Enter a month: oct
Error: first letter must be in uppercase
 */

//                                                 _Output Seven_
/*
Enter a year: 2022
Enter a month: Sei
Wrong month!
 */

//                                                 _Output 8_
/*
Enter a year: -5
Enter a month: seif
Error: year must be grater than 0
Error: enter the first three letters of a month name
Error: first letter must be in uppercase
 */