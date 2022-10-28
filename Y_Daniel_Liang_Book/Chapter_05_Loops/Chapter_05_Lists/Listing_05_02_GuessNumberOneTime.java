/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 28/10/2022
 * */

package Chapter_05_Lists;

import java.util.Scanner;

public class Listing_05_02_GuessNumberOneTime {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 101), userGuess;
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");
        System.out.print("Enter your guess: ");
        userGuess = input.nextInt();
        System.out.println((randomNumber == userGuess) ? "Yes, the number is " + randomNumber : (userGuess > randomNumber) ? "Your guess is too high" : "Your guess is too low");
    }
}

//                                                 _Output_
/*
Guess a magic number between 0 and 100
Enter your guess: 50
Your guess is too high
 */