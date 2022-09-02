/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 2/9/2022
 * */

package Chapter_03_Examples;

public class Example_03_12 {
    public static void main(String[] args) {
        int x = 5;
        x = x * 10 + 123 % 10;
        /*
         * x = 5 * 10 + 123 % 10
         * x = 50 + 3
         * x = 53
         * */
        System.out.println("x = x * 10 + 123 % 10 ======> " + x);
        x = 5;
        x *= 10 + 123 % 10;
        /*
        * x *= 10 + 123 % 10
        * x *= 10 + 3
        * x *= 13
        * x = x * 13
        * x = 5 * 13
        * x = 65
        * */
        System.out.println("x *= 10 + 123 % 10 ======> " + x);
    }
}

/*                                                 _Output_
 * x = x * 10 + 123 % 10 ======> 53
 * x *= 10 + 123 % 10 ======> 65
 * */