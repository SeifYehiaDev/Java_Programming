/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 09/01/2024
 * */

package Chapter_02_Questions;

import java.util.Scanner;

public class Question_02_33 {
    public static void main(String[] args) {
        System.out.println("Show the output in Listing 2.10 with the input value 1.99\n");
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
Show the output in Listing 2.10 with the input value 1.99

Enter an amount in double, for example 11.56: 1.99
1  dollar
3  quarters
2  dimes
0  nickel
4  pennies
 */