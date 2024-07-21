/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 21/07/2024
 * */

package Chapter_01_Exercises;

public class Exercise_01_10 {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.6, DISTANCE_IN_KILOMETERS = 14;
        double timeInHour = 45.5 / 60.0,
                speedInKph = DISTANCE_IN_KILOMETERS / timeInHour,
                speedInMph = speedInKph / KILOMETERS_PER_MILE;
        System.out.printf("""
                The average speed is %.2f kilometers per hour.
                The average speed is %.2f miles per hour.""", speedInKph, speedInMph);
    }
}

//                                                 _Output_
/*
The average speed is 18.46 kilometers per hour.
The average speed is 11.54 miles per hour.
 */