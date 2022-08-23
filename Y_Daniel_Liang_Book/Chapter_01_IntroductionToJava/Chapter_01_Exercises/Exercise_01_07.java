/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 23/8/2022
 * */

package Chapter_01_Exercises;

/*                                                 _Question_
 * (Approximate pi) pi can be computed using the following formula:
 *         pi = 4 X (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ....)
 * Write a program that displays the result of  4 X (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
 * and 4 X ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13).
 * Use 1.0 instead of 1 in your program.
 * */
//                                                 _Solution_
public class Exercise_01_07 {
    public static void main(String[] args) {
        System.out.println("4 X (1   - 1/3   + 1/5   - 1/7   + 1/9   - 1/11) = " + 4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11));
        System.out.println("4 X (1   - 1/3   + 1/5   - 1/7   + 1/9   - 1/11   + 1/13) = " + 4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13));
        System.out.println("4 X (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11) = " + 4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11));
        System.out.println("4 X (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13) = " + 4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13));
    }
}
/*                                                 _Output_
 * 4 X (1   - 1/3   + 1/5   - 1/7   + 1/9   - 1/11) = 4
 * 4 X (1   - 1/3   + 1/5   - 1/7   + 1/9   - 1/11   + 1/13) = 4
 * 4 X (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11) = 2.9760461760461765
 * 4 X (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13) = 3.2837384837384844
 * */