/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays the current time in GMT.
 * Revise the program so that it prompts the user to enter the time zone offset to GMT and displays the time
 * in the specified time zone.
 * Here is a sample run:
 * Enter the time zone offset to GMT: −5
 * The current time is 4:50:34
 * */
//                                                 _Solution_
public class Exercise_02_08 {
    public static void main(String[] args) {
        long totalMilliseconds, totalSeconds, currentSecond, totalMinutes, currentMinute, totalHours, currentHour;
        int offset;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        offset = input.nextInt();
        totalMilliseconds = System.currentTimeMillis();
        totalSeconds = totalMilliseconds / 1000;
        currentSecond = totalSeconds % 60;
        totalMinutes = totalSeconds / 60;
        currentMinute = totalMinutes % 60;
        totalHours = totalMinutes / 60;
        currentHour = totalHours % 24;
        currentHour = currentHour + offset;
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}

/*                                                 _Output_
 * Enter the time zone offset to GMT: -5
 * Current time is 8:45:58
 * */