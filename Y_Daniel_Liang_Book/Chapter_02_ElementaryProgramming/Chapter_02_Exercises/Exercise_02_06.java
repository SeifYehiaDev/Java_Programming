/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Sum the digits in an integer) Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
 * For example, if an integer is 932, the sum of all its digits is 14.
 * Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit.
 * For instance, 932 % 10 = 2 and 932 / 10 = 93.
 * Here is a sample run:
 * Enter a number between 0 and 1000: 999
 * The sum of the digits is 27
 * */
//                                                 _Solution_
public class Exercise_02_06 {
    public static void main(String[] args) {
        int integerNumber, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        integerNumber = input.nextInt();
        while (integerNumber != 0) {
            sum += integerNumber % 10;
            integerNumber /= 10;
        }
        System.out.println("The sum of the digits is " + sum);
    }
}

/*                                                 _Output_
 * Enter a number between 0 and 1000: 999
 * The sum of the digits is 27
 * */