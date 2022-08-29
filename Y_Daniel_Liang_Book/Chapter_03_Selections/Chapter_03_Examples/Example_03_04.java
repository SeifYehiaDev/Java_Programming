/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/8/2022
 * */

package Chapter_03_Examples;

public class Example_03_04 {
    public static void main(String[] args) {
        int x = 5;
        boolean isOdd = x % 2 == 1;
        System.out.println("x = " + x);
        if (isOdd)
            System.out.println("x is odd number ");
        else
            System.out.println("x is even number");
    }
}

/*                                                 _Output_
 * x = 6
 * x is odd number
 * */