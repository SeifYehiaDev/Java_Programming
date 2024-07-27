/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 27/07/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_22 {
    public static void main(String[] args) {
        int amount, dollars, quarters, dimes, nickels, pennies;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount as integer, for example 1156 for 11.56: ");
        amount = input.nextInt();
        dollars = amount / 100;
        amount %= 100;
        quarters = amount / 25;
        amount %= 25;
        dimes = amount / 10;
        amount %= 10;
        nickels = amount / 5;
        amount %= 5;
        pennies = amount;
        System.out.printf("""
                        Your amount %d consists of
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
Enter an amount as integer, for example 1156 for 11.56: 1156
Your amount 1 consists of
     11  dollars
     02  quarters
     00  dimes
     01 nickels
     01 pennies
 */