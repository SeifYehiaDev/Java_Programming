/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 27/07/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_14 {
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
        System.out.printf("BMI is %.4f", bmi);
    }
}

//                                                 _Output_
/*
Enter weight in pounds: 95.5
Enter height in inches: 50
BMI is 26.8573
 */