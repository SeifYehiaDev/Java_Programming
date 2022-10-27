/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

//                                                 _Question_
                    /*(Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.
                    java, to fix the possible loss of accuracy when converting a float value to an int
                    value. Read the input as a string such as "11.56". Your program should extract
                    the dollar amount before the decimal point and the cents after the decimal amount
                    using the indexOf and substring methods.*/
//                                                 _Solution_
public class Exercise_04_26 {
    public static void main(String[] args) {
        String amount;
        int remainingAmount, numberOfOneDollars, numberOfQuarters, numberOfDimes, numberOfNickels, numberOfPennies;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56: ");
        amount = input.nextLine();
        numberOfOneDollars = Integer.parseInt(amount.substring(0, amount.indexOf('.')));
        remainingAmount = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));
        numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;
        numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;
        numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;
        numberOfPennies = remainingAmount;
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}

//                                                 _Output_
/*
Enter an amount in double, for example 11.56: 11.56
Your amount 11.56 consists of
 11 dollars
 2 quarters
 0 dimes
 1 nickels
 1 pennies
 */