/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_22 {
    public static void main(String[] args) {
        double x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        x = input.nextDouble();
        y = input.nextDouble();
        System.out.printf("Point (%.1f, %.1f) %s in the circle", x, y, (Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0)) <= 10) ? "is" : "isn't");
    }
}

//                                                 _Output One_
/*
Enter a point with two coordinates: 4 5
Point (4.0, 5.0) is in the circle
 */

//                                                 _Output Two_
/*
Enter a point with two coordinates: 9 9
Point (9.0, 9.0) isn't in the circle
 */