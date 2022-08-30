/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Examples;

public class Example_03_10 {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 1;
        System.out.println("a = " + a + " & b= " + b + " & c = " + c);
        a = b += c = 5;
        System.out.println("After =====> a = b += c = 5");
        System.out.println("a = " + a + " & b= " + b + " & c = " + c);
    }
}

/*                                                 _Output_
 * a = 1 & b= 1 & c = 1
 * After =====> a = b += c = 5
 * a = 6 & b= 6 & c = 5
 * */