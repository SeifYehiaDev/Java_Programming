/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/12/2022
 * */

package Chapter_05_Examples;

import java.util.Scanner;

public class Example_05_10 {
    public static void main(String[] args) {
        int firstNumber, secondNumber, commonDivisor = 1, k;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first integer: ");
        firstNumber = input.nextInt();
        System.out.print("Enter a second integer: ");
        secondNumber = input.nextInt();
        for (k = 2; k <= firstNumber && k <= secondNumber; commonDivisor = (firstNumber % k == 0 && secondNumber % k == 0) ? k : commonDivisor, k++) ;
        System.out.println("The greatest common divisor for " + firstNumber + " and " + secondNumber + " is " + commonDivisor);
    }
}

//                                                 _Output_
/*
Enter a first integer: 125
Enter a second integer: 2525
The greatest common divisor for 125 and 2525 is 25
 */