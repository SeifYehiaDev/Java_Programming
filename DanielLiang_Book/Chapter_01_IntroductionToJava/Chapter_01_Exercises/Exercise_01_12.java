/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 21/07/2024
 * */

package Chapter_01_Exercises;

public class Exercise_01_12 {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.6, DISTANCE_IN_MILES = 24;
        double timeInHour = 1 + 40 / 60.0 + 35 / 3600.0,
                speedInMph = DISTANCE_IN_MILES / timeInHour,
                speedInKph = speedInMph * KILOMETERS_PER_MILE;
        System.out.printf("""
                The average speed is %.2f miles per hour.
                The average speed is %.2f kilometers per hour.""", speedInMph, speedInKph);
    }
}

//                                                 _Output_
/*
The average speed is 14.32 miles per hour.
The average speed is 22.91 kilometers per hour.
 */