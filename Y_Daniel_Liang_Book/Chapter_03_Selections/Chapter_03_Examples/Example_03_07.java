/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/8/2022
 * */

package Chapter_03_Examples;

public class Example_03_07 {
    public static void main(String[] args) {
        double x = 1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1, y = 0.5;
        boolean isEqual;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        isEqual = x == y;
        if (isEqual)
            System.out.println("x == y");
        else
            System.out.println("x != y");
    }
}

/*                                                 _Output_
 * x = 0.5000000000000001
 * y = 0.5
 * x != y
 * */