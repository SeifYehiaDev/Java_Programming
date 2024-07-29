/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 29/07/2024
 * */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_03_SubtractionQuiz {
    public static void main(String[] args) {
        int firstNumber = (int) (Math.random() * 10), secondNumber = (int) (Math.random() * 10), correctAnswer, answer;
        Scanner input = new Scanner(System.in);
        if (secondNumber > firstNumber)
            firstNumber = (firstNumber + secondNumber) - (secondNumber = firstNumber);
        correctAnswer = firstNumber - secondNumber;
        System.out.printf("What is %d - %d? ", firstNumber, secondNumber);
        answer = input.nextInt();
        if (correctAnswer == answer)
            System.out.print("You are correct!");
        else {
            System.out.println("Your answer is wrong");
            System.out.printf("%d - %d is %d", firstNumber, secondNumber, correctAnswer);
        }
    }
}

//                                                 _Output One_
/*
What is 7 - 2? 5
You are correct!
 */

//                                                 _Output Two_
/*
What is 3 - 2? 3
Your answer is wrong
3 - 2 is 1
 */