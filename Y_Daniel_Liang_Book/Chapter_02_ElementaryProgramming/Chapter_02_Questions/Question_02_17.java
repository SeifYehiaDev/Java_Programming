/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_02_Questions;

import java.util.Scanner;

/*                                                 _Question_
 * Suppose m and r are integers. Write a Java expression for mr^2 to obtain a floating point result.
 * */
//                                                 _Solution_
public class Question_02_17 {
    public static void main(String[] args) {
        int m, r;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of m >> ");
        m = input.nextInt();
        System.out.print("Enter value of r >> ");
        r = input.nextInt();
        System.out.println("mr^2 = " + m * Math.pow(r, 2.0));
    }
}

/*                                                 _Output_
 * Enter value of m >> 5
 * Enter value of r >> 2
 * mr^2 = 20.0
 * */