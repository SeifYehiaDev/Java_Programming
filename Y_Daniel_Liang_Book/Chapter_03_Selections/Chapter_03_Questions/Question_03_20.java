/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * (a) Write a Boolean expression for |x - 5| < 4.5.
 * (b) Write a Boolean expression for |x - 5| > 4.5.
 * */
//                                                 _Solution_

public class Question_03_20 {
    public static void main(String[] args) {
        int x = 1;
        boolean expression = Math.abs(x - 5) < 4.5;
        System.out.println("(a) Write a Boolean expression for |x - 5| < 4.5.");
        System.out.println(" x = " + x);
        System.out.println("|x - 5| < 4.5 = " + expression);
        /*
         * |x - 5| < 4.5
         * |1 - 5| < 4.5
         * |-4| < 4.5
         * 4 < 4.5
         * true
         * */
        System.out.println("(b) Write a Boolean expression for |x - 5| > 4.5.");
        System.out.println(" x = " + x);
        expression = Math.abs(x - 5) > 4.5;
        System.out.println("|x - 5| > 4.5 = " + expression);
        /*
         * |x - 5| > 4.5
         * |1 - 5| > 4.5
         * |-4| > 4.5
         * 4 > 4.5
         * false
         * */

    }
}

/*                                                 _Output_
 * (a) Write a Boolean expression for |x - 5| < 4.5.
 * x = 1
 * |x - 5| < 4.5 = true
 * (b) Write a Boolean expression for |x - 5| > 4.5.
 * x = 1
 * |x - 5| > 4.5 = false
 * */