/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 29/07/2024
 * */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_04_ComputeAndInterpretBMI_V2 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45359237, METERS_PER_INCH = 0.0254;
        double weightInPounds, heightInInches, weightInKilograms, heightInMeters, bmi;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weightInPounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        heightInInches = input.nextDouble();
        weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
        heightInMeters = heightInInches * METERS_PER_INCH;
        bmi = weightInKilograms / Math.pow(heightInMeters, 2.0);
        System.out.printf("BMI is %.15f\n", bmi);
        System.out.print((bmi < 18.5) ? "Underweight" : (bmi < 25.0) ? "Normal" : (bmi < 30.0) ? "Overweight" : "Obese");
    }
}

//                                                 _Output_
/*
Enter weight in pounds: 146
Enter height in inches: 70
BMI is 20.948603801493316
Normal
 */