/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 31/07/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_14 {
    public static void main(String[] args) {
        final int COIN = (int) (Math.random() * 2);
        int guess;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a guess 0-head or 1-tail: ");
        guess = input.nextInt();
        System.out.printf("%s guess.", (guess == COIN) ? "Correct" : "Incorrect");
    }
}

//                                                 _Output One_
/*
Enter a guess 0-head or 1-tail: 1
Correct guess.
 */

//                                                 _Output Two_
/*
Enter a guess 0-head or 1-tail: 1
Incorrect guess.
 */