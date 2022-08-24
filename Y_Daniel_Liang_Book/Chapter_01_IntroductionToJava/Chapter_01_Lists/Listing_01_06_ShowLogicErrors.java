/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_01_Lists;

public class Listing_01_06_ShowLogicErrors {
    public static void main(String[] args) {
        System.out.println("Celsius 35 is Fahrenheit degree ");
        System.out.println((9 / 5 * 35 + 32));
        // You will get Fahrenheit 67 degrees, which is wrong. It should be 95.0.
        System.out.println("_________________ correct result ______________________ ");
        System.out.println("Celsius 35 is Fahrenheit degree ");
        System.out.println((9.0 / 5 * 35 + 32));
    }
}

/*                                                 _Output_
 * Celsius 35 is Fahrenheit degree
 * 67
 * _________________ correct result ______________________
 * Celsius 35 is Fahrenheit degree
 * 95.0
 * */