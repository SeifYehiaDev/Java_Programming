/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 9/10/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
            /*(Geometry: point on line segment) Programming Exercise 3.32 shows how to test
            whether a point is on an unbounded line. Revise Programming Exercise 3.32 to
            test whether a point is on a line segment. Write a program that prompts the user
            to enter the three points for p0, p1, and p2 and displays whether p2 is on the line
            segment from p0 to p1.*/
//                                                 _Solution_
public class Exercise_03_34 {
    public static void main(String[] args) {
        double x0, y0, x1, y1, x2, y2, position;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        x0 = input.nextDouble();
        y0 = input.nextDouble();
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        System.out.println("(" + x2 + ", " + y2 + ") is" + ((position == 0 && x2 > x0 && x2 < x1) ? "" : " not") + " on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
    }
}

/*                                                 _Output One_
 * Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5
 * (1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.5, 2.5)
 * */

/*                                                 _Output Two_
 * Enter three points for p0, p1, and p2: 1 1 2 2 3.5 3.5
 * (3.5, 3.5) is not on the line segment from (1.0, 1.0) to (2.0, 2.0)
 * */