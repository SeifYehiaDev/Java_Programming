/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 08/01/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_01 {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        celsius = input.nextDouble();
        fahrenheit = 9.0 / 5 * celsius + 32;
        System.out.print(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}

//                                                 _Output_
/*
Enter a degree in Celsius: 43
43.0 Celsius is 109.4 Fahrenheit
 */