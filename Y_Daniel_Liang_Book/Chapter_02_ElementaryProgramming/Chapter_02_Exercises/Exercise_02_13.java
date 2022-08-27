/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Financial application: compound value)
 * Suppose you save $100 each month into a savings account with the annual interest rate 5%. Thus,
 * the monthly interest rate is 0.05/12 = 0.00417.
 * After the first month, the value in the account becomes
 * 100 * (1 + 0.00417) = 100.417
 * After the second month, the value in the account becomes
 * (100 + 100.417) * (1 + 0.00417) = 201.252
 * After the third month, the value in the account becomes
 * (100 + 201.252) * (1 + 0.00417) = 302.507
 * and so on.
 * Write a program that prompts the user to enter a monthly saving amount and displays the account value after the sixth month
 * (In Exercise 5.30, you will use a loop to simplify the code and display the account value for any month.)
 * Here is a sample run:
 * Enter the monthly saving amount: 100
 * After the sixth month, the account value is $608.81
 * */
//                                                 _Solution_
public class Exercise_02_13 {
    public static void main(String[] args) {
        final double MONTHLY_INTEREST_RATE = 0.00417D; //  monthlyInterestRate = 5 / (100 * 12)
        final int NUMBER_OF_MONTH = 6;
        double monthlySavingAmount, accountValue = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        monthlySavingAmount = input.nextDouble();
        for (int i = 1; i <= NUMBER_OF_MONTH; i++)
            accountValue = (monthlySavingAmount + accountValue) * (1 + MONTHLY_INTEREST_RATE);
        System.out.printf("After the %d month, the account value is $%.2f", NUMBER_OF_MONTH, accountValue);
        //System.out.println("After the " + NUMBER_OF_MONTH + " month, the account value is $" + accountValue);
    }
}

/*                                                 _Output_
 * Enter the monthly saving amount: 100
 * After the 6 month, the account value is $608.82
 * */