/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 25/07/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_01 {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        celsius = input.nextDouble();
        fahrenheit = 9 / 5.0 * celsius + 32;
        System.out.printf("%d Celsius is %.1f Fahrenheit", (int) celsius, fahrenheit);
    }
}

//                                                 _Output_
/*
Enter a degree in Celsius: 43
43 Celsius is 109.4 Fahrenheit
 */