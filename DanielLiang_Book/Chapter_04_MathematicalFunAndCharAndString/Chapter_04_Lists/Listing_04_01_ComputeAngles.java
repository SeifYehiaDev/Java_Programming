/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 10/08/2024
 * */

package Chapter_04_Lists;

import java.util.Scanner;

public class Listing_04_01_ComputeAngles {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, a, b, c, A, B, C;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        a = Math.sqrt(Math.pow(x2 - x3, 2.0) + Math.pow(y2 - y3, 2.0));
        b = Math.sqrt(Math.pow(x1 - x3, 2.0) + Math.pow(y1 - y3, 2.0));
        c = Math.sqrt(Math.pow(x1 - x2, 2.0) + Math.pow(y1 - y2, 2.0));
        A = Math.toDegrees(Math.acos((Math.pow(a, 2.0) - Math.pow(b, 2.0) - Math.pow(c, 2.0)) / (-2 * b * c)));
        B = Math.toDegrees(Math.acos((Math.pow(b, 2.0) - Math.pow(a, 2.0) - Math.pow(c, 2.0)) / (-2 * a * c)));
        C = Math.toDegrees(Math.acos((Math.pow(c, 2.0) - Math.pow(b, 2.0) - Math.pow(a, 2.0)) / (-2 * a * b)));
        System.out.printf("The three angles are %.2f %.2f %.2f", A, B, C);
    }
}

//                                                 _Output_
/*
Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: 1 1 6.5 1 6.5 2.5
The three angles are 15.26 90.00 74.74
 */