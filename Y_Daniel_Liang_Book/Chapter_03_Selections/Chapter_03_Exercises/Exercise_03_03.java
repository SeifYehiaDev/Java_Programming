/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 31/8/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
                Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
                the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
                that “The equation has no solution.”*/
//                                                 _Solution_
public class Exercise_03_03 {
    public static void main(String[] args) {
        float a, b, c, d, e, f, x, y, value;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();
        d = input.nextFloat();
        e = input.nextFloat();
        f = input.nextFloat();
        value = a * d - b * c;
        if (value == 0)
            System.out.println("The equation has no solution");
        else {
            x = (e * d - b * f) / value;
            y = (a * f - e * c) / value;
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}

/*                                                 _Output One_
 * Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
 * x is -2.0 and y is 3.0
 * */

/*                                                 _Output Two_
 * Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
 * The equation has no solution
 * */