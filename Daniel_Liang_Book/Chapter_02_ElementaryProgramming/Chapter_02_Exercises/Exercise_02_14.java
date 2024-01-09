/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 09/01/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_14 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45359237, METERS_PER_INCH = 0.0254;
        double weight, height, bmi;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble() * KILOGRAMS_PER_POUND;
        System.out.print("Enter height in inches: ");
        height = input.nextDouble() * METERS_PER_INCH;
        bmi = weight / Math.pow(height, 2.0);
        System.out.printf("BMI is %.4f" , bmi);
    }
}

//                                                 _Output_
/*
Enter weight in pounds: 95.5
Enter height in inches: 50
BMI is 26.8573
 */