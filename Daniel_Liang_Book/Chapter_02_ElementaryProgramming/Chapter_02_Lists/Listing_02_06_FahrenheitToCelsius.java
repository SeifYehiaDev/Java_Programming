/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 08/01/2024
 * */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_06_FahrenheitToCelsius {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        celsius = 5.0 / 9 * (fahrenheit - 32);
        System.out.print("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
    }
}

//                                                 _Output_
/*
Enter a degree in Fahrenheit: 100
Fahrenheit 100.0 is 37.77777777777778 in Celsius
 */