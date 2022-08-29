/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/8/2022
 * */

package Chapter_03_Examples;

public class Example_03_08 {
    public static void main(String[] args) {
        final double EPSILON = 1E-14;
        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        if (Math.abs(x - 0.5) < EPSILON)
            System.out.println(x + " is approximately 0.5");
    }
}

/*                                                 _Output_
 * 0.5000000000000001 is approximately 0.5
 * */