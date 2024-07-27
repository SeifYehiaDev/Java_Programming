/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 27/07/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_08 {
    public static void main(String[] args) {
        int offset;
        long totalTimeMillis, totalSeconds, currentSeconds, totalMinutes, currentMinutes, totalHours, currentHours;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        offset = input.nextInt();
        totalTimeMillis = System.currentTimeMillis();
        totalSeconds = totalTimeMillis / 1000;
        currentSeconds = totalSeconds % 60;
        totalMinutes = totalSeconds / 60;
        currentMinutes = totalMinutes % 60;
        totalHours = totalMinutes / 60;
        currentHours = totalHours % 24 + offset;
        System.out.printf("The current time is %2d:%2d:%2d", currentHours, currentMinutes, currentSeconds);
    }
}

//                                                 _Output_
/*
Enter the time zone offset to GMT: 3
The current time is 17:45:47
 */