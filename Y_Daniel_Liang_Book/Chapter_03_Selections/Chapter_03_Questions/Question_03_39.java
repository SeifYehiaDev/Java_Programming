/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Evaluate the following expressions:
 * a. 2 * 2 - 3 > 2 && 4 – 2 > 5
 * b. 2 * 2 - 3 > 2 || 4 – 2 > 5
 * */
//                                                 _Solution_

public class Question_03_39 {
    public static void main(String[] args) {
        System.out.println("a. 2 * 2 - 3 > 2 && 4 – 2 > 5 is " + (2 * 2 - 3 > 2 && 4 - 2 > 5));
        /*
         * 2 * 2 - 3 > 2 && 4 – 2 > 5
         * 4 - 3 > 2 && 4 - 2 > 5
         * 1 > 2 && 2 > 5
         * false
         * */
        System.out.println("b. 2 * 2 - 3 > 2 || 4 – 2 > 5 is " + (2 * 2 - 3 > 2 || 4 - 2 > 5));
        /*
        * 2 * 2 - 3 > 2 || 4 – 2 > 5
        * 4 - 3 > 2 || 2 > 5
        * 1 > 2 || 2 > 5
        * false || false
        * false
        * */
    }
}

/*                                                 _Output_
 * a. 2 * 2 - 3 > 2 && 4 – 2 > 5 is false
 * b. 2 * 2 - 3 > 2 || 4 – 2 > 5 is false
 * */