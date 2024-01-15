/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 15/01/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_01 {
    public static void main(String[] args) {
        double a, b, c, discriminant, r1, r2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant < 0) System.out.print("The equation has no real roots");
        else {
            r1 = (-b + Math.sqrt(Math.abs(discriminant))) / (2 * a);
            if (discriminant == 0) System.out.print("The equation has one root " + r1);
            else {
                r2 = (-b - Math.sqrt(Math.abs(discriminant))) / (2 * a);
                System.out.printf("The equation has two roots %.6f and %.5f", r1, r2);
            }
        }
    }
}

//                                                 _Output One_
/*
Enter a, b, c: 1.0 3 1
The equation has two roots -0.381966 and -2.61803
 */

//                                                 _Output Two_
/*
Enter a, b, c: 1 2.0 1
The equation has one root -1.0
 */

//                                                 _Output Three_
/*
Enter a, b, c: 1 2 3
The equation has no real roots
 */