/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 15/01/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_12 {
    public static void main(String[] args) {
        int number, reverseNumber = 0, copuNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        number = copuNumber = input.nextInt();
        while (copuNumber > 0) {
            reverseNumber = reverseNumber * 10 + copuNumber % 10;
            copuNumber /= 10;
        }
        System.out.printf("%d is %s", number, (number == reverseNumber) ? "a palindrome" : "not a palindrome");
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