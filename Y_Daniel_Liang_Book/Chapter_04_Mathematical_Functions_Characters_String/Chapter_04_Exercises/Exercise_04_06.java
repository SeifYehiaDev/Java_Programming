/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 20/10/2022
 * */

package Chapter_04_Exercises;

//                                                 _Question_
                /*(Random points on a circle) Write a program that generates three random points
                on a circle centered at (0, 0) with radius 40 and display three angles in a triangle
                formed by these three points, as shown in Figure 4.7a. (Hint: Generate a random
                angle a in radians between 0 and 2pi, as shown in Figure 4.7b and the point determined
                by this angle is (r*cos(a), r*sin(a)).)*/
//                                                 _Solution_
public class Exercise_04_06 {
    public static void main(String[] args) {
        final double RADIUS = 40;
        int row, column;
        double[][] points = new double[3][3];
        double[] sides = new double[3], angles = new double[3];
        for (row = 0; row < 3; row++)
            for (column = 0; column < 3; column++)
                points[row][column] = RADIUS * ((row == 0) ? Math.cos(Math.random() * 2 * Math.PI) : Math.sin(Math.random() * 2 * Math.PI));
        sides[0] = Math.sqrt(Math.pow(points[1][0] - points[2][0], 2) + Math.pow(points[1][1] - points[2][1], 2));
        sides[1] = Math.sqrt(Math.pow(points[0][0] - points[2][0], 2) + Math.pow(points[0][1] - points[2][1], 2));
        sides[2] = Math.sqrt(Math.pow(points[0][0] - points[1][0], 2) + Math.pow(points[0][1] - points[1][1], 2));
        angles[0] = Math.toDegrees(Math.acos((Math.pow(sides[0], 2) - Math.pow(sides[1], 2) - Math.pow(sides[2], 2)) / (-2 * sides[1] * sides[2])));
        angles[1] = Math.toDegrees(Math.acos((Math.pow(sides[1], 2) - Math.pow(sides[0], 2) - Math.pow(sides[2], 2)) / (-2 * sides[0] * sides[2])));
        angles[2] = Math.toDegrees(Math.acos((Math.pow(sides[2], 2) - Math.pow(sides[1], 2) - Math.pow(sides[0], 2)) / (-2 * sides[0] * sides[1])));
        System.out.print("The three angles are ");
        for (row = 0; row < 3; row++)
            System.out.print(Math.round(angles[row] * 100) / 100.0 + " ");


    }
}

//                                                 _Output_
/*
The three angles are 107.04 24.14 48.82
 */