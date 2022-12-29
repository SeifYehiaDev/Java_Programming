/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/12/2022
 * */

package Chapter_05_Questions;

import java.util.Scanner;

//                                                 _Question_
            /*Will the program work if n1 and n2 are replaced by n1 / 2 and n2 / 2 in line 17 in Listing 5.9?*/
//                                                 _Solution_
public class Question_05_21 {
    public static void main(String[] args) {
        int firstNumber, secondNumber, commonDivisor = Integer.MAX_VALUE, k;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();
        for (k = 2; k <= firstNumber && k <= secondNumber; commonDivisor = (firstNumber % k == 0 && secondNumber % k == 0) ? k : commonDivisor, k++) ;
        System.out.println("The greatest common divisor for " + firstNumber + " and " + secondNumber + " is " + commonDivisor);
    }
}

//                                                 _Output_
/*
Enter first number: 2525
Enter second number: 25
The greatest common divisor for 2525 and 25 is 25
 */