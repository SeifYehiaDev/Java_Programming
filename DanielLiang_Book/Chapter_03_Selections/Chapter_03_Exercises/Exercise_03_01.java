/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/07/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_01 {
    public static void main(String[] args) {
        double a, b, c, r1, r2, discriminant;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        discriminant = Math.pow(b, 2.0) - 4 * a * c;
        if (discriminant < 0)
            System.out.print("The equation has no real roots");
        else {
            r1 = (Math.sqrt(discriminant) - b) / 2 * a;
            if (discriminant > 0) {
                r2 = (Math.sqrt(discriminant) + b) / 2 * a;
                System.out.printf("The equation has two roots %.6f and %.6f", r1, r2);
            } else
                System.out.printf("The equation has one root %.2f", r1);
        }
    }
}

//                                                 _Output One_
/*
Enter a, b, c: 1.0 3 1
The equation has two roots -0.381966 and 2.618034
 */

//                                                 _Output Two_
/*
Enter a, b, c: 1 2.0 1
The equation has one root -1.00
 */

//                                                 _Output Three_
/*
Enter a, b, c: 1 2 3
The equation has no real roots
 */