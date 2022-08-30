/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * List the precedence order of the Boolean operators. Evaluate the following expressions:
 * true || true && false
 * true && true || false
 * */
//                                                 _Solution_

public class Question_03_37 {
    public static void main(String[] args) {
        System.out.println("true || true && false ========> " + (true || true && false));
        /*
        * true || true && false
        * true || false
        * true
        * */
        System.out.println("true && true || false ========> " + (true && true || false));
        /*
        * true && true || false
        * true || false
        * true
        * */
    }
}

/*                                                 _Output_
 * true || true && false ========> true
 * true && true || false ========> true
 * */