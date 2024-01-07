/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 07/01/2024
 * */

package Chapter_01_Exercises;

public class Exercise_01_10 {
    public static void main(String[] args) {
        final int DISTANCE_IN_KILOMETERS = 14, MINUTES_PER_HOUR = 60;
        final double KILOMETERS_PER_MILE = 1.6D, TIME_IN_MINUTES = 45.5D;
        double distanceInMiles = DISTANCE_IN_KILOMETERS / KILOMETERS_PER_MILE,
                timeInHours = TIME_IN_MINUTES / MINUTES_PER_HOUR,
                speedInMph = distanceInMiles / timeInHours;
        System.out.printf("""
                        A runner runs 14 kilometers in 45 minutes and 30 seconds.
                        A runner runs %.16f miles per hour.""", speedInMph);
    }
}

//                                                 _Output_
/*
A runner runs 14 kilometers in 45 minutes and 30 seconds.
A runner runs 11.5384615384615380 miles per hour.
 */