/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 13/9/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                    /*(Game: heads or tails) Write a program that lets the user guess whether the flip of
                    a coin results in heads or tails. The program randomly generates an integer 0 or 1,
                    which represents head or tail. The program prompts the user to enter a guess and
                    reports whether the guess is correct or incorrect.*/
//                                                 _Solution_
public class Exercise_03_14 {
    public static void main(String[] args) {
        int guess, coin = (int) (Math.random() * 2);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a guess 0-head or 1-tail: ");
        guess = input.nextInt();
        System.out.println("The coin is " + ((coin == 0) ? "head" : "tail"));
        System.out.println((guess == 0 || guess == 1) ? ((guess == coin) ? "Correct" : "Incorrect") + " guess." : "Error: Wrong input.");
    }
}

/*                                                 _Output One_
 * Enter a guess 0-head or 1-tail: 1
 * The coin is tail
 * Correct guess.
 * */

/*                                                 _Output Two_
 * Enter a guess 0-head or 1-tail: 0
 * The coin is tail
 * Incorrect guess.
 * */

/*                                                 _Output Three_
 * Enter a guess 0-head or 1-tail: -3
 * The coin is head
 * Error: Wrong input.
 * */