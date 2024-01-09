/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 09/01/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_21 {
    public static void main(String[] args) {
        int years;
        double investmentAmount, annualInterestRate, monthlyInterestRate, futureInvestmentValue;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        years = input.nextInt();
        monthlyInterestRate = annualInterestRate / 1200.0;
        futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        System.out.printf("Accumulated value is $%.2f", futureInvestmentValue);
    }
}

//                                                 _Output_
/*
Enter investment amount: 1000.56
Enter annual interest rate in percentage: 4.25
Enter number of years: 1
Accumulated value is $1043.92
 */