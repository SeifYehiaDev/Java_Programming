/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 28/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Cost of driving) Write a program that prompts the user to enter the distance to drive,
 * the fuel efficiency of the car in miles per gallon, and the price per gallon,and displays the cost of the trip.
 * Here is a sample run:
 * Enter the driving distance: 900.5
 * Enter miles per gallon: 25.5
 * Enter price per gallon: 3.55
 * The cost of driving is $125.36
 * */
//                                                 _Solution_
public class Exercise_02_23 {
    public static void main(String[] args) {
        double distance, miles, price, cost;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        miles = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        price = input.nextDouble();
        cost = distance / miles * price;
        System.out.printf("The cost of driving is $%.2f", cost);
        //System.out.println("The cost of driving is $" + (float) cost);
    }
}

/*                                                 _Output_
 * Enter the driving distance: 900.5
 * Enter miles per gallon: 25.5
 * Enter price per gallon: 3.55
 * The cost of driving is $125.36
 * */