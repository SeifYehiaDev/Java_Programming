/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 31/8/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Financial application: monetary units) Modify Listing 2.10, ComputeChange
                .java, to display the nonzero denominations only, using singular words for single
                units such as 1 dollar and 1 penny, and plural words for more than one unit such
                as 2 dollars and 3 pennies.*/
//                                                 _Solution_
public class Exercise_03_07 {
    public static void main(String[] args) {
        double amount;
        int remainingAmount, numberOfOneDollars, numberOfQuarters, numberOfDimes, numberOfNickels, numberOfPennies;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56: ");
        amount = input.nextDouble();
        remainingAmount = (int) (amount * 100);
        numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;
        numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;
        numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;
        numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;
        numberOfPennies = remainingAmount;
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + ((numberOfOneDollars == 1) ? " dollar" : " dollars"));
        System.out.println(" " + numberOfQuarters + ((numberOfQuarters == 1) ? " quarter" : " quarters"));
        System.out.println(" " + numberOfDimes + ((numberOfDimes == 1) ? " dime" : " dimes"));
        System.out.println(" " + numberOfNickels + ((numberOfNickels == 1) ? " nickel" : " nickels"));
        System.out.println(" " + numberOfPennies + ((numberOfPennies == 1) ? " pennie" : " pennies"));
    }
}

/*                                                 _Output_
 * Enter an amount in double, for example 11.56: 11.56
 * Your amount 11.56 consists of
 *  11 dollars
 *  2 quarters
 *  0 dimes
 *  1 nickel
 *  1 pennie
 * */