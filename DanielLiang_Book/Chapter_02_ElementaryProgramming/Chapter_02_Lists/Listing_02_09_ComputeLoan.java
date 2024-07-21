/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 22/07/2024
 * */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_09_ComputeLoan {
    public static void main(String[] args) {
        int years;
        double annualInterestRate, loanAmount, monthlyInterestRate, monthlyPayment, totalPayment;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, e.g., 7.25%: ");
        annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years as an integer, e.g., 5: ");
        years = input.nextInt();
        System.out.print("Enter loan amount, e.g., 120000.95: ");
        loanAmount = input.nextDouble();
        monthlyInterestRate = annualInterestRate / 1200.0;
        monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow(1 + monthlyInterestRate, years * 12)));
        totalPayment = monthlyPayment * years * 12;
        System.out.printf("""
                The monthly payment is $%.2f
                The total payment is $%.2f""", monthlyPayment, totalPayment);
    }
}

//                                                 _Output_
/*
Enter annual interest rate, e.g., 7.25%: 5.75
Enter number of years as an integer, e.g., 5: 15
Enter loan amount, e.g., 120000.95: 250000
The monthly payment is $2076.03
The total payment is $373684.54
 */