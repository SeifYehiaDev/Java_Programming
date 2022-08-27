/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Geometry: distance of two points) Write a program that prompts the user to enter two points (x1, y1) and
 * (x2, y2) and displays their distance between them.
 * The formula for computing the distance is Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0))
 * Note that you can use Math.pow(a, 0.5) to compute Math.sqrt(a)
 * Here is a sample run:
 * Enter x1 and y1: 1.5 -3.4
 * Enter x2 and y2: 4 5
 * The distance between the two points is 8.764131445842194
 * */
//                                                 _Solution_
public class Exercise_02_15 {
    public static void main(String[] args) {
        double x1, x2, y1, y2, distance;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        distance = Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0));
        System.out.println("The distance between the two points is " + distance);
    }
}
/*                                                 _Output_
 * Enter x1 and y1: 1.5 -3.4
 * Enter x2 and y2: 4 5
 * */