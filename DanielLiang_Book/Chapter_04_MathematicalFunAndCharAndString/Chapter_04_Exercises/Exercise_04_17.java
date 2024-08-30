/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_17 {
    public static void main(String[] args) {
        final String[] MONTH = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int year, intMonth = 0;
        String month;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = input.nextInt();
        input.nextLine();
        System.out.print("Enter a month: ");
        month = input.nextLine().trim();
        for (int mon = 0; mon < 12 && intMonth == 0; mon++)
            if (MONTH[mon].equals(month)) intMonth = mon + 1;
        if (intMonth != 0)
            System.out.printf("%s %d has %d days", month, year, (intMonth == 2) ? (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28 : (intMonth == 4 || intMonth == 6 || intMonth == 9 || intMonth == 11) ? 30 : 31);
        else
            System.out.print("Error: invalid month");
    }
}

//                                                 _Output One_
/*
Enter a year: 2001
Enter a month: Jan
Jan 2001 has 31 days
 */

//                                                 _Output Two_
/*
Enter a year: 2016
Enter a month: Feb
Feb 2016 has 29 days
 */

//                                                 _Output Three_
/*
Enter a year: 2024
Enter a month: Oct
Oct 2024 has 31 days
 */

//                                                 _Output Four_
/*
Enter a year: 2024
Enter a month: Sei
Error: invalid month
 */