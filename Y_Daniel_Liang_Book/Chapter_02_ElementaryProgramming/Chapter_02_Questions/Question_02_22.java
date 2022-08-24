package Chapter_02_Questions;

import java.util.Scanner;

/*                                                 _Question_
 * How would you write the following arithmetic expression in Java?
 *             4                       3 + d(2+a)
 * a.    -------------- - 9(a+bc) + ----------------
 *         3(r + 34)                     a + bd
 *
 *                       2.5+t
 * b.     5.5 * (r + 2.5)
 *
 * */
//                                                 _Solution_
public class Question_02_22 {
    public static void main(String[] args) {
        int r = 1, a = 2, b = 3, c = 4, d = 5 ,t = 6;
        double equationOne, equationTwo;
        equationOne = 4.0 / (3 * (r + 34)) - 9 * (a + b * c) + (3.0 + d * (2 + a)) / (a + b * d);
        System.out.println("equationOne = " + equationOne);
        equationTwo = 5.5 * Math.pow((r + 2.5), 2.5 + t);
        System.out.println("equationTwo = " + equationTwo);
    }
}

/*                                                 _Output_
 * equationOne = -124.60896358543417
 * equationTwo = 231708.0202092284
 * */
