/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 26/8/2022
 * */

package Chapter_02_Examples;

public class Example_02_10 {
    public static void main(String[] args) {
        int sum = 0;
        sum += 4.5;
        System.out.println("sum = " + sum);
        /*
         * sum = 0;
         * sum = sum + 4.5 ;   ===============>!!!Error
         * sum = 0 + 4.5 = 4.5
         * int = double
         * */
        System.out.println("**************** The same effect as ****************");
        sum = 0;
        sum = (int) (sum + 4.5);
        System.out.println("sum = " + sum);
    }
}

/*                                                 _Output_
 * sum = 4
 * **************** The same effect as ****************
 * sum = 4
 * */
