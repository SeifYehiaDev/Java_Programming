/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_06_FahrenheitToCelsius {
    public static void main(String[] args) {
        /*
         *                 5
         *   celsius =  ( --- )(fahrenheit - 32).
         *                 9
         * */
        double fahrenheit, celsius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
    }
}
/*                                                 _Output_
 * Enter a degree in Fahrenheit: 100
 * Fahrenheit 100.0 is 37.77777777777778 in Celsius
 * */