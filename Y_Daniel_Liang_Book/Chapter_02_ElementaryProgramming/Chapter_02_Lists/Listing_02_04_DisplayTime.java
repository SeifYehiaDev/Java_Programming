/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_04_DisplayTime {
    public static void main(String[] args) {
        int seconds, minutes, remainingSeconds;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer for seconds: ");
        seconds = input.nextInt();
        minutes = seconds / 60;
        remainingSeconds = seconds % 60;
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
    }
}
/*                                                 _Output_
 * Enter an integer for seconds: 500
 * 500 seconds is 8 minutes and 20 seconds
 * */