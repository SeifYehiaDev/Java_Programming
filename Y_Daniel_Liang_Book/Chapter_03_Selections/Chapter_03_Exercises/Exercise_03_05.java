/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 31/8/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                _Question_
                /*(Find future dates) Write a program that prompts the user to enter an integer for
                today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
                prompt the user to enter the number of days after today for a future day and display
                the future day of the week.*/
//                                                 _Solution_
public class Exercise_03_05 {
    public static void main(String[] args) {
        int today, numberOfDays;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        numberOfDays = input.nextInt();
        if (today >= 0 && today <= 6 && numberOfDays >= 0)
            System.out.println("Today is " + findDay(today) + " and the future day is " + findDay((today + numberOfDays) % 7));
        else
            System.out.println("invalid input");
    }

    public static String findDay(int day) {
        String dayInEnglish;
        switch (day) {
            case 0:
                dayInEnglish = "Sunday";
                break;
            case 1:
                dayInEnglish = "Monday";
                break;
            case 2:
                dayInEnglish = "Tuesday";
                break;
            case 3:
                dayInEnglish = "Wednesday";
                break;
            case 4:
                dayInEnglish = "Thursday";
                break;
            case 5:
                dayInEnglish = "Friday";
                break;
            default:
                dayInEnglish = "Saturday";
        }
        return dayInEnglish;
    }
}

/*                                                 _Output One_
 * Enter today's day: 3
 * Enter the number of days elapsed since today: 3
 * Today is Wednesday and the future day is Saturday
 * */

/*                                                 _Output Two_
 * Enter today's day: 3
 * Enter the number of days elapsed since today: 0
 * Today is Wednesday and the future day is Wednesday
 * */

/*                                                 _Output Three_
 * Enter today's day: 7
 * Enter the number of days elapsed since today: 100
 * invalid input
 * */

/*                                                 _Output Three_
 * Enter today's day: 7
 * Enter the number of days elapsed since today: -5
 * invalid input
 * */