/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 16/9/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                    /*(Geometry: point in a circle?) Write a program that prompts the user to enter a
                    point (x, y) and checks whether the point is within the circle centered at (0, 0)
                    with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
                    circle, as shown in Figure 3.7a.
                    (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.*/
//                                                 _Solution_
public class Exercise_03_22 {
    public static void main(String[] args) {
        final double RADIUS = 10.0D;
        double x, y;
        boolean isInside;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        x = input.nextDouble();
        y = input.nextDouble();
        isInside = Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0)) <= RADIUS;
        System.out.println((isInside) ? "Point (" + x + ", " + y + ") is in the circle" : "Point (" + x + ", " + y + ") is not in the circle");
    }
}

/*                                                 _Output One_
 * Enter a point with two coordinates: 4 5
 * Point (4.0, 5.0) is in the circle
 * */

/*                                                 _Output Two_
 * Enter a point with two coordinates: 9 9
 * Point (9.0, 9.0) is not in the circle
 * */