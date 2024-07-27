/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 27/07/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_13 {
    public static void main(String[] args) {
        final double MONTHLY_INTEREST_RATE = 0.00417;
        double savingAmount, currentBalance = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        savingAmount = input.nextDouble();
        for (int month = 1; month <= 6; month++)
            currentBalance = (savingAmount + currentBalance) * (1 + MONTHLY_INTEREST_RATE);
        System.out.printf("After the sixth month, the account value is $%.2f", currentBalance);
    }
}

//                                                 _Output_
/*
Enter the monthly saving amount: 100
After the sixth month, the account value is $608.82
 */