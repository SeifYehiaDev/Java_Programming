/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 21/07/2024
 * */

package Chapter_01_Exercises;

public class Exercise_01_08 {
    public static void main(String[] args) {
        final double RADIUS = 5.5;
        double perimeter = 2 * Math.PI * RADIUS,
                area = Math.PI * Math.pow(RADIUS, 2.0);
        System.out.printf("""
                The perimeter for the circle of radius %.1f is %.14f.
                The area for the circle of radius %.1f is %.14f.""", RADIUS, perimeter, RADIUS, area);
    }
}

//                                                 _Output_
/*
The perimeter for the circle of radius 5.5 is 34.55751918948772.
The area for the circle of radius 5.5 is 95.03317777109125.
 */