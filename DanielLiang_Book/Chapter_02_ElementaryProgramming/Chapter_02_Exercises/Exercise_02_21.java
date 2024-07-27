/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 27/07/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_21 {
    public static void main(String[] args) {
        int years;
        double investAmount, annualInterestRate, monthlyInterestRate, futureInvestment;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        investAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        years = input.nextInt();
        monthlyInterestRate = annualInterestRate / 1200.0;
        futureInvestment = investAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        System.out.printf("Accumulated value is $%.2f", futureInvestment);
    }
}

//                                                 _Output_
/*
Enter investment amount: 1000.56
Enter annual interest rate in percentage: 4.25
Enter number of years: 1
Accumulated value is $1043.92
 */