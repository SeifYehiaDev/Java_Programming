/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * What is the value of the expression x >= 50 && x <= 100 if x is 45, 67, or 101?
 * */
//                                                 _Solution_

public class Question_03_23 {
    public static void main(String[] args) {
        int x = 45;
        System.out.println(x + "  >= 50 && " + x + "  <= 100 ======> " + (x >= 50 && x <= 100));
        x = 67;
        System.out.println(x + "  >= 50 && " + x + "  <= 100 ======> " + (x >= 50 && x <= 100));
        x = 101;
        System.out.println(x + " >= 50 && " + x + " <= 100 ======> " + (x >= 50 && x <= 100));
    }
}

/*                                                 _Output_
 * 45  >= 50 && 45  <= 100 ======> false
 * 67  >= 50 && 67  <= 100 ======> true
 * 101 >= 50 && 101 <= 100 ======> false
 * */