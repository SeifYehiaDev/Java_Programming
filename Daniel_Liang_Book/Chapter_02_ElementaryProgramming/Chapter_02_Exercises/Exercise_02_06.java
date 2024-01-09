/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 09/01/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_06 {
    public static void main(String[] args) {
        int number, sumOFDigits = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        number = input.nextInt();
        while (number > 0) {
            sumOFDigits += number % 10;
            number /= 10;
        }
        System.out.print("The sum of the digits is " + sumOFDigits);
    }
}

//                                                 _Output_
/*
Enter a number between 0 and 1000: 999
The sum of digits is 27
 */