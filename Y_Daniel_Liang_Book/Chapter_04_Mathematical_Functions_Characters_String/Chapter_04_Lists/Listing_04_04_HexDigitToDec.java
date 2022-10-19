/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 19/10/2022
 * */

package Chapter_04_Lists;

import java.util.Scanner;

public class Listing_04_04_HexDigitToDec {
    public static void main(String[] args) {
        String hexadecimalString;
        char digitOrLetter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        hexadecimalString = input.nextLine();
        if (hexadecimalString.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }
        digitOrLetter = Character.toUpperCase(hexadecimalString.charAt(0));
        System.out.println((digitOrLetter >= 'A' && digitOrLetter <= 'F') ? "The decimal value for hex digit ".concat(hexadecimalString).concat(" ").concat(String.valueOf(digitOrLetter - 'A' + 10)) : (Character.isDigit(digitOrLetter)) ? "The decimal value for hex digit ".concat(hexadecimalString).concat(" is ").concat(hexadecimalString) : hexadecimalString.concat(" is an valid input"));
    }
}

//                                                 _Output One_
/*
Enter a hex digit: AB7C
You must enter exactly one character
 */

//                                                 _Output Two_
/*
Enter a hex digit: B
The decimal value for hex digit B 11
 */

//                                                 _Output Three_
/*
Enter a hex digit: 8
The decimal value for hex digit 8 is 8
 */

//                                                 _Output Four_
/*
Enter a hex digit: T
T is an valid input
 */