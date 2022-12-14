/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_02_Questions;

/*                                                 _Question_
 * Identify and fix the errors in the following code:
 * */
//                                                 _Solution_
public class Question_02_06 {
    public static void main(String[] args) {
        /*
         * int i = j = k = 2;
         * There's error because j & k not declare.
         * System.out.println(i + " " + j + " " + k);
         * */  //                               Solve this Error
        int i, j, k;
        i = j = k = 2;
        /*
        * k = 2;
        * j = k;
        * i = j;
        * */
        System.out.println(i + " " + j + " " + k);
    }
}

/*                                                 _Output_
 * 2 2 2
 * */