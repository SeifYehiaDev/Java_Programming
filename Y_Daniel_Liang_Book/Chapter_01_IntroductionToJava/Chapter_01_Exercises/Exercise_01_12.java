/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_01_Exercises;

/*                                                 _Question_
 * (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
 * Write a program that displays the average speed in kilometers per hour.
 * (Note that 1 mile is 1.6 kilometers.)
 * */
//                                                 _Solution_
public class Exercise_01_12 {
    public static void main(String[] args) {
        final float MILES = 24.0F, HOURS = 1.0F, MINUTES = 40.F, SECONDS = 35.0F;
        float hours = (((SECONDS / 60) + MINUTES) / 60) + HOURS;
        System.out.println("A runner runs " + MILES + " miles in " + HOURS + " hour , " + MINUTES + " minutes, and " + SECONDS + " seconds.");
        System.out.println("A runner runs " + MILES * 1.6 / hours + " kilometers per hour.");
    }
}

/*                                                 _Output_
 * A runner runs 24.0 miles in 1.0 hour , 40.0 minutes, and 35.0 seconds.
 * A runner runs 22.906379851362868 kilometers per hour.
 * */