/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 08/01/2023
 * */

package Chapter_05_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Repeat additions) Listing 5.4, SubtractionQuizLoop.java, generates five random
                subtraction questions. Revise the program to generate ten random addition questions
                for two integers between 1 and 15. Display the correct count and test time.*/
//                                                 _Solution_
public class Exercise_05_02 {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 10;
        int count = 0, numbers[] = new int[2], answerFromUser, correctAnswer, correctCount = 0;
        long startTime, testTime;
        String message = "", stateOfAnswer, stringQuestion;
        Scanner input = new Scanner(System.in);
        startTime = System.currentTimeMillis();
        while (count < NUMBER_OF_QUESTIONS) {
            for (int i = 0; i < numbers.length; numbers[i] = (int) (1 + Math.random() * 15), i++) ;
            stringQuestion = numbers[0] + " + " + numbers[1];
            correctAnswer = numbers[0] + numbers[1];
            System.out.print("What's ".concat(stringQuestion).concat("? "));
            answerFromUser = input.nextInt();
            if (answerFromUser == correctAnswer) {
                System.out.println("You are correct!");
                correctCount++;
                stateOfAnswer = "correct";
            } else {
                System.out.println("Your answer is wrong." + '\n'
                        + stringQuestion.concat(" should be ") + correctAnswer);
                stateOfAnswer = "wrong";
            }
            message += stringQuestion.concat("=") + answerFromUser + " ".concat(stateOfAnswer).concat("\n");
            count++;
        }
        testTime = (System.currentTimeMillis() - startTime) / 1000;
        System.out.println('\n' + "Correct count is " + correctCount + '\n'
                + "Test time is " + testTime + " seconds.");
        System.out.print('\n' + message);
    }
}

//                                                 _Output_
/*
What's 4 + 13? 17
You are correct!
What's 4 + 2? 6
You are correct!
What's 6 + 10? 16
You are correct!
What's 4 + 2? 6
You are correct!
What's 6 + 10? 16
You are correct!
What's 11 + 10? 1
Your answer is wrong.
11 + 10 should be 21
What's 8 + 7? 1
Your answer is wrong.
8 + 7 should be 15
What's 11 + 11? 1
Your answer is wrong.
11 + 11 should be 22
What's 9 + 12? 1
Your answer is wrong.
9 + 12 should be 21
What's 10 + 4? 1
Your answer is wrong.
10 + 4 should be 14

Correct count is 5
Test time is 42 seconds

4 + 13=17 correct
4 + 2=6 correct
6 + 10=16 correct
4 + 2=6 correct
6 + 10=16 correct
11 + 10=1 wrong
8 + 7=1 wrong
11 + 11=1 wrong
9 + 12=1 wrong
10 + 4=1 wrong
 */