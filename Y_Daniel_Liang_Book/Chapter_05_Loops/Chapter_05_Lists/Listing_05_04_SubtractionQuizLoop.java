/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 21/12/2022
 * */

package Chapter_05_Lists;

import java.util.Arrays;
import java.util.Scanner;

public class Listing_05_04_SubtractionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        long startTime, testTime;
        int randomNumbers[] = new int[2], answer, correctAnswer, correctCount = 0, index, count = 0;
        String equation, message = "", stateOfAnswer;
        Scanner input = new Scanner(System.in);
        startTime = System.currentTimeMillis();
        while (count < NUMBER_OF_QUESTIONS) {
            for (index = 0; index < randomNumbers.length; index++)
                randomNumbers[index] = (int) (Math.random() * 11);
            if (randomNumbers[0] > randomNumbers[1])
                Arrays.sort(randomNumbers);
            equation = randomNumbers[1] + " - " + randomNumbers[0];
            correctAnswer = randomNumbers[1] - randomNumbers[0];
            System.out.print("What's ".concat(equation).concat("? "));
            answer = input.nextInt();
            if (correctAnswer == answer) {
                System.out.println("You are correct!");
                correctCount++;
                stateOfAnswer = "correct";
            } else {
                System.out.println("Your answer is wrong.\n".concat(equation).concat(" should be ") + correctAnswer);
                stateOfAnswer = "wrong";
            }
            message += randomNumbers[1] + "-" + randomNumbers[0] + "=" + answer + " " + stateOfAnswer + "\n";
            count++;
        }
        testTime = (System.currentTimeMillis() - startTime) / 1000;
        System.out.println("\nCorrect count is " + correctCount);
        System.out.println("Test time is " + testTime + " seconds\n");
        System.out.print(message);
    }
}

//                                                 _Output_
/*
What's 5 - 0? 5
You are correct!
What's 10 - 1? 9
You are correct!
What's 8 - 1? 7
You are correct!
What's 6 - 6? 2
Your answer is wrong.
6 - 6 should be 0
What's 9 - 5? 5
Your answer is wrong.
9 - 5 should be 4

Correct count is 3
Test time is 13 seconds

5-0=5 correct
10-1=9 correct
8-1=7 correct
6-6=2 wrong
9-5=5 wrong
 */