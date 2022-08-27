/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Geometry: area of a triangle) Write a program that prompts the user to enter
 * three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
 * The formula for computing the area of a triangle is
 * s = (side1 + side2 + side3)/2;
 * area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3))
 * Here is a sample run:
 * Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4
 * The area of the triangle is 33.6
 * */
//                                                 _Solution_
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
        side1 = Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0));
        side2 = Math.sqrt(Math.pow((x3 - x2), 2.0) + Math.pow((y3 - y2), 2.0));
        side3 = Math.sqrt(Math.pow((x1 - x3), 2.0) + Math.pow((y1 - y3), 2.0));
        s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("The area of the triangle is " + (float) area);
    }
}

/*                                                 _Output_
 * Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4
 * The area of the triangle is 33.6
 * */