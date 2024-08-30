/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_23 {
    public static void main(String[] args) {
        double x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        x = input.nextDouble();
        y = input.nextDouble();
        System.out.printf("Point (%.1f, %.1f) %s in the rectangle", x, y, (Math.sqrt(Math.pow(x, 2.0)) <= 5 || Math.sqrt(Math.pow(y, 2.0)) <= 5.0 / 2) ? "is" : "isn't");
    }
}

//                                                 _Output One_
/*
Enter a point with two coordinates: 2 2
Point (2.0, 2.0) is in the rectangle
 */

//                                                 _Output Two_
/*
Enter a point with two coordinates: 6 4
Point (6.0, 4.0) isn't in the rectangle
 */