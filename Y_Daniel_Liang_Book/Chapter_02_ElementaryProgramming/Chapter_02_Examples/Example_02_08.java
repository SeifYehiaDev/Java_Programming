/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 26/8/2022
 * */

package Chapter_02_Examples;

public class Example_02_08 {
    public static void main(String[] args) {
        double x = 1.0, y = 5.0, z = 0;
        System.out.println("x = " + x + " & y = " + y + " & z = " + z);
        System.out.println("z = x-- + ++y");
        z = x-- + ++y;
        System.out.println("x = " + x + " & y = " + y + " & z = " + z);
    }
}

/*                                                 _Output_
 * x = 1.0 & y = 5.0 & z = 0.0
 * z = x-- + ++y
 * x = 0.0 & y = 6.0 & z = 7.0
 * */