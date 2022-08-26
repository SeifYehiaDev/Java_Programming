/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 26/8/2022
 * */

package Chapter_02_Questions;

/*                                                 _Question_
 * Show the output of the following code:
 * */
//                                                 _Solution_
public class Question_02_26 {
    public static void main(String[] args) {
        int a = 6;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        a = 6;
        b = ++a;
        System.out.println(a);
        System.out.println(b);
    }
}

/*                                                 _Output_
 * 7
 * 6
 * 7
 * 7
 * */