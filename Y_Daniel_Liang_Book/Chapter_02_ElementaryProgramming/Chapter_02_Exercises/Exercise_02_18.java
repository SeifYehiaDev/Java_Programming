/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

/*                                                 _Question_
 * (Print a table) Write a program that displays the following table. Cast floating
 * a b pow(a, b)
 * 1 2 1
 * 2 3 8
 * 3 4 81
 * 4 5 1024
 * 5 6 15625
 * */
//                                                 _Solution_
public class Exercise_02_18 {
    public static void main(String[] args) {
        int a = 0, b = 1, row = 1;
        System.out.println("a\t\tb\t\tpow(a,b)");
        for (; row <= 5; row++)
            System.out.println(++a + "\t\t" + ++b + "\t\t" + (int) Math.pow(a, b));
    }
}
/*                                                 _Output_
 * a		b		pow(a,b)
 * 1		2		1
 * 2		3		8
 * 3		4		81
 * 4		5		1024
 * 5		6		15625
 * */