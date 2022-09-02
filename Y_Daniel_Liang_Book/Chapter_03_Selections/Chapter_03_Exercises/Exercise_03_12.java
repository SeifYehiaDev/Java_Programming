/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 2/9/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Palindrome number) Write a program that prompts the user to enter a three-digit
                integer and determines whether it is a palindrome number. A number is palindrome
                if it reads the same from right to left and from left to right.*/
//                                                 _Solution_
public class Exercise_03_12 {
    public static void main(String[] args) {
        int originalNumber, reverseNumber = 0, copyNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        originalNumber = input.nextInt();
        copyNumber = originalNumber;
        while (copyNumber != 0) {
            reverseNumber = reverseNumber * 10 + copyNumber % 10;
            copyNumber /= 10;
        }
        System.out.println((originalNumber == reverseNumber) ? originalNumber + " is a palindrome" : originalNumber + " is not a palindrome");
    }
}

/*                                                 _Output_
 * Enter a three-digit integer: 121
 * 121 is a palindrome
 * */