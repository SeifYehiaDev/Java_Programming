/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 20/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Geometry: great circle distance) The great circle distance is the distance between
                two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical
                latitude and longitude of two points. The great circle distance between the two
                points can be computed using the following formula:
                d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
                Write a program that prompts the user to enter the latitude and longitude of two
                points on the earth in degrees and displays its great circle distance. The average
                earth radius is 6,371.01 km. Note that you need to convert the degrees into radians
                using the Math.toRadians method since the Java trigonometric methods use
                radians. The latitude and longitude degrees in the formula are for north and west.
                Use negative to indicate south and east degrees.*/
//                                                 _Solution_
public class Exercise_04_02 {
    public static void main(String[] args) {
        final double RADIUS = 6_371.01D;
        double distance;
        String[] stringPoints = new String[2];
        double[][] doublePoints = new double[2][2];
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < stringPoints.length; row++) {
            System.out.print("Enter point " + (row + 1) + " (latitude and longitude) in degrees: ");
            stringPoints[row] = input.nextLine();
        }
        doublePoints[0][0] = Math.toRadians(Double.parseDouble(stringPoints[0].substring(0, stringPoints[0].indexOf(',')).trim())); // x1
        doublePoints[0][1] = Math.toRadians(Double.parseDouble(stringPoints[0].substring(stringPoints[0].indexOf(',') + 1).trim())); // y1
        doublePoints[1][0] = Math.toRadians(Double.parseDouble(stringPoints[1].substring(0, stringPoints[1].indexOf(',')).trim())); // x2
        doublePoints[1][1] = Math.toRadians(Double.parseDouble(stringPoints[1].substring(stringPoints[1].indexOf(',') + 1).trim())); //y2
//      distance = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        distance = RADIUS * Math.acos(Math.sin(doublePoints[0][0]) * Math.sin(doublePoints[1][0]) + Math.cos(doublePoints[0][0]) * Math.cos(doublePoints[1][0]) * Math.cos(doublePoints[0][1] - doublePoints[1][1]));
        System.out.println("The distance between the two points is " + distance + " km");
    }
}

//                                                 _Output_
/*
Enter point 1 (latitude and longitude) in degrees: 39.55, -116.25
Enter point 2 (latitude and longitude) in degrees: 41.5, 87.37
The distance between the two points is 10691.79183231593 km
 */