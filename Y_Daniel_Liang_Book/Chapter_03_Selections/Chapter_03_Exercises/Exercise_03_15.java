/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 14/9/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
            /*(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three digits
            number. The program prompts the user to enter a three-digit number and
            determines whether the user wins according to the following rules:
            1. If the user input matches the lottery number in the exact order, the award is
            $10,000.
            2. If all digits in the user input match all digits in the lottery number, the award is
            $3,000.
            3. If one digit in the user input matches a digit in the lottery number, the award is
            $1,000.*/
//                                                 _Solution_
public class Exercise_03_15 {
    public static void main(String[] args) {
        int guess, lottery, indexOne, indexTwo, count = 0;
        int[] lotteryArray, guessArray;
        Scanner input = new Scanner(System.in);
        lottery = (int) (Math.random() * (999 - 100) + 100);
        System.out.print("Enter your lottery pick (three digits): ");
        guess = input.nextInt();
        if (guess < 100 || guess > 999) {
            System.out.println("Error: lottery number should be three digits");
            System.exit(0);
        }
        System.out.println("The lottery number is " + lottery);
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else {
            lotteryArray = new int[3];
            guessArray = new int[3];
            for (indexOne = lotteryArray.length - 1; indexOne >= 0; indexOne--) {
                lotteryArray[indexOne] = lottery % 10;
                lottery /= 10;
                guessArray[indexOne] = guess % 10;
                guess /= 10;
            }
            for (indexOne = 0; indexOne <= 2; indexOne++)
                for (indexTwo = 0; indexTwo <= 2; indexTwo++)
                    if (lotteryArray[indexOne] == guessArray[indexTwo]) {
                        count++;
                        break;
                    }
            System.out.println((count == 3) ? "Match all digits: you win $3,000" : (count == 1) ? "Match one digit: you win $1,000" : "Sorry, no match");
        }
    }
}

/*                                                 _Output One_
 * Enter your lottery pick (three digits): 3262
 * Error: lottery number should be three digits
 * */

/*                                                 _Output Two_
 * Enter your lottery pick (three digits): 278
 * The lottery number is 278
 * Exact match: you win $10,000
 * */

/*                                                 _Output Three_
 * Enter your lottery pick (three digits): 193
 * The lottery number is 931
 * Match all digits: you win $3,000
 * */

/*                                                 _Output Four_
 * Enter your lottery pick (three digits): 369
 * The lottery number is 837
 * Match one digit: you win $1,000
 * */

/*                                                 _Output Five_
 * Enter your lottery pick (three digits): 278
 * The lottery number is 169
 * Sorry, no match
 * */