/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 14/01/2024
 * */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_03_SubtractionQuiz {
    public static void main(String[] args) {
        int firstNumber = (int) (Math.random() * 10), secondNumber = (int) (Math.random() * 10), answer;
        Scanner input = new Scanner(System.in);
        if (secondNumber > firstNumber) firstNumber = (firstNumber + secondNumber) - (secondNumber = firstNumber);
        System.out.printf("What's %d - %d? ", firstNumber, secondNumber);
        answer = input.nextInt();
        System.out.print((answer == firstNumber - secondNumber) ? "You are correct!" :
                "Your answer is wrong\n" + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
    }
}

//                                                 _Output One_
/*
What's 9 - 1? 8
You are correct!
 */

//                                                 _Output Two_
/*
What's 4 - 3? 3
Your answer is wrong
4 - 3 = 1
 */