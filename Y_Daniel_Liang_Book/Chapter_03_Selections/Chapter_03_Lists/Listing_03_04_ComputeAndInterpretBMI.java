/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/8/2022
 * */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_04_ComputeAndInterpretBMI {
    public static void main(String[] args) {
        double bmi, height, weight;
        final double KILOGRAMS_PER_POUND = 0.45359237D, METERS_PER_INCH = 0.0254D;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        height = input.nextDouble();
        weight *= KILOGRAMS_PER_POUND;
        height *= METERS_PER_INCH;
        bmi = weight / Math.pow((height), 2.0);
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25.0)
            System.out.println("Normal");
        else if (bmi < 30.0)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}

/*                                                 _Output_
 * Enter weight in pounds: 146
 * Enter height in inches: 70
 * BMI is 20.948603801493316
 * Normal
 * */