/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 21/12/2022
 * */

package Chapter_05_Lists;

import java.util.Scanner;

public class Listing_05_03_GuessNumber {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 101), guessNumber;
        boolean validGuess;
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");
        do {
            System.out.print("Enter your guess: ");
            guessNumber = input.nextInt();
            validGuess = randomNumber == guessNumber;
            System.out.println((randomNumber == guessNumber) ? "Yes, the number is " + guessNumber : "Your guess is ".concat((guessNumber > randomNumber) ? "high" : "low"));
        } while (!validGuess);
    }
}

//                                                 _Output_
/*
Guess a magic number between 0 and 100
Enter your guess: 40
Your guess is high
Enter your guess: 38
Your guess is low
Enter your guess: 39
Yes, the number is 39
 */