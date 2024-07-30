/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/07/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_06 {
    public static void main(String[] args) {
        final String[] INTERPRETATION = {"Underweight", "Normal", "Overweight", "Obese"};
        final double KILOGRAMS_PER_POUND = 0.45359237, METERS_PER_INCH = 0.0254;
        double weightInPounds, feet, inches, weightInKilograms, heightInMeters, bmi;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weightInPounds = input.nextDouble();
        System.out.print("Enter feet: ");
        feet = input.nextDouble();
        System.out.print("Enter inches: ");
        inches = input.nextDouble();
        weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
        heightInMeters = (12 * feet + inches) * METERS_PER_INCH;
        bmi = weightInKilograms / Math.pow(heightInMeters, 2.0);
        System.out.printf("bmi is %.15f\n", bmi);
        System.out.print((bmi < 18.5) ? INTERPRETATION[0] : (bmi < 25.0) ? INTERPRETATION[1] : (bmi < 30.0) ? INTERPRETATION[2] : INTERPRETATION[3]);
    }
}

//                                                 _Output_
/*
Enter weight in pounds: 140
Enter feet: 5
Enter inches: 10
bmi is 20.087702275404553
Normal
 */