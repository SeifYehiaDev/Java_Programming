/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 1/9/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Find the number of days in a month) Write a program that prompts the user
                to enter the month and year and displays the number of days in the month. For
                example, if the user entered month 2 and year 2012, the program should display
                that February 2012 had 29 days. If the user entered month 3 and year 2015, the
                program should display that March 2015 had 31 days.*/
//                                                 _Solution_
public class Exercise_03_11 {
    public static void main(String[] args) {
        int numberOfDays = 31, intMonth, year;
        String stringMonth;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month as integer: ");
        intMonth = input.nextInt();
        System.out.print("Enter the year as integer: ");
        year = input.nextInt();
        if (intMonth < 1 || intMonth > 12 || year < 0) {
            System.out.println("Error: month should be between 1 - 12 and year grater than 0.");
            System.exit(0);
        }
        numberOfDays = (intMonth == 2) ? (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28 : (intMonth == 4 || intMonth == 6 || intMonth == 9 || intMonth == 11) ? 30 : 31;
        switch (intMonth) {
            case 1:
                stringMonth = "January";
                break;
            case 2:
                stringMonth = "February";
                break;
            case 3:
                stringMonth = "March";
                break;
            case 4:
                stringMonth = "April";
                break;
            case 5:
                stringMonth = "May";
                break;
            case 6:
                stringMonth = "June";
                break;
            case 7:
                stringMonth = "July";
                break;
            case 8:
                stringMonth = "August";
                break;
            case 9:
                stringMonth = "September";
                break;
            case 10:
                stringMonth = "October";
                break;
            case 11:
                stringMonth = "November";
                break;
            default:
                stringMonth = "December";
        }
        System.out.println(stringMonth + " " + year + " had " + numberOfDays + " days.");
    }
}

/*                                                 _Output One_
 * Enter the month as integer: 0
 * Enter the year as integer: -2022
 * Error: month should be between 1 - 12 and year grater than 0.
 * */

/*                                                 _Output Two_
 * Enter the month as integer: 2
 * Enter the year as integer: 2023
 * February 23 had 28 days.
 * */

/*                                                 _Output Three_
 * Enter the month as integer: 2
 * Enter the year as integer: 2024
 * February 2024 had 29 days.
 * */

/*                                                 _Output Four_
 * Enter the month as integer: 11
 * Enter the year as integer: 2022
 * November 2022 had 30 days.
 * */

/*                                                 _Output Five_
 * Enter the month as integer: 12
 * Enter the year as integer: 2022
 * December 2022 had 31 days.
 * */