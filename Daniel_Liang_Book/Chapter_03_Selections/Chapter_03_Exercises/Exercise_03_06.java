/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 15/01/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_06 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45359237, METERS_PER_INCH = 0.0254, METERS_PER_FEET = 0.3048;
        double weight, feet, inch, height, bmi;
        String interpretation;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble() * KILOGRAMS_PER_POUND;
        System.out.print("Enter feet: ");
        feet = input.nextDouble();
        System.out.print("Enter inches: ");
        inch = input.nextDouble();
        height = feet * METERS_PER_FEET + inch * METERS_PER_INCH;
        bmi = weight / Math.pow(height, 2.0);
        interpretation = (bmi < 18.5) ? "Underweight" : (bmi < 25.0) ? "Normal" : (bmi < 30.0) ? "Overweight" : "Obese";
        System.out.print("BMI is " + bmi + "\n" + interpretation);
    }
}

//                                                 _Output_
/*
Enter weight in pounds: 140
Enter feet: 5
Enter inches: 10
BMI is 20.087702275404553
Normal
 */