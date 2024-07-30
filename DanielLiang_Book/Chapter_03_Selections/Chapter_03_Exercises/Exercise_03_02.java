/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/07/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_02 {
    public static void main(String[] args) {
        boolean isCorrectAnswer;
        int firstNumber = (int) (Math.random() * 10), secondNumber = (int) (Math.random() * 10), thirdNumber = (int) (Math.random() * 10), answer;
        Scanner input = new Scanner(System.in);
        System.out.printf("What is %d + %d + %d? ", firstNumber, secondNumber, thirdNumber);
        answer = input.nextInt();
        isCorrectAnswer = firstNumber + secondNumber + thirdNumber == answer;
        System.out.printf("%d + %d + %d = %d is %b", firstNumber, secondNumber, thirdNumber, answer, isCorrectAnswer);
    }
}

//                                                 _Output One_
/*
What is 8 + 2 + 3? 13
8 + 2 + 3 = 13 is true
 */

//                                                 _Output Two_
/*
What is 5 + 2 + 0? 5
5 + 2 + 0 = 5 is false
 */