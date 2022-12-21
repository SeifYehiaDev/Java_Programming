/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 21/12/2022
 * */

package Chapter_05_Lists;

import java.util.Scanner;

public class Listing_05_02_GuessNumberOneTime {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 101), guessNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Random number is " + randomNumber);
        System.out.println("Guess a magic number between 0 and 100");
        System.out.print("Enter your guess: ");
        guessNumber = input.nextInt();
        System.out.println((randomNumber == guessNumber) ? "Yes, the number is " + guessNumber : "Your guess is ".concat((guessNumber > randomNumber) ? "high" : "low"));
    }
}

//                                                 _Output One_
/*
Random number is 67
Guess a magic number between 0 and 100
Enter your guess: 68
Your guess is too high
 */

//                                                 _Output Two_
/*
Random number is 4
Guess a magic number between 0 and 100
Enter your guess: 3
Your guess is too low
 */

//                                                 _Output Three_
/*
Random number is 5
Guess a magic number between 0 and 100
Enter your guess: 5
Yes, the number is 5
 */