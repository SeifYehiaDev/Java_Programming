/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 07/01/2024
 * */

package Chapter_01_Exercises;

public class Exercise_01_12 {
    public static void main(String[] args) {
        final int DISTANCE_IN_MILES = 24;
        final double KILOMETERS_PER_MILE = 1.6D;
        double  distanceInKilometers = DISTANCE_IN_MILES * KILOMETERS_PER_MILE,
                timeInHours = 1 + 40 / 60.0 + 35 / 3600.0,
                speedInKph = distanceInKilometers / timeInHours;
        System.out.printf("""
                        A runner runs 24 miles in 1 hour , 40 minutes, and 35 seconds.
                        A runner runs %.16f kilometers per hour.""", speedInKph);
    }
}

//                                                 _Output_
/*
A runner runs 24 miles in 1 hour , 40 minutes, and 35 seconds.
A runner runs 22.9063794531897320 kilometers per hour.
 */