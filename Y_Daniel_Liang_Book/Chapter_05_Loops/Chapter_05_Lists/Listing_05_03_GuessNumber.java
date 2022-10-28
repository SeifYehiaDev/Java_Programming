/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 28/10/2022
 * */

package Chapter_05_Lists;

import java.util.Scanner;

public class Listing_05_03_GuessNumber {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 101), userGuess;
        boolean validUserGuess;
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");
        do {
            System.out.print("Enter your guess: ");
            userGuess = input.nextInt();
            validUserGuess = randomNumber == userGuess;
            System.out.println((validUserGuess) ? "Yes, the number is " + randomNumber : (userGuess > randomNumber) ? "Your guess is too high" : "Your guess is too low");
        } while (!validUserGuess);
    }
}

//                                                 _Output_
/*
Guess a magic number between 0 and 100
Enter your guess: 100
Your guess is too high
Enter your guess: 50
Your guess is too low
Enter your guess: 60
Your guess is too low
Enter your guess: 70
Your guess is too low
Enter your guess: 80
Your guess is too high
Enter your guess: 79
Your guess is too high
Enter your guess: 78
Yes, the number is 78
 */