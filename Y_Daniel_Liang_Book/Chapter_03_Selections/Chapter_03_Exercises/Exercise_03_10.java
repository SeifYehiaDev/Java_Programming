/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 1/9/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
                subtraction question. Revise the program to randomly generate an addition question
                with two integers less than 100.*/
//                                                 _Solution_
public class Exercise_03_10 {
    public static void main(String[] args) {
        int firstNumber, secondNumber, correctAnswer, answer, temp;
        Scanner input = new Scanner(System.in);
        firstNumber = (int) (Math.random() * 99);
        secondNumber = (int) (Math.random() * 99);
        if (secondNumber > firstNumber) {
            temp = secondNumber;
            secondNumber = firstNumber;
            firstNumber = temp;
        }
        correctAnswer = firstNumber - secondNumber;
        System.out.println("What is " + firstNumber + " - " + secondNumber + "?");
        answer = input.nextInt();
        System.out.println((answer == correctAnswer) ? "you are correct!" : "Your answer is Wrong\n" + firstNumber + " - " + secondNumber + " should be " + correctAnswer);
    }
}

/*                                                 _Output One_
 * What is 49 - 22?
 * 27
 * you are correct!
 * */

/*                                                 _Output Two_
 * What is 83 - 3?
 * 5
 * Your answer is Wrong
 * 83 - 3 should be 80
 * */