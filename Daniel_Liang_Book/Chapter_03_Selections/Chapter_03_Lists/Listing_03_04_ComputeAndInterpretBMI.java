/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 14/01/2024
 * */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_04_ComputeAndInterpretBMI {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45359237, METERS_PER_INCH = 0.0254;
        double weight, height, bmi;
        String interpretation;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble() * KILOGRAMS_PER_POUND;
        System.out.print("Enter weight in pounds: ");
        height = input.nextDouble() * METERS_PER_INCH;
        bmi = weight / Math.pow(height, 2.0);
        interpretation = (bmi < 18.5) ? "Underweight" : (bmi < 25.0) ? "Normal" : (bmi < 30.0) ? "Overweight" : "Obese";
        System.out.print("BMI is " + bmi + "\n" + interpretation);
    }
}

//                                                 _Output_
/*
Enter weight in pounds: 146
Enter weight in pounds: 70
BMI is 20.948603801493316
Normal
 */