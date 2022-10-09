/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 9/10/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Current time) Revise Programming Exercise 2.8 to display the hour using a
                12-hour clock. Here is a sample run:*/
//                                                 _Solution_
public class Exercise_03_30 {
    public static void main(String[] args) {
        long totalMillisSecond, totalSecond, currentSeconds, totalMinutes, currentMinutes, totalHours, currentHours;
        int offset;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        offset = input.nextInt();
        totalMillisSecond = System.currentTimeMillis();
        totalSecond = totalMillisSecond / 1000;
        currentSeconds = totalSecond % 60;
        totalMinutes = totalSecond / 60;
        currentMinutes = totalMinutes % 60;
        totalHours = totalMinutes / 60;
        currentHours = totalHours % 24;
        currentHours += offset;
        System.out.println("Current time is " + (((currentHours > 12)) ? currentHours - 12 : currentHours) + ":" + currentMinutes + ":" + currentSeconds + ((currentHours > 12) ? " PM" : " AM"));
    }
}

/*                                                 _Output_
 * Enter the time zone offset to GMT: 2
 * Current time is 6:27:33
 * */