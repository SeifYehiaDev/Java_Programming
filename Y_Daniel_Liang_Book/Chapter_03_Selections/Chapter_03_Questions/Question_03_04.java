/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 28/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Write an if statement that assigns 1 to x if y is greater than 0.
 * */
//                                                 _Solution_

public class Question_03_04 {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE, y = 1;
        System.out.println("Before if condition");
        System.out.println("x = " + x);
        if (y >= 0)
            x = 1;
        System.out.println("After if condition");
        System.out.println("x = " + x);
    }
}

/*                                                 _Output_
 * Before if condition
 * x = 2147483647
 * After if condition
 * x = 1
 * */