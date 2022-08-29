/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/8/2022
 * */

package Chapter_03_Examples;

public class Example_03_06 {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 3;
        // what the different between two code?
        if (i > j)
            if (i > k)
                System.out.println("A");
            else
                System.out.println("B");
        System.out.println("*********************************************");
        if (i > j) {
            if (i > k)
                System.out.println("A");
        } else
            System.out.println("B");
    }
}

/*                                                 _Output_
 * *********************************************
 * B
 * */