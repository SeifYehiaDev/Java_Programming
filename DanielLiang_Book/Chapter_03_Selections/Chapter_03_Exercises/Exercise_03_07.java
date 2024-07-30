/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/07/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_07 {
    public static void main(String[] args) {
        double amount;
        int remainingAmount, dollars, quarters, dimes, nickels, pennies;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56: ");
        amount = input.nextDouble();
        remainingAmount = (int) (amount * 100.0);
        dollars = remainingAmount / 100;
        quarters = (remainingAmount %= 100) / 25;
        dimes = (remainingAmount %= 25) / 10;
        nickels = (remainingAmount %= 10) / 5;
        pennies = remainingAmount %= 5;
        System.out.printf("""
                        Your amount %.2f consists of
                             %2d %s
                             %2d %s
                             %2d %s
                             %2d %s
                             %2d %s""",
                amount,
                dollars, (dollars > 1) ? "dollars" : "dollar",
                quarters, (quarters > 1) ? "quarters" : "quarter",
                dimes, (dimes > 1) ? "dimes" : "dime",
                nickels, "nickel",
                pennies, (pennies > 1) ? "pennies" : "pennie");
    }
}

//                                                 _Output_
/*
Enter an amount in double, for example 11.56: 11.56
Your amount 11.56 consists of
     11 dollars
      2 quarters
      0 dime
      1 nickel
      1 pennie
 */