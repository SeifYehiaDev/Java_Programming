/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 26/8/2022
 * */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_09_ComputeLoan {
    public static void main(String[] args) {
        double annualInterestRate, monthlyInterestRate, loanAmount, monthlyPayment, totalPayment;
        int numberOfYears;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, e.g., 7.25%: ");
        annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years as an integer, e.g., 5: ");
        numberOfYears = input.nextInt();
        System.out.print("Enter loan amount, e.g., 120000.95: ");
        loanAmount = input.nextDouble();
        monthlyInterestRate = annualInterestRate / (100 * 12);
        monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        totalPayment = monthlyPayment * numberOfYears * 12;
        System.out.println("The monthly payment is $" + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" + (int) (totalPayment * 100) / 100.0);
    }
}
/*                                                 _Output_
 * Enter annual interest rate, e.g., 7.25%: 5.75
 * Enter number of years as an integer, e.g., 5: 15
 * Enter loan amount, e.g., 120000.95: 250000
 * The monthly payment is $2076.02
 * The total payment is $373684.53
 * */