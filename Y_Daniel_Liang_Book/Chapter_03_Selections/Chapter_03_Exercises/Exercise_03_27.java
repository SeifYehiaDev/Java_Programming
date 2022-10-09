/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 9/10/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
                shown below. The right-angle point is placed at (0, 0), and the other two points
                are placed at (200, 0), and (0, 100). Write a program that prompts the user to enter
                a point with x- and y-coordinates and determines whether the point is inside the
                triangle.*/
//                                                 _Solution_
public class Exercise_03_27 {
    public static void main(String[] args) {
        double x, y, intersectX, intersectY;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point x- and y-coordinates: ");
        x = input.nextDouble();
        y = input.nextDouble();
        intersectX = -x * 200 * 100 / (-y * 200 - x * 100);
        intersectY = -y * 200 * 100 / (-y * 200 - x * 100);
        System.out.println("The point " + ((x > intersectX || y > intersectY) ? "is not" : "is") + " in the triangle");
    }
}

/*                                                 _Output One_
 * Enter a point x- and y-coordinates: 100.5 25.5
 * The point is in the triangle
 * */

/*                                                 _Output Two_
 * Enter a point x- and y-coordinates: 100.5 50.5
 * The point is not in the triangle
 * */