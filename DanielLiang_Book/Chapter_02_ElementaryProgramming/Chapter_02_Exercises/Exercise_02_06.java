/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 25/07/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_06 {
    public static void main(String[] args) {
        int integerNumber, sumOfDigits = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        integerNumber = input.nextInt();
        while (integerNumber > 0) {
            sumOfDigits += integerNumber % 10;
            integerNumber /= 10;
        }
        System.out.printf("The sum of the digits is %d", sumOfDigits);
    }
}

//                                                 _Output_
/*
Enter a number between 0 and 1000: 999
The sum of the digits is 27
 */