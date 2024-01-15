/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 15/01/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_09 {
    public static void main(String[] args) {
        int isbn, checkSum = 0;
        int[] isbnArray = new int[9];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        isbn = input.nextInt();
        for (int index = isbnArray.length - 1; index >= 0; index--) {
            isbnArray[index] = isbn % 10;
            checkSum += isbnArray[index] * (index + 1);
            isbn /= 10;
        }
        System.out.print("The ISBN-10 number is ");
        for (int digit : isbnArray) System.out.print(digit);
        System.out.print((checkSum % 11 == 10) ? "X" : checkSum % 11);
    }
}

//                                                 _Output One_
/*
Enter the first 9 digits of an ISBN as integer: 013601267
The ISBN-10 number is 0136012671
 */

//                                                 _Output Two_
/*
Enter the first 9 digits of an ISBN as integer: 013031997
The ISBN-10 number is 013031997X
 */