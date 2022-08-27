/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Physics: acceleration) Average acceleration is defined as the change of velocity
 * divided by the time taken to make the change, as shown in the following formula:
 *
 *                                         v1 - v0
 *                                     a = --------
 *                                            t
 *
 * Write a program that prompts the user to enter the starting velocity v0 in meters/second,
 * the ending velocity v1 in meters/second,and the time span t in seconds, and displays the average acceleration.
 * Here is a sample run:
 * Enter v0, v1, and t: 5.5 50.9 4.5
 * The average acceleration is 10.0889
 * */
//                                                 _Solution_
public class Exercise_02_09 {
    public static void main(String[] args) {
        float initialVelocity, endVelocity, time, averageAcceleration;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");
        initialVelocity = input.nextFloat();
        endVelocity = input.nextFloat();
        time = input.nextFloat();
        averageAcceleration = (endVelocity - initialVelocity) / time;
        System.out.println("The average acceleration is " + averageAcceleration);
    }
}

/*                                                 _Output_
 * Enter v0, v1, and t: 5.5 50.9 4.5
 * The average acceleration is 10.088889
 * */