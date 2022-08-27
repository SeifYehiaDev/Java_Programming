/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Financial application: calculate future investment value) Write a program that reads in investment amount,
 * annual interest rate, and number of years, and displays the future investment value using the following formula:
 *                   futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment value is 1032.98.
 * Here is a sample run:
 * Enter investment amount: 1000.56
 * Enter annual interest rate in percentage: 4.25
 * Enter number of years: 1
 * Accumulated value is $1043.92
 * */
//                                                 _Solution_
public class Exercise_02_21 {
    public static void main(String[] args) {
        double investmentAmount, annualInterestRate, futureInvestmentValue;
        int numberOfYears;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        numberOfYears = input.nextInt();
        futureInvestmentValue = investmentAmount * Math.pow((1 + (annualInterestRate / 1200)), numberOfYears * 12);
        System.out.printf("Accumulated value is $%.2f", futureInvestmentValue);
        // System.out.println("Accumulated value is $" + (float) futureInvestmentValue);
    }
}

/*                                                 _Output_
 * Enter investment amount: 100.56
 * Enter annual interest rate in percentage: 4.25
 * Enter number of years: 1
 * Accumulated value is $104.92
 * */