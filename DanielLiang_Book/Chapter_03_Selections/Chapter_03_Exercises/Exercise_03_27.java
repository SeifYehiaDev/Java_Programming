/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_27 {
    public static void main(String[] args) {
        double x, y, intersectX, intersectY;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        x = input.nextDouble();
        y = input.nextDouble();
        intersectX = (-x * (200 * 100)) / (-y * 200 - x * 100);
        intersectY = (-y * (200 * 100)) / (-y * 200 - x * 100);
        System.out.printf("The point %s in the triangle",(x > intersectX || y > intersectY) ? "is not" : "is");
    }
}

//                                                 _Output One_
/*
Enter a point's x- and y-coordinates: 100.5 25.5
The point is in the triangle
 */

//                                                 _Output Two_
/*
Enter a point's x- and y-coordinates: 100.5 25.5
The point is in the triangle
 */