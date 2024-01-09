/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 09/01/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_13 {
    public static void main(String[] args) {
        final int MONTHS = 6;
        final double MONTHLY_INTEREST_RATE = 0.00417;
        int amount;
        double total = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        amount = input.nextInt();
        for (int month = 1; month <= MONTHS; month++) total = (amount + total) * (1 + MONTHLY_INTEREST_RATE);
        System.out.printf("After the sixth month, the account value is $%.2f", total);
    }
}

//                                                 _Output_
/*
Enter the monthly saving amount: 100
After the sixth month, the account value is $608.82
 */