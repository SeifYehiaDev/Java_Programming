/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_19 {
    public static void main(String[] args) {
        String isbn;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        isbn = input.nextLine().trim();
        boolean validIsbn = isbn.length() == 9;
        if (validIsbn)
            for (int digit = 0; digit < 9; digit++) {
                if (Character.isDigit(isbn.charAt(digit)))
                    sum += (isbn.charAt(digit) - '0') * (digit + 1);
                else {
                    validIsbn = false;
                    break;
                }
            }
        System.out.print((validIsbn) ? "The ISBN-10 number is ".concat(isbn).concat((sum % 11 == 10) ? "X" : String.valueOf(sum % 11)) : "Error: invalid isbn");
    }
}

//                                                 _Output One_
/*
Enter the first 9 digits of an ISBN as integer: 013601267
The ISBN-10 number is 0136012671
 */

//                                                 _Output Two_
/*
Enter the first 9 digits of an ISBN as integer: 013031997
The ISBN-10 number is 013031997X
 */

//                                                 _Output Three_
/*
Enter the first 9 digits of an ISBN as integer: 01360
Error: invalid isbn
 */

//                                                 _Output Four_
/*
Enter the first 9 digits of an ISBN as integer: 0$30B1#9A
Error: invalid isbn
 */