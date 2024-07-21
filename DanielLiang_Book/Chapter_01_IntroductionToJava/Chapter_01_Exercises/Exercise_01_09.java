/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 21/07/2024
 * */

package Chapter_01_Exercises;

public class Exercise_01_09 {
    public static void main(String[] args) {
        final double WIDTH = 4.5, HEIGHT = 7.9;
        double perimeter = 2 * (WIDTH + HEIGHT),
                area = WIDTH * HEIGHT;
        System.out.printf("""
                The perimeter for the rectangle is %.2f.
                The area for the rectangle is %.2f.""", perimeter, area);
    }
}

//                                                 _Output_
/*
The perimeter for the rectangle is 24.80.
The area for the rectangle is 35.55.
 */