/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 26/9/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and (x2,
                y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a–b.
                The intersecting point of the two lines can be found by solving the following
                linear equation:
                                (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
                                (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
                This linear equation can be solved using Cramer’s rule (see Programming Exercise
                3.3). If the equation has no solutions, the two lines are parallel (Figure 3.8c).
                Selections Write a program that prompts the user to enter four points and
                displays the intersecting point.*/
//                                                 _Solution_
public class Exercise_03_25 {
    public static void main(String[] args) {
        double x, x1, x2, x3, x4, y, y1, y2, y3, y4, isParallel, equation[][] = new double[2][3];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        x4 = input.nextDouble();
        y4 = input.nextDouble();
        equation[0][0] = y1 - y2; // a
        equation[0][1] = x1 - x2; // b
        equation[0][2] = (y1 - y2) * x1 - (x1 - x2) * y1;// e
        equation[1][0] = y3 - y4; // c
        equation[1][1] = x3 - x4; // d
        equation[1][2] = (y3 - y4) * x3 - (x3 - x4) * y3; // f
        isParallel = (equation[0][0] * -equation[1][1]) - (equation[1][0] * -equation[0][1]);
        if (isParallel != 0) {
            x = (equation[0][2] * -equation[1][1] - equation[1][2] * -equation[0][1]) / isParallel;
            y = (equation[1][2] * equation[0][0] - equation[0][2] * equation[1][0]) / isParallel;
            System.out.printf("The intersecting point is at (%.5f, %.5f)", x, y);
        } else
            System.out.println("The two lines are parallel");
    }
}

/*                                                 _Output One_
 * Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
 * The intersecting point is at (2.88889, 1.11111)
 * */

/*                                                 _Output Two_
 * Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0
 * The two lines are parallel
 * */