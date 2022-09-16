/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 16/9/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Geometry: point in a rectangle?) Write a program that prompts the user to enter
                a point (x, y) and checks whether the point is within the rectangle centered at
                (0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and
                (6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the
                rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its
                vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to
                cover all cases.) Here are two sample runs.*/
//                                                 _Solution_
public class Exercise_03_23 {
    public static void main(String[] args) {
        final double WIDTH = 10.0D, HEIGHT = 5.0D;
        double x, y;
        boolean isInside;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        x = input.nextDouble();
        y = input.nextDouble();
        isInside = Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0)) <= Math.sqrt(Math.pow(WIDTH / 2, 2.0) + Math.pow(HEIGHT / 2, 2.0));
        System.out.println((isInside) ? "Point (" + x + ", " + y + ") is in the rectangle" : "Point (" + x + ", " + y + ") is not in the rectangle");
    }
}

/*                                                 _Output One_
 * Enter a point with two coordinates: 2 2
 * Point (2.0, 2.0) is in the rectangle
 * */

/*                                                 _Output Two_
 * Enter a point with two coordinates: 6 4
 * Point (6.0, 4.0) is not in the rectangle
 * */