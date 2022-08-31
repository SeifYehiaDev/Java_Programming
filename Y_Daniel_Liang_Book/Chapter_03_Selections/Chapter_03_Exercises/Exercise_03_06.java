/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 31/8/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
            /*(Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
            let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
            inches, you will enter 5 for feet and 10 for inches.*/
//                                                 _Solution_
public class Exercise_03_06 {
    public static void main(String[] args) {
        double bmi, height, weight, inches, feet;
        final double KILOGRAMS_PER_POUND = 0.45359237D, METERS_PER_INCH = 0.0254D, FEET_PER_INCH = 0.0833333D;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble();
        System.out.print("Enter feet: ");
        feet = input.nextDouble();
        System.out.print("Enter inches: ");
        inches = input.nextDouble();
        weight *= KILOGRAMS_PER_POUND;
        height = (inches + feet / FEET_PER_INCH) * METERS_PER_INCH;
        bmi = weight / Math.pow((height), 2.0);
        System.out.println("BMI is " + bmi);
        System.out.println((bmi < 18.5) ? "Underweight" : (bmi < 25.0) ? "Normal" : (bmi < 30.0) ? "Overweight" : "Obese");
    }
}

/*                                                 _Output_
 * Enter weight in pounds: 140
 * Enter feet: 5
 * Enter inches: 10
 * BMI is 20.08768850098171
 * Normal
 * */