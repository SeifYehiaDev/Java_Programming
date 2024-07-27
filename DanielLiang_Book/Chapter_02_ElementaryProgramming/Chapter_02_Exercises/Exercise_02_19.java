/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 27/07/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_19 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, side1, side2, side3, s, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        side1 = Math.sqrt(Math.abs(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0)));
        side2 = Math.sqrt(Math.abs(Math.pow(x3 - x2, 2.0) + Math.pow(y3 - y2, 2.0)));
        side3 = Math.sqrt(Math.abs(Math.pow(x1 - x3, 2.0) + Math.pow(y1 - y3, 2.0)));
        s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(Math.abs(s * (s - side1) * (s - side2) * (s - side3)));
        System.out.printf("The area of the triangle is %.1f", area);
    }
}

//                                                 _Output_
/*
Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4
The area of the triangle is 33.6
 */