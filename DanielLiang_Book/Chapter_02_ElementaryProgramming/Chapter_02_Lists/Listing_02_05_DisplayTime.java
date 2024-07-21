/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 22/07/2024
 * */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_05_DisplayTime {
    public static void main(String[] args) {
        int totalSeconds, remainingSeconds, minutes;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer for seconds: ");
        totalSeconds = input.nextInt();
        minutes = totalSeconds / 60;
        remainingSeconds = totalSeconds % 60;
        System.out.printf("%d seconds is %d minutes and %d seconds", totalSeconds, minutes, remainingSeconds);
    }
}

//                                                 _Output_
/*
Enter an integer for seconds: 500
500 seconds is 8 minutes and 20 seconds
 */