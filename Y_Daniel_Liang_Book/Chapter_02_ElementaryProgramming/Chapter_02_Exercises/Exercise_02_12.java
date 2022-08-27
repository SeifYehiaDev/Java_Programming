/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off speed v, you can compute
 * the minimum runway length needed for an airplane to take off using the following formula:
 *                                                       v^2
 *                                            length = -------
 *                                                       2a
 * Write a program that prompts the user to enter v in meters/second (m/s) and
 * the acceleration a in meters/second squared (m/s2), and displays the minimum runway length.
 * Here is a sample run:
 * Enter speed and acceleration: 60 3.5
 * The minimum runway length for this airplane is 514.286
 * */
//                                                 _Solution_
public class Exercise_02_12 {
    public static void main(String[] args) {
        double velocity, acceleration, length;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        velocity = input.nextDouble();
        acceleration = input.nextDouble();
        length = Math.pow(velocity, 2.0) / (2 * acceleration);
        System.out.printf("The minimum runway length for this airplane is %.3f", length);
        //System.out.println("The minimum runway length for this airplane is " + length);
    }
}

/*                                                 _Output_
 * Enter speed and acceleration: 60 3.5
 * The minimum runway length for this airplane is 514.286
 * */