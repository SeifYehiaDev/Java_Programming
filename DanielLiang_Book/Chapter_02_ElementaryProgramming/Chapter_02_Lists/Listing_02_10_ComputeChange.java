/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 27/07/2024
 * */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_10_ComputeChange {
    public static void main(String[] args) {
        double amount;
        int remainingAmount, dollars, quarters, dimes, nickels, pennies;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56: ");
        amount = input.nextDouble();
        remainingAmount = (int) (amount * 100);
        dollars = remainingAmount / 100;
        remainingAmount %= 100;
        quarters = remainingAmount / 25;
        remainingAmount %= 25;
        dimes = remainingAmount / 10;
        remainingAmount %= 10;
        nickels = remainingAmount / 5;
        remainingAmount %= 5;
        pennies = remainingAmount;
        System.out.printf("""
                        Your amount %.2f consists of
                             %02d  dollars
                             %02d  quarters
                             %02d  dimes
                             %02d nickels
                             %02d pennies""",
                amount, dollars, quarters, dimes, nickels, pennies);
    }
}

//                                                 _Output_
/*
Enter an amount in double, for example 11.56: 11.56
Your amount 11.56 consists of
     11  dollars
     02  quarters
     00  dimes
     01 nickels
     01 pennies
 */