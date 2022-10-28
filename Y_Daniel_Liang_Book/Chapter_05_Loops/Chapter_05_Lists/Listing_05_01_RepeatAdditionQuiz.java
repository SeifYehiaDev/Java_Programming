/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 28/10/2022
 * */

package Chapter_05_Lists;

import java.util.Scanner;

public class Listing_05_01_RepeatAdditionQuiz {
    public static void main(String[] args) {
        int randomNumbers[] = new int[3];
        boolean validAnswer = true;
        Scanner input = new Scanner(System.in);
        for (int index = 0; index < randomNumbers.length; index++)
            randomNumbers[index] = (int) (Math.random() * 10);
        do {
            System.out.print((validAnswer) ? "What's " + randomNumbers[0] + " + " + randomNumbers[1] + "? " : "Wrong answer. Try again. What's " + randomNumbers[0] + " + " + randomNumbers[1] + "? ");
            randomNumbers[2] = input.nextInt();
            validAnswer = randomNumbers[0] + randomNumbers[1] == randomNumbers[2];
        } while (!validAnswer);
        System.out.println("You got it!");
    }
}

//                                                 _Output_
/*
What's 8 + 9? 98
Wrong answer. Try again. What's 8 + 9? 32
Wrong answer. Try again. What's 8 + 9? 17
You got it!
 */