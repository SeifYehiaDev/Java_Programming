/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 28/10/2022
 * */

package Chapter_05_Lists;

import java.util.Scanner;

public class Listing_05_01_RepeatAdditionQuiz {
    public static void main(String[] args) {
        int randomNumbers[] = new int[2], answer;
        boolean validAnswer;
        Scanner input = new Scanner(System.in);
        for (int index = 0; index < randomNumbers.length; index++)
            randomNumbers[index] = (int) (Math.random() * 10);
        do {
            System.out.print("What's " + randomNumbers[0] + " + " + randomNumbers[1] + "? ");
            answer = input.nextInt();
            validAnswer = randomNumbers[0] + randomNumbers[1] == answer;
            if(!validAnswer)
                System.out.print("Wrong answer. Try again. What's " + randomNumbers[0] + " + " + randomNumbers[1] + "? ");
        } while (!validAnswer);
/*        System.out.print("What's " + randomNumbers[0] + " + " + randomNumbers[1] + "? ");
        answer = input.nextInt();
        while (randomNumbers[0] + randomNumbers[1] != answer) {
            System.out.print("Wrong answer. Try again. What's " + randomNumbers[0] + " + " + randomNumbers[1] + "? ");
            answer = input.nextInt();
        }*/
        System.out.println("You got it!");
    }
}

//                                                 _Output_
/*
What's 2 + 5? 7
You got it!
 */