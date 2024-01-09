/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 09/01/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_08 {
    public static void main(String[] args) {
        int offset;
        long totalSeconds = System.currentTimeMillis() / 1000, hours, minutes, seconds;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        offset = input.nextInt();
        seconds = totalSeconds % 60;
        minutes = (totalSeconds /= 60) % 60;
        hours = (totalSeconds /= 60) % 24 + offset;
        System.out.printf("The current time is %02d:%02d:%02d", hours, minutes, seconds);
    }
}

//                                                 _Output_
/*
Enter the time zone offset to GMT: +2
The current time is 10:20:23
 */