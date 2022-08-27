/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Financial application: calculate interest) If you know the balance and the annual percentage interest rate,
 * you can compute the interest on the next monthly payment using the following formula:
 *                                interest = balance * (annualInterestRate/1200)
 * Write a program that reads the balance and the annual percentage interest rate and displays the interest for the next month
 * Here is a sample run:
 * Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
 * The interest is 2.91667
 * */
//                                                 _Solution_
public class Exercise_02_20 {
    public static void main(String[] args) {
        double balance, annualInterest, interest;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        balance = input.nextDouble();
        annualInterest = input.nextDouble();
        interest = balance * (annualInterest / 1200);
        System.out.printf("The interest is %.5f", interest);
        // System.out.println("The interest is " + (float) interest);
    }
}

/*                                                 _Output_
 * Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
 * The interest is 2.91667
 * */