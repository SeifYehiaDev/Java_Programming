/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Lists;

public class Listing_03_07_LeapYear {
    public static void main(String[] args) {
        int year;
        boolean isLeapYear;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a year: ");
        year = input.nextInt();
        isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}

/*                                                 _Output One_
 * Enter a year: 2008
 * 2008 is a leap year? true
 * */

/*                                                 _Output Two_
 * Enter a year: 1900
 * 1900 is a leap year? false
 * */

/*                                                 _Output Three_
 * Enter a year: 2002
 * 2002 is a leap year? false
 * */