/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console,
 * then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
 * fahrenheit = (9 / 5) * celsius + 32
 * Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 * Here is a sample run:
 * Enter a degree in Celsius: 43
 * 43 Celsius is 109.4 Fahrenheit
 * */
//                                                 _Solution_
public class Exercise_02_01 {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        celsius = input.nextDouble();
        fahrenheit = (double) 9 / 5 * celsius + 32;
        // fahrenheit = 9.0 / 5 * celsius + 32;
        System.out.println((int) celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
/*                                                 _Output_
 * Enter a degree in Celsius: 43
 * 43 Celsius is 109.4 Fahrenheit
 * */