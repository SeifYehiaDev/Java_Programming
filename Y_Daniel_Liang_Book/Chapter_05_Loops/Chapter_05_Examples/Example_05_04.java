/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 21/12/2022
 * */

package Chapter_05_Examples;

public class Example_05_04 {
    public static void main(String[] args) {
        double item = 1, sum = 0;
        // infinite loop
//      System.out.println(1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1); ===> 1.3877787807814457E-16 != 0
        while (item != 0) { // No guarantee item will be 0
            sum += item;
            item -= 0.1;
        }
        System.out.println(sum);
    }
}

//                                                 _Output_
/*
infinite loop
 */