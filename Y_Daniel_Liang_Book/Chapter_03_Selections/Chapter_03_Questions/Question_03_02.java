/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 28/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Assuming that x is 1, show the result of the following Boolean expressions:
 * (x > 0)
 * (x < 0)
 * (x != 0)
 * (x >= 0)
 * (x != 1)
 * */
//                                                 _Solution_

public class Question_03_02 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("(x > 0) =  " + (x > 0));   // true
        System.out.println("(x < 0) =  " + (x < 0));   // false
        System.out.println("(x != 0) = " + (x != 0)); // true
        System.out.println("(x >= 0) = " + (x >= 0)); // true
        System.out.println("(x != 1) = " + (x != 1)); // false
    }
}

/*                                                 _Output_
 * (x > 0) =  true
 * (x < 0) =  false
 * (x != 0) = true
 * (x >= 0) = true
 * (x != 1) = false
 * */