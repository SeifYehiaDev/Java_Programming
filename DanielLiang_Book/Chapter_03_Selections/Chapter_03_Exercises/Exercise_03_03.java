/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/07/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_03 {
    public static void main(String[] args) {
        double a, b, e, c, d, f, x, y, determinant;
        Scanner input = new Scanner(System.in);
        System.out.print("a, b, c, d, e, f: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        determinant = a * d - c * b;
        if (determinant == 0)
            System.out.print("The equation has no solution");
        else {
            x = (e * d - b * f) / determinant;
            y = (a * f - e * c) / determinant;
            System.out.printf("x is %.1f and y is %.1f", x, y);
        }
    }
}

//                                                 _Output One_
/*
a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
x is -2.0 and y is 3.0
 */

//                                                 _Output Two_
/*
a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
The equation has no solution
 */