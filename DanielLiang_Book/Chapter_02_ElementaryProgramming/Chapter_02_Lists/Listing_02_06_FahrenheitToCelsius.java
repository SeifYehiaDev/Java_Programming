/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 22/07/2024
 * */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_06_FahrenheitToCelsius {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        celsius = (5 / 9.0) * (fahrenheit - 32);
        System.out.printf("Fahrenheit %.1f is %.14f in Celsius", fahrenheit, celsius);
    }
}

//                                                 _Output_
/*
Enter a degree in Fahrenheit: 100
Fahrenheit 100.0 is 37.77777777777778 in Celsius
 */