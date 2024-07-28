/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 28/07/2024
 * */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_01_AdditionQuiz {
    public static void main(String[] args) {
        boolean isCorrectAnswer;
        int firstNumber = (int) (Math.random() * 10), secondNumber = (int) (Math.random() * 10), answer;
        Scanner input = new Scanner(System.in);
        System.out.printf("What is %d + %d? ", firstNumber, secondNumber);
        answer = input.nextInt();
        isCorrectAnswer = answer == (firstNumber + secondNumber);
        System.out.printf("%d + %d = %d is %b", firstNumber, secondNumber, answer, isCorrectAnswer);
    }
}

//                                                 _Output One_
/*

What is 1 + 6? 7
1 + 6 = 7 is true
 */

//                                                 _Output Two_
/*

What is 5 + 4? 10
5 + 4 = 10 is false
 */