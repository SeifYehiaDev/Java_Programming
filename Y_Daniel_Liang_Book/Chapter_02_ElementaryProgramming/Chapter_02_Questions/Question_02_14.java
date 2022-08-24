/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_02_Questions;

/*                                                 _Question_
 * Show the result of the following code:
 * System.out.println(2 * (5 / 2 + 5 / 2));
 * System.out.println(2 * 5 / 2 + 2 * 5 / 2);
 * System.out.println(2 * (5 / 2));
 * System.out.println(2 * 5 / 2);
 * */
//                                                 _Solution_
public class Question_02_14 {
    public static void main(String[] args) {
        System.out.println(2 * (5 / 2 + 5 / 2));
        /*
        * 2 * (5 / 2 + 5 / 2)
        * 2 * ( 2 + 2)
        * 2 * 4
        * 8
        * */
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
        /*
        * 2 * 5 / 2 + 2 * 5 / 2
        * 10 / 2 + 2 * 5 / 2
        * 5 + 2 * 5 / 2
        * 5 + 10 / 2
        * 5 + 5
        * 10
        * */
        System.out.println(2 * (5 / 2));
        /*
         * 2 * (5 / 2)
         * 2 * 2
         * 4
         * */
        System.out.println(2 * 5 / 2);
        /*
         * 2 * 5 / 2
         * 10 / 2
         * 5
         * */
    }
}

/*                                                 _Output_
 * 8
 * 10
 * 4
 * 5
 * */