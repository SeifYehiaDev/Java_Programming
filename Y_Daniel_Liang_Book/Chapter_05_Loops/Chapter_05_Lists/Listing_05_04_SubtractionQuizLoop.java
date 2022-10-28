/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 28/10/2022
 * */

package Chapter_05_Lists;

import java.util.Arrays;
import java.util.Scanner;

public class Listing_05_04_SubtractionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        int count = 0, correctCount = 0, index, answer, correctAnswer, randomNumbers[] = new int[2];
        long startTime, testTime;
        String output = "";
        Scanner input = new Scanner(System.in);
        startTime = System.currentTimeMillis();
        while (count < NUMBER_OF_QUESTIONS) {
            for (index = 0; index < randomNumbers.length; index++)
                randomNumbers[index] = (int) (Math.random() * 11); // Generate random numbers between 0 and 10.
            if (randomNumbers[0] > randomNumbers[1])
                Arrays.sort(randomNumbers); // sorting array form low to high
            correctAnswer = randomNumbers[1] - randomNumbers[0];
            System.out.print(count + 1 + "- " + "What's " + randomNumbers[1] + " - " + randomNumbers[0] + "? ");
            answer = input.nextInt();
            if (answer == correctAnswer) {
                System.out.println("You are correct!");
                correctCount++;
            } else
                System.out.println("Your answer is wrong.\n" + randomNumbers[1] + " - " + randomNumbers[0] + " should be " + correctAnswer);
            output += randomNumbers[1] + "-" + randomNumbers[0] + "=" + answer + ((answer == correctAnswer) ? " correct" : " wrong") + "\n";
            count++;
        }
        testTime = (System.currentTimeMillis() - startTime) / 1000;
        System.out.println("\nCorrect count is " + correctCount);
        System.out.println("Test time is " + testTime + " seconds");
        System.out.print("\n" + output);
    }
}

//                                                 _Output_
/*
1- What's 2 - 0? 2
You are correct!
2- What's 7 - 2? 5
You are correct!
3- What's 10 - 6? 4
You are correct!
4- What's 4 - 1? 4
Your answer is wrong.
4 - 1 should be 3
5- What's 7 - 4? 7
Your answer is wrong.
7 - 4 should be 3

Correct count is 3
Test time is 13 seconds

2-0=2 correct
7-2=5 correct
10-6=4 correct
4-1=4 wrong
7-4=7 wrong
 */