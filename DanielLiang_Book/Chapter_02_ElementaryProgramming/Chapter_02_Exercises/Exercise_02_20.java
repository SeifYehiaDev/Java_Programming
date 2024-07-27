/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 27/07/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_20 {
    public static void main(String[] args) {
        double balance, annualInterestRate, interest;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        balance = input.nextDouble();
        annualInterestRate = input.nextDouble();
        interest = balance * annualInterestRate / 1200.0;
        System.out.printf("The interest is %.5f", interest);
    }
}

//                                                 _Output_
/*
Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
The interest is 2.91667
 */