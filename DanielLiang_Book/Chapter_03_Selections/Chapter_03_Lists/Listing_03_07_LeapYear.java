/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 29/07/2024
 * */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_07_LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = input.nextInt();
        System.out.printf("%d is a leap year? %b", year, year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}

//                                                 _Output One_
/*
Enter a year: 2008
2008 is a leap year? true
 */

//                                                 _Output Two_
/*
Enter a year: 1900
1900 is a leap year? false
 */