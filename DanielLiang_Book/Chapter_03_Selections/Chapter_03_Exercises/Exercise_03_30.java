/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_30 {
    public static void main(String[] args) {
        int offset;
        long totalSecond = System.currentTimeMillis() / 1000, seconds, totalMinutes, minutes, totalHours, hours;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        offset = input.nextInt();
        seconds = totalSecond % 60;
        totalMinutes = totalSecond / 60;
        minutes = totalMinutes % 60;
        totalHours = totalMinutes / 60;
        hours = totalHours % 24 + offset;
        System.out.printf("The current time is %02d:%02d:%02d %s", hours % 12, minutes, seconds, (hours > 12) ? "PM" : "AM");
    }
}

//                                                 _Output_
/*
Enter the time zone offset to GMT: 3
The current time is 08:39:03 PM
 */