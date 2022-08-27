/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Science: calculating energy) Write a program that calculates the energy needed to heat water from
 *  an initial temperature to a final temperature.
 * Your program should prompt the user to enter the amount of water in kilograms and the initial and
 * final temperatures of the water. The formula to compute the energy is
 * Q = M * (finalTemperature – initialTemperature) * 4184
 * where M is the weight of water in kilograms, temperatures are in degrees Celsius,and energy Q is measured in joules.
 * Here is a sample run:
 * Enter the amount of water in kilograms: 55.5
 * Enter the initial temperature: 3.5
 * Enter the final temperature: 10.5
 * The energy needed is 1625484.0
 * */
//                                                 _Solution_
public class Exercise_02_10 {
    public static void main(String[] args) {
        double waterInKilograms, initialTemperature, finalTemperature, energy;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        waterInKilograms = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        initialTemperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        finalTemperature = input.nextDouble();
        energy = waterInKilograms * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is " + energy);
    }
}

/*                                                 _Output_
 * Enter the amount of water in kilograms: 55.5
 * Enter the initial temperature: 3.5
 * Enter the final temperature: 10.5
 * The energy needed is 1625484.0
 * */