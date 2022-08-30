/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Are the following two expressions the same?
 * a. x % 2 == 0 && x % 3 == 0
 * b. x % 6 == 0
 * */
//                                                 _Solution_

public class Question_03_22 {
    public static void main(String[] args) {
        int x = 18;
        System.out.println("a. x % 2 == 0 && x % 3 == 0");
        System.out.println("x = " + x);
        System.out.println("x % 2 == 0 && x % 3 == 0 = " + (x % 2 == 0 && x % 3 == 0));
        System.out.println("b. x % 6 == 0");
        System.out.println("x % 6 == 0 = " + (x % 6 == 0));
        System.out.println("Yes ,Two expression are the same.");
    }
}

/*                                                 _Output_
 * a. x % 2 == 0 && x % 3 == 0
 * x = 18
 * x % 2 == 0 && x % 3 == 0 = true
 * b. x % 6 == 0
 * x % 6 == 0 = true
 * Yes ,Two expression are the same.
 * */