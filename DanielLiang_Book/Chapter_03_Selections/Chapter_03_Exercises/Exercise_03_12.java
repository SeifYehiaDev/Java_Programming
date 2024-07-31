/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 31/07/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_12 {
    public static void main(String[] args) {
        int number, copyNumber, reverseNumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        number = input.nextInt();
        copyNumber = number;
        while (copyNumber > 0) {
            reverseNumber = (reverseNumber * 10) + copyNumber % 10;
            copyNumber /= 10;
        }
        System.out.printf("%d is %s palindrome", number, (number == reverseNumber) ? "a" : "not a");
    }
}

//                                                 _Output One_
/*
Enter a three-digit integer: 121
121 is a palindrome
 */

//                                                 _Output Two_
/*
Enter a three-digit integer: 123
123 is not a palindrome
 */