/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 26/8/2022
 * */

package Chapter_02_Questions;

/*                                                 _Question_
 * Which of these statements are true?
 * 1- Any expression can be used as a statement.
 * 2- The expression x++ can be used as a statement.
 * 3- The statement x = x + 5 is also an expression.
 * 4- The statement x = y = x = 0 is illegal.
 * */
//                                                 _Solution_
public class Question_02_25 {
    public static void main(String[] args) {
        int i = 0;
        i += 2; // Statement
        System.out.println(i += 2);
        int x, y, z;
        x = y = x = z = 0;
        System.out.println("x = y = x = z = 0");
        System.out.println("x = " + x + " & y = " + y + " & z = " + z);
    }
}

/*                                                 _Output_
 * 4
 * x = y = x = z = 0
 * x = 0 & y = 0 & z = 0
 * */