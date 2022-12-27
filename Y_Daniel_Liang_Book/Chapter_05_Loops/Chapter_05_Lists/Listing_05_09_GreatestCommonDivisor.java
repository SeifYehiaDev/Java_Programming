/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/12/2022
 * */

package Chapter_05_Lists;

import java.util.Scanner;

public class Listing_05_09_GreatestCommonDivisor {
    public static void main(String[] args) {
        int firstNumber, secondNumber, commonDivisor = 1, k = 2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first integer: ");
        firstNumber = input.nextInt();
        System.out.print("Enter a second integer: ");
        secondNumber = input.nextInt();
        while (k <= firstNumber && k <= secondNumber) {
            if (firstNumber % k == 0 && secondNumber % k == 0)
                commonDivisor = k;
            k++;
        }
        System.out.println("The greatest common divisor for " + firstNumber + " and " + secondNumber + " is " + commonDivisor);
    }
}

//                                                 _Output_
/*
Enter a first integer: 125
Enter a second integer: 2525
The greatest common divisor for 125 and 2525 is 25
 */