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
        int kilometers = 14, minutes = 45, seconds = 30;
        float hours = (((seconds / 60.0F) + minutes) / 60.0F);
        System.out.println("A runner runs " + kilometers + " kilometers in " + minutes + " minutes and " + seconds + " seconds.");
        System.out.println("A runner runs " + kilometers / 1.6 / hours + " miles per hour.");
    }
}
/*                                                 _Output_
 * A runner runs 14 kilometers in 45 minutes and 30 seconds.
 * A runner runs 11.538461659383897 miles per hour.
 * */