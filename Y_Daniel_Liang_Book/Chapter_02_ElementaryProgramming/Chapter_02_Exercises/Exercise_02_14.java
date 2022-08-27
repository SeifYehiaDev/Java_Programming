/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of health on weight.
 * It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters.
 * Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
 * Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 * Here is a sample run:
 * Enter weight in pounds: 95.5
 * Enter height in inches: 50
 * BMI is 26.8573
 * */
//                                                 _Solution_
public class Exercise_02_14 {
    public static void main(String[] args) {
        double weightInPounds, heightInInches, weightInKilograms, heightInMeters, ibm;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weightInPounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        heightInInches = input.nextDouble();
        weightInKilograms = 0.45359237 * weightInPounds;
        heightInMeters = 0.0254 * heightInInches;
        ibm = weightInKilograms / Math.pow(heightInMeters, 2.0);
        System.out.printf("IBM is %.4f", ibm);
        //   System.out.println("IBM is " + ibm);
    }
}

/*                                                 _Output_
 * Enter weight in pounds: 95.5
 * Enter height in inches: 50
 * IBM is 26.8573
 * */