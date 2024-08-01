/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 01/08/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_19 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, side1, side2, side3, perimeter;
        Scanner input = new Scanner(System.in);
        System.out.print("Edge 1 points x, y: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.print("Edge 2 points x, y: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        System.out.print("Edge 3 points x, y: ");
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        boolean valid = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) ||
                (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) ||
                (x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1);
        if (!valid) {
            System.out.println("Input is invalid.");
            System.exit(1);
        }
        side1 = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));
        side2 = Math.sqrt(Math.pow(x3 - x2, 2.0) + Math.pow(y3 - y2, 2.0));
        side3 = Math.sqrt(Math.pow(x1 - x3, 2.0) + Math.pow(y1 - y3, 2.0));
        perimeter = side1 + side2 + side3;
        System.out.printf("Perimeter of triangle is  %.15f", perimeter);
    }
}

//                                                 _Output_
/*
Edge 1 points x, y: 5 6
Edge 2 points x, y: 3 4
Edge 3 points x, y: 1 2
Perimeter of triangle is  11.313708498984761
 */