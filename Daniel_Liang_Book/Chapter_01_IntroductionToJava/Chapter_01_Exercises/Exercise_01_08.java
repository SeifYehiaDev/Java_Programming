/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 07/01/2024
 * */

package Chapter_01_Exercises;

public class Exercise_01_08 {
    public static void main(String[] args) {
        final double RADIUS = 5.5D;
        double perimeter = 2 * RADIUS * Math.PI, area = Math.pow(RADIUS, 2.0) * Math.PI;
        System.out.printf("""
                Perimeter of a circle is %.16f
                Area of a circle is %.16f""", perimeter, area);
    }
}

//                                                 _Output_
/*
Perimeter of a circle is 34.5575191894877200
Area of a circle is 95.0331777710912500
 */