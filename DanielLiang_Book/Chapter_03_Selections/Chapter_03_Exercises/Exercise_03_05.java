/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/07/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_05 {
    public static void main(String[] args) {
        final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int day, daysElapsed, futureDay;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        day = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        daysElapsed = input.nextInt();
        futureDay = (day + daysElapsed) % 7;
        System.out.printf("Today is %s and the future day is %s", DAYS[day], DAYS[futureDay]);
    }
}

//                                                 _Output One_
/*
Enter today's day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday
 */

//                                                 _Output Two_
/*
Enter today's day: 0
Enter the number of days elapsed since today: 31
Today is Sunday and the future day is Wednesday
 */