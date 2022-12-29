/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/12/2022
 * */

package Chapter_05_Lists;

import java.util.Scanner;

public class Listing_05_11_Dec2Hex {
    public static void main(String[] args) {
        int decimal, remainder;
        String hexadecimal = "";
        char hexDigit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        decimal = input.nextInt();
        while (decimal != 0) {
            remainder = decimal % 16;
            hexDigit = (char) ((remainder >= 0 && remainder <= 9) ? (remainder + '0') : (remainder - 10 + 'A'));
            hexadecimal = hexDigit + hexadecimal;
            decimal /= 16;
        }
        System.out.println("The hex number is ".concat(hexadecimal));
    }
}

//                                                 _Output_
/*
Enter a decimal number: 1234
The hex number is 4D2
 */
