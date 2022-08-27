/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate,
 * then computes the gratuity and total. For example, if the user enters 10 for subtotal and 15% for gratuity rate,
 * the program displays $1.5 as gratuity and $11.5 as total.
 * Here is a sample run:
 * Enter the subtotal and a gratuity rate: 10 15
 * The gratuity is $1.5 and total is $11.5
 * */
//                                                 _Solution_
public class Exercise_02_05 {
    public static void main(String[] args) {
        int subtotal, gratuityRate;
        double gratuity, total;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        subtotal = input.nextInt();
        gratuityRate = input.nextInt();
        gratuity = subtotal * (gratuityRate / 100.0);
        total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}

/*                                                 _Output_
 * Enter the subtotal and a gratuity rate: 10 15
 * The gratuity is $1.5 and total is $11.5
 * */