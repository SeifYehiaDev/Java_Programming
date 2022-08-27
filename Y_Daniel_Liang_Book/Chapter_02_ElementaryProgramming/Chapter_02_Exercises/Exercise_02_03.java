/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Convert feet into meters) Write a program that reads a number in feet,
 * converts it to meters, and displays the result. One foot is 0.305 meter.
 * Here is a sample run:
 * Enter a value for feet: 16.5
 * 16.5 feet is 5.0325 meters
 * */
//                                                 _Solution_
public class Exercise_02_03 {
    public static void main(String[] args) {
        final float FOOT_TO_METER = 0.305F;
        float feet ,meters;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        feet = input.nextFloat();
        meters = feet * FOOT_TO_METER;
        System.out.println(feet+" feet is "+meters+" meters");
    }
}

/*                                                 _Output_
 * Enter a value for feet: 16.5
 * 16.5 feet is 5.0325003 meters
 * */