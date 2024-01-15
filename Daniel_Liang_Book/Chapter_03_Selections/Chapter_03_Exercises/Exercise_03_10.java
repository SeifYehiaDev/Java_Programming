/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 15/01/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_10 {
    public static void main(String[] args) {
        int firstNumber = (int) (Math.random() * 100), secondNumber = (int) (Math.random() * 100), answer;
        Scanner input = new Scanner(System.in);
        if (firstNumber < secondNumber) firstNumber = (firstNumber + secondNumber) - (secondNumber = firstNumber);
        System.out.printf("What's %d - %d? ", firstNumber, secondNumber);
        answer = input.nextInt();
        System.out.print((firstNumber - secondNumber == answer) ? "You are correct!" : "Your answer is wrong\n" + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
    }
}

//                                                 _Output One_
/*
What's 52 - 38? 14
You are correct!
 */

//                                                 _Output Two_
/*
What's 30 - 13? 13
Your answer is wrong
30 - 13 = 17
 */