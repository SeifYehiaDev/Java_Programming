/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 14/10/2022
 * */

package Chapter_04_Examples;

public class Example_04_02 {
    public static void main(String[] args) {
        final double EXPONENTIAL = Math.E;
        System.out.println("Exponential = " + EXPONENTIAL); // ===> e = 2.718281828459045
        System.out.println("Math.exp(2) = " + Math.exp(2)); // it's means e power 2 (e^2)
        System.out.println("Math.log(Math.E) = " + Math.log(Math.E)); // it's means log(e) of base e
        System.out.println("Math.log10(100) = " + Math.log10(100)); // it's means log(50) of base 10
        System.out.println("Math.pow(2, 3) = " + Math.pow(2, 3)); // it's means 2 power 3
        System.out.println("Math.pow(3, 2) = " + Math.pow(3, 2)); // it's means 3 power 2
        System.out.println("Math.pow(4.5, 2.5) = " + Math.pow(4.5, 2.5)); // it's means 4.5 power 2.5
        System.out.println("Math.sqrt(4) = " + Math.sqrt(4)); // it's means square root of x = 4 , x >= 0
        System.out.println("Math.sqrt(-1) = " + Math.sqrt(-1)); // it's means square root of x = -1 , x >= 0 , NaN
        System.out.println("Math.sqrt(10.5) = " + Math.sqrt(10.5)); // it's means square root of x = 10.5 , x >= 0
    }
}

//                                                 _Output_
/*
Exponential = 2.718281828459045
Math.exp(2) = 7.38905609893065
Math.log(Math.E) = 1.0
Math.log10(100) = 2.0
Math.pow(2, 3) = 8.0
Math.pow(3, 2) = 9.0
Math.pow(4.5, 2.5) = 42.95673695708276
Math.sqrt(4) = 2.0
Math.sqrt(-1) = NaN
Math.sqrt(10.5) = 3.24037034920393
*/