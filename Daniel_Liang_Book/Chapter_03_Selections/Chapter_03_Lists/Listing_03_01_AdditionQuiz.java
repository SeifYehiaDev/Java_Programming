/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 11/01/2024
 * */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_01_AdditionQuiz {
    public static void main(String[] args) {
        // Generate random value from 2 to 99
        int firstNumber = 2 + (int) (Math.random() * (99 - 2 + 1)),
                secondNumber = 2 + (int) (Math.random() * (99 - 2 + 1)),
                answer;
        Scanner input = new Scanner(System.in);
        System.out.printf("What's %d + %d? ", firstNumber, secondNumber);
        answer = input.nextInt();
        System.out.printf("%d + %d = %d is %b", firstNumber, secondNumber, answer, firstNumber + secondNumber == answer);
    }
}

//                                                 _Output One_
/*
What's 32 + 44? 76
32 + 44 = 76 is true
 */

//                                                 _Output Two_
/*
What's 79 + 9? 80
79 + 9 = 80 is false
 */