/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/12/2022
 * */

package Chapter_05_Questions;

import java.util.Scanner;

//                                                 _Question_
/*In Listing 5.11, how many times the loop body is executed for a decimal number 245
and how many times the loop body is executed for a decimal number 3245?*/
//                                                 _Solution_
public class Question_05_23 {
    public static void main(String[] args) {
        int decimalNumber, remainder, times = 0;
        char hexDigit;
        String hexadecimal = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        decimalNumber = input.nextInt();
        while (decimalNumber != 0) {
            remainder = decimalNumber % 16;
            hexDigit = (char) ((remainder >= 0 && remainder <= 9) ? remainder + '0' : remainder - 10 + 'A');
            hexadecimal = hexDigit + hexadecimal;
            decimalNumber /= 16;
            times++;
        }
        System.out.println("The hex number is ".concat(hexadecimal));
        System.out.println("how many times the loop body is executed for a decimal number 245? " + times);
    }
}

//                                                 _Output One_
/*
Enter a decimal number: 245
The hex number is F5
how many times the loop body is executed for a decimal number 245? 2
 */

//                                                 _Output Two_
/*
Enter a decimal number: 3245
The hex number is CAD
how many times the loop body is executed for a decimal number 245? 3
 */