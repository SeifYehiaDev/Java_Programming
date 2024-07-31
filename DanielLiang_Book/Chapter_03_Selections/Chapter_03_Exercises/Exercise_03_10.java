/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 31/07/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_10 {
    public static void main(String[] args) {
        int firstNumber = (int) (Math.random() * 100), secondNumber = (int) (Math.random() * 100), answer, correctAnswer;
        Scanner input = new Scanner(System.in);
        if (secondNumber > firstNumber)
            firstNumber = (firstNumber + secondNumber) - (secondNumber = firstNumber);
        System.out.printf("What is %d - %d? ", firstNumber, secondNumber);
        answer = input.nextInt();
        correctAnswer = firstNumber - secondNumber;
        if (answer == correctAnswer)
            System.out.print("You are correct!");
        else
            System.out.printf("""
                    Your answer is wrong
                    %d - %d is %d""", firstNumber, secondNumber, correctAnswer);
    }
}

//                                                 _Output One_
/*
What is 45 - 13? 32
You are correct!
 */

//                                                 _Output Two_
/*
What is 96 - 55? 96
Your answer is wrong
96 - 55 is 41
 */