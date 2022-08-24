/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_02_Questions;

import java.util.Scanner;

/*                                                 _Question_
 * Which of the following are correct literals?
 * 5_2534e+1, _2534, 5_2, 5_
 * */
//                                                 _Solution_
public class Question_02_21 {
    public static void main(String[] args) {
        /*
         * int x = 5_2534e+1; =======> not correct
         * int x = _2534;     =======> not correct
         * int x = 0_2534;    =======> correct
         * int x = 5_2;       =======> correct
         * int x = 5_;       =======> not correct
         * Which of the following are correct literals?
         * 5_2 & 0_2534
         * */
        System.out.println(0_2534); // this number is octal number
    }
}

/*                                                 _Output_
 * 1372
 * */