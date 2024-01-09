/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 09/01/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_22 {
    public static void main(String[] args) {
        int numberOfOneDollars, numberOfQuarters, numberOfDimes, numberOfNickels, numberOfPennies, amount;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount as integer, for example 1156 for 11.56: ");
        amount = input.nextInt();
        numberOfOneDollars = amount / 100;
        numberOfQuarters = (amount %= 100) / 25;
        numberOfDimes = (amount %= 25) / 10;
        numberOfNickels = (amount %= 10) / 5;
        numberOfPennies = (amount %= 5);
        System.out.printf("""
                        %-2d %s
                        %-2d %s
                        %-2d %s
                        %-2d %s
                        %-2d %s""",
                numberOfOneDollars, (numberOfOneDollars > 1) ? "dollars" : "dollar",
                numberOfQuarters, (numberOfQuarters > 1) ? "quarters" : "quarter",
                numberOfDimes, (numberOfDimes > 1) ? "dimes" : "dime",
                numberOfNickels, (numberOfNickels > 1) ? "nickels" : "nickel",
                numberOfPennies, (numberOfPennies > 1) ? "pennies" : "pennie");
    }
}

//                                                 _Output_
/*
Enter an amount as integer, for example 1156 for 11.56: 1156
11 dollars
2  quarters
0  dime
1  nickel
1  pennie
 */