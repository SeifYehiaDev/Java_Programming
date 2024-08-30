/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_26 {
    public static void main(String[] args) {
        String amount, dollars;
        int cents, quarters, dimes, nickels, pennies;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount, for example 11.56: ");
        amount = input.nextLine().trim();
        dollars = amount.substring(0, amount.indexOf('.'));
        cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));
        quarters = cents / 25;
        dimes = (cents %= 25) / 10;
        nickels = (cents %= 10) / 5;
        pennies = cents % 5;
        System.out.printf("""
                        Your amount %s consists of
                             %s dollars
                             %02d quarters
                             %02d dimes
                             %02d nickels
                             %02d pennies""", amount, dollars, quarters, dimes, nickels, pennies);
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