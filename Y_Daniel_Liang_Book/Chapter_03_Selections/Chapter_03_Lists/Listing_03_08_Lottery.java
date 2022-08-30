/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_08_Lottery {
    public static void main(String[] args) {
        int guess, lottery, guessDigitOne, guessDigitTwo, lotteryDigitOne, lotteryDigitTwo;
        java.util.Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        guess = input.nextInt();
        lottery = (int) (Math.random() * 99);
        if (lottery >= 10)
            System.out.println("The lottery number is " + lottery);
        else
            System.out.println("The lottery number is 0" + lottery);
        if (guess >= 0 && guess / 100 == 0) {

            if (guess == lottery)
                System.out.println("Exact match: you win $10,000");
            else {
                guessDigitTwo = guess % 10;
                guessDigitOne = guess / 10;
                lotteryDigitTwo = lottery % 10;
                lotteryDigitOne = lottery / 10;
                if (guessDigitTwo == lotteryDigitOne && guessDigitOne == lotteryDigitTwo)
                    System.out.println("Match all digits: you win $3,000");
                else if (lotteryDigitOne == guessDigitOne || lotteryDigitOne == guessDigitTwo || lotteryDigitTwo == guessDigitOne || lotteryDigitTwo == guessDigitTwo)
                    System.out.println("Match one digit: you win $1,000");
                else
                    System.out.println("Sorry, no match");
            }
        } else
            System.out.println("Error: your lottery more than two digits or negative number");
    }
}

/*                                                 _Output One_
 * Enter your lottery pick (two digits): 54
 * The lottery number is 54
 * Exact match: you win $10,000
 * */

/*                                                 _Output Two_
 * Enter your lottery pick (two digits): 08
 * The lottery number is 80
 * Match all digits: you win $3,000
 * */

/*                                                 _Output Three_
 * Enter your lottery pick (two digits): 17
 * The lottery number is 16
 * Match one digit: you win $1,000
 * */

/*                                                 _Output Four_
 * Enter your lottery pick (two digits): 90
 * The lottery number is 38
 * Sorry, no match
 * */