/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 31/8/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Algebra: solve quadratic equations) The two roots of a quadratic equation
                ax2 + bx + c = 0 can be obtained using the following formula
                b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
                equation has two real roots. If it is zero, the equation has one root. If it is negative,
                the equation has no real roots.
                Write a program that prompts the user to enter values for a, b, and c and displays
                the result based on the discriminant. If the discriminant is positive, display two
                roots. If the discriminant is 0, display one root. Otherwise, display “The equation
                has no real roots”.
                Note that you can use Math.pow(x, 0.5) to compute Math.sqrt(x). Here are some
                sample runs.*/
//                                                 _Solution_
public class Exercise_03_01 {
    public static void main(String[] args) {
        double a, b, c, r1, r2, discriminant;
        java.util.Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        discriminant = Math.sqrt(Math.pow(b, 2.0) - 4 * a * c);
        if (discriminant == 0)
            System.out.println("The equation has no real roots");
        else {
            r1 = Math.round(((-b + discriminant) / (2 * a)) * 1E6) / 1.0E6;
            if (discriminant > 0) {
                r2 = Math.round(((-b - discriminant) / (2 * a)) * 1E6) / 1.0E6;
                System.out.println("The equation has two roots " + r1 + " and " + r2);
            } else
                System.out.println("The equation has one root " + r1);
        }
    }
}

/*                                                 _Output One_
 * Enter a, b, c: 1.0 3 1
 * The equation has two roots -0.381966 and -2.618033
 * */

/*                                                 _Output Two_
 * Enter a, b, c: 1 2.0 1
 * The equation has one root -1.0
 * */

/*                                                 _Output Three_
 * Enter a, b, c: 1 2 3
 * The equation has no real roots
 * */