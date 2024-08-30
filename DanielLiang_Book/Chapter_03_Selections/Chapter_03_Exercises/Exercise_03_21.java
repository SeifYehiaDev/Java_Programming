/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_21 {
    public static void main(String[] args) {
        String[] DAYS = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int year, month, dayOfMonth, dayOfWeek;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2025): ");
        year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        month = input.nextInt();
        System.out.print("Enter the day of the month: ");
        dayOfMonth = input.nextInt();
        if (month == 1 || month == 2) {
            month = (month == 1) ? 13 : 14;
            year--;
        }
        dayOfWeek = (dayOfMonth + ((26 * (month + 1)) / 10) + (year % 100) + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;
        System.out.printf("Day of the week is %s", DAYS[dayOfWeek]);
    }
}

//                                                 _Output One_
/*
Enter year: (e.g., 2025): 2015
Enter month: 1-12: 1
Enter the day of the month: 25
Day of the week is Sunday
 */

//                                                 _Output Two_
/*
Enter year: (e.g., 2025): 2015
Enter month: 1-12: 1
Enter the day of the month: 25
Day of the week is Sunday
 */

//                                                 _Output Three_
/*
Enter year: (e.g., 2025): 2024
Enter month: 1-12: 8
Enter the day of the month: 30
Day of the week is Friday
 */