/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/12/2022
 * */

package Chapter_05_Questions;

import java.util.Scanner;

//                                                 _Question_
    /*In Listing 5.11, why is it wrong if you change the code (char)(hexValue + '0') to hexValue + '0' in line 21?*/
//                                                 _Solution_
public class Question_05_22 {
    public static void main(String[] args) {
        int decimalNumber, remainder;
        char hexDigit;
        String hexadecimal = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        decimalNumber = input.nextInt();
        while (decimalNumber != 0) {
            remainder = decimalNumber % 16;
            hexDigit = (char) ((remainder >= 0 && remainder <= 9) ? remainder + '0' : remainder - 10 + 'A');
//          hexDigit = (remainder >= 0 && remainder <= 9) ? (remainder + '0') : (char) (remainder - 10 + 'A');
            // Error Because Don't using Casting ===== > char = int
            hexadecimal = hexDigit + hexadecimal;
            decimalNumber /= 16;
        }
        System.out.println("The hex number is ".concat(hexadecimal));
    }
}

//                                                 _Output_
/*
Enter a decimal number: 123
The hex number is 7B
 */