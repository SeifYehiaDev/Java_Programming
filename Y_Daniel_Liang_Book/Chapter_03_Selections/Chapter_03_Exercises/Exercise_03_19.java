/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 15/9/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                    /*(Compute the perimeter of a triangle) Write a program that reads three edges for
                    a triangle and computes the perimeter if the input is valid. Otherwise, display that
                    the input is invalid. The input is valid if the sum of every pair of two edges is
                    greater than the remaining edge.*/
//                                                 _Solution_
public class Exercise_03_19 {
    public static void main(String[] args) {
        double side1, side2, side3, edges[][] = new double[3][2];
        boolean valid;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three edges for a triangle:");
        for (int row = 0; row < 3; row++) {
            System.out.print(" Edge " + (row + 1) + " points x, y: ");
            for (int column = 0; column < 2; column++)
                edges[row][column] = input.nextDouble();
        }
        /*
         * x1 = edges[0][0] , y1 = edges[0][1]
         * x2 = edges[1][0] , y2 = edges[1][1]
         * x3 = edges[2][0] , y3 = edges[2][1]
         * */
        valid = (edges[0][0] + edges[0][1] > edges[2][0] + edges[2][1] && edges[1][0] + edges[1][1] > edges[2][0] + edges[2][1]) ||
                (edges[2][0] + edges[2][1] > edges[0][0] + edges[0][1] && edges[1][0] + edges[1][1] > edges[0][0] + edges[0][1]) ||
                (edges[2][0] + edges[2][1] > edges[1][0] + edges[1][1] && edges[0][0] + edges[0][1] > edges[1][0] + edges[1][1]);
        if (!valid) {
            System.out.println("Input is invalid.");
            System.exit(0);
        }
        side1 = Math.sqrt(Math.pow((edges[1][0] - edges[0][0]), 2.0) + Math.pow(edges[1][1] - edges[0][1], 2.0));
        side2 = Math.sqrt(Math.pow((edges[2][0] - edges[1][0]), 2.0) + Math.pow(edges[2][1] - edges[1][1], 2.0));
        side3 = Math.sqrt(Math.pow((edges[0][0] - edges[2][0]), 2.0) + Math.pow(edges[0][1] - edges[2][1], 2.0));
        System.out.println("perimeter of triangle is " + (side1 + side2 + side3));
    }
}

/*                                                 _Output_
 * Enter three edges for a triangle:
 *  Edge 1 points x, y: 5 6
 *  Edge 2 points x, y: 3 4
 *  Edge 3 points x, y: 1 2
 * perimeter of triangle is 11.313708498984761
 * */