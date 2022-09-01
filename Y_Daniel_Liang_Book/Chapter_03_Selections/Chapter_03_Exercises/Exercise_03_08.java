/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 1/9/2022
 * */

package Chapter_03_Exercises;

import java.util.Arrays;
import java.util.Scanner;

//                                                 _Question_
            /*(Sort three integers) Write a program that prompts the user to enter three integers
            and display the integers in non-decreasing order.*/
//                                                 _Solution_
public class Exercise_03_08 {
    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integer numbers: ");
        firstNumber = input.nextInt();
        secondNumber = input.nextInt();
        thirdNumber = input.nextInt();
        if (firstNumber > secondNumber) {
            firstNumber = firstNumber + secondNumber;
            secondNumber = firstNumber - secondNumber;
            firstNumber = firstNumber - secondNumber;
        }
        if (secondNumber > thirdNumber) {
            secondNumber = secondNumber + thirdNumber;
            thirdNumber = secondNumber - thirdNumber;
            secondNumber = secondNumber - thirdNumber;
        }
        if (firstNumber > secondNumber) {
            firstNumber = firstNumber + secondNumber;
            secondNumber = firstNumber - secondNumber;
            firstNumber = firstNumber - secondNumber;
        }
        System.out.println(firstNumber + "\t" + secondNumber + "\t" + thirdNumber);
  /*      int[] numbers = new int[3];
        int a, b, comparisonsToMake = numbers.length - 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integer numbers: ");
        for (a = 0; a < numbers.length; a++)
            numbers[a] = input.nextInt();
        // bubble sort
        for (a = 0; a < numbers.length - 1; a++) {
            for (b = 0; b < comparisonsToMake; b++)
                if (numbers[b] > numbers[b + 1]) {
                    numbers[b] = numbers[b] + numbers[b + 1];
                    numbers[b + 1] = numbers[b] - numbers[b + 1];
                    numbers[b] = numbers[b] - numbers[b + 1];
                }
            --comparisonsToMake;
        }
        //  Arrays.sort(numbers);
        for (int value : numbers)
            System.out.print(value + "\t");*/
    }
}

/*                                                 _Output_
 * Enter three integer numbers: 60 110 30
 * 30	60	110
 * */