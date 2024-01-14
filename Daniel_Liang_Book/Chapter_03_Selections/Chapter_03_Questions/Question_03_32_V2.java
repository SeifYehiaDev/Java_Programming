/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 14/01/2024
 * */

package Chapter_03_Questions;

public class Question_03_32_V2 {
    public static void main(String[] args) {
        final String[] DAYS_IN_WEEK = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int day = 6;
        System.out.print("""
                ■ Write a switch statement that displays Sunday, Monday, Tuesday, Wednesday,
                Thursday, Friday, Saturday, if day is 0, 1, 2, 3, 4, 5, 6, accordingly.
                                
                day 6 is:
                """);
        System.out.print(DAYS_IN_WEEK[day]);
    }
}

//                                                 _Output_
/*
■ Write a switch statement that displays Sunday, Monday, Tuesday, Wednesday,
Thursday, Friday, Saturday, if day is 0, 1, 2, 3, 4, 5, 6, accordingly.

day 6 is:
Saturday
 */