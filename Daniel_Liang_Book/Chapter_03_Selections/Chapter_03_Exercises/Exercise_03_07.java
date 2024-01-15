/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 15/01/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_07 {
    public static void main(String[] args) {
        int remainingAmount, numberOfOneDollars, numberOfQuarters, numberOfDimes, numberOfNickels, numberOfPennies;
        double amount;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56: ");
        amount = input.nextDouble();
        remainingAmount = (int) (amount * 100);
        numberOfOneDollars = remainingAmount / 100;
        numberOfQuarters = (remainingAmount %= 100) / 25;
        numberOfDimes = (remainingAmount %= 25) / 10;
        numberOfNickels = (remainingAmount %= 10) / 5;
        numberOfPennies = (remainingAmount %= 5);
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
Enter an amount in double, for example 11.56: 11.56
11 dollars
2  quarters
0  dime
1  nickel
1  pennie
 */