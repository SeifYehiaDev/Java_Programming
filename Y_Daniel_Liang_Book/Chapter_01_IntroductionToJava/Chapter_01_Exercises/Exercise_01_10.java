/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_01_Exercises;

/*                                                 _Question_
 * (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
 *  Write a program that displays the average speed in miles per hour.
 * (Note that 1 mile is 1.6 kilometers.)
 * */
//                                                 _Solution_
public class Exercise_01_10 {
    public static void main(String[] args) {
        final float KILOMETERS = 14.0F, MINUTES = 45.0F, SECONDS = 30.0F;
        float hours = (((SECONDS / 60) + MINUTES) / 60);
        System.out.println("A runner runs " + KILOMETERS + " kilometers in " + MINUTES + " minutes and " + SECONDS + " seconds.");
        System.out.println("A runner runs " + KILOMETERS / 1.6 / hours + " miles per hour.");
    }
}
/*                                                 _Output_
 * A runner runs 14.0 kilometers in 45.0 minutes and 30.0 seconds.
 * A runner runs 11.538461659383897 miles per hour.
 * */