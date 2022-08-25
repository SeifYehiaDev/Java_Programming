/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 25/8/2022
 * */

package Chapter_02_Questions;

/*                                                 _Question_
 * Show the output of the following code:
 * double a = 6.5;
 * a += a + 1;
 * */
//                                                 _Solution_
public class Question_02_24 {
    public static void main(String[] args) {
        double a = 6.5, b = 2.0;
        a += a + 1; // =====> a = a + a + 1 ; =====> a = 6.5 + 6.5 + 1 = 14.0
        System.out.println("a = " + a);
        System.out.println("b += 2 =====> " + (b += 2));
        System.out.println("b = " + b);
    }
}

/*                                                 _Output_
 * a = 14.0
 * b += 2 =====> 4.0
 * b = 4.0
 * */