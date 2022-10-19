/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 16/10/2022
 * */

package Chapter_04_Lists;

import java.util.Scanner;

public class Listing_04_01_ComputeAngles {
    public static void main(String[] args) {
        double points[][] = new double[3][2], sides[] = new double[3], angles[] = new double[3];
        int row, column;
        /*
         * x1 = points[0][0]  , y1 = points[0][1]
         * x2 = points[1][0]  , y2 = points[1][1]
         * x3 = points[2][0]  , y3 = points[2][1]
         * a = sides[0] , b = sides[1] , c = sides[2]
         * A = angles[0] , B = angles[1] , C = angles[2]
         * */
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter three points
        System.out.print("Enter the three points: ");
        for (row = 0; row < 3; row++)
            for (column = 0; column < 2; column++)
                points[row][column] = input.nextDouble();
        // Compute three sides
        sides[0] = Math.sqrt(Math.pow(points[1][0] - points[2][0], 2.0) + Math.pow(points[1][1] - points[2][1], 2.0));
        sides[1] = Math.sqrt(Math.pow(points[0][0] - points[2][0], 2.0) + Math.pow(points[0][1] - points[2][1], 2.0));
        sides[2] = Math.sqrt(Math.pow(points[0][0] - points[1][0], 2.0) + Math.pow(points[0][1] - points[1][1], 2.0));
        // Compute three angles
        angles[0] = Math.toDegrees(Math.acos((Math.pow(sides[0], 2.0) - Math.pow(sides[1], 2.0) - Math.pow(sides[2], 2.0)) / (-2 * sides[1] * sides[2])));
        angles[1] = Math.toDegrees(Math.acos((Math.pow(sides[1], 2.0) - Math.pow(sides[0], 2.0) - Math.pow(sides[2], 2.0)) / (-2 * sides[0] * sides[2])));
        angles[2] = Math.toDegrees(Math.acos((Math.pow(sides[2], 2.0) - Math.pow(sides[1], 2.0) - Math.pow(sides[0], 2.0)) / (-2 * sides[0] * sides[1])));
        // Display results
        System.out.print("Three angles are ");
        for (double angle : angles)
            System.out.print(Math.round(angle * 100) / 100.0 + " ");
    }
}

//                                                 _Output_
/*
Enter the three points: 1 1 6.5 1 6.5 2.5
Three angles are 15.26 90.0 74.74
*/