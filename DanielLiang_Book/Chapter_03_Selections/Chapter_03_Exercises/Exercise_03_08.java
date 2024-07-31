/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 31/07/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_08 {
    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integer: ");
        firstNumber = input.nextInt();
        secondNumber = input.nextInt();
        thirdNumber = input.nextInt();
        if (firstNumber > secondNumber)
            firstNumber = (firstNumber + secondNumber) - (secondNumber = firstNumber);
        if (secondNumber > thirdNumber)
            secondNumber = (secondNumber + thirdNumber) - (thirdNumber = secondNumber);
        if (firstNumber > secondNumber)
            firstNumber = (firstNumber + secondNumber) - (secondNumber = firstNumber);
        System.out.printf("After sorting in non-decreasing order: %d %d %d", firstNumber, secondNumber, thirdNumber);
    }
}

//                                                 _Output_
/*
Enter three integer: 80 70 90
After sorting in non-decreasing order: 70 80 90
 */