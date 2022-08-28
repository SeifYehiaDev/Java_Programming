/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 28/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange .java, to fix the possible loss of accuracy
 * when converting a double value to an int value. Enter the input as an integer whose last two digits represent the cents.
 * For example, the input 1156 represents 11 dollars and 56 cents.
 * */
//                                                 _Solution_
public class Exercise_02_22 {
    public static void main(String[] args) {
        int remainingAmount, amount, numberOfOneDollars, numberOfQuarters, numberOfDimes, numberOfNickels, numberOfPennies;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 1156: ");
        amount = input.nextInt();
        remainingAmount = amount;
        numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;
        numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;
        numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;
        numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;
        numberOfPennies = remainingAmount;
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");

    }
}

/*                                                 _Output_
 * Enter an amount in double, for example 1156: 1156
 * Your amount 1156 consists of
 * 11 dollars
 * 2 quarters
 * 0 dimes
 * 1 nickels
 * 1 pennies
 * */