/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 28/10/2022
 * */

package Chapter_05_Examples;

public class Example_05_03 {
    public static void main(String[] args) {
        double item = 1, sum = 0;
        // infinite loop
//      System.out.println(1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1-0.1); ===> 1.3877787807814457E-16 != 0
        while (item != 0) { // No guarantee item will be 0
            sum += item;
            item -= 0.1;
        }
        System.out.println(sum);
    }
}

//                                                 _Output_
/*

 */