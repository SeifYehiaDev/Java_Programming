/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/8/2022
 * */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_03_SubtractionQuiz {
    public static void main(String[] args) {
        int numberOne, numberTwo, answer, correctAnswer;
        Scanner input = new Scanner(System.in);
        // Generate two random single-digit integers
        numberOne = (int) (Math.random() * 10);
        numberTwo = (int) (Math.random() * 10);
        // If number1 < number2, swap number1 with number2
/*        if (numberTwo > numberOne) {
            int temp = numberOne;
            numberOne = numberTwo;
            numberTwo = temp;
        }*/
        if (numberTwo > numberOne) {
            // swap number1 with number2 without temp
            numberTwo = numberTwo + numberOne;
            numberOne = numberTwo - numberOne;
            numberTwo = numberTwo - numberOne;
        }
        correctAnswer = numberOne - numberTwo;
        System.out.print("What's " + numberOne + " - " + numberTwo + "? ");
        answer = input.nextInt();
        System.out.println((correctAnswer == answer) ? "You are correct!" : "Your answer is wrong\n" + numberOne + " - " + numberTwo + " is " + correctAnswer);
    }
}

/*                                                 _Output One_
 * What is 9 - 2?
 * 7
 * you are correct!
 * */

/*                                                 _Output Two_
 * What is 1 - 0?
 * -5
 * Your answer is Wrong
 * 1 - 0 should be 1
 * */