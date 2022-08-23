/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 23/8/2022
 * */

package Chapter_01_Exercises;

/*                                                 _Question_
 * (Summation of a series) Write a program that displays the result of 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.
 * */
//                                                 _Solution_
public class Exercise_01_06 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 9; i++)
            sum += i;
        System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = "+sum);
    }
}
/*                                                 _Output_
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45
 * */