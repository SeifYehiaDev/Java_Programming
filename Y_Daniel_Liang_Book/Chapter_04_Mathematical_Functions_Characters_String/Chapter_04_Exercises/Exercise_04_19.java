/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 21/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

//                                                 _Question_
            /*(Business: check ISBN-10) Rewrite the Programming Exercise 3.9 by entering the
            ISBN number as a string.*/
//                                                 _Solution_
public class Exercise_04_19 {
    public static void main(String[] args) {
        String isbn;
        int checkSum, index, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        isbn = input.nextLine();
        if (isbn.length() != 9 || isDigit(isbn) != true) {
            System.out.println("Error: You must enter exactly nine digit");
            System.exit(1);
        }
        for (index = 0; index < isbn.length(); index++)
            sum += Integer.parseInt(isbn.substring(index, index + 1)) * (index + 1);
        checkSum = sum % 11;
        System.out.println("The ISBN-10 number is ".concat(isbn).concat((checkSum == 10) ? "X" : String.valueOf(checkSum)));
    }

    public static boolean isDigit(String isbn) {
        boolean isDigit = true;
        for (int index = 0; index < isbn.length(); index++)
            if (!Character.isDigit(isbn.charAt(index))) {
                isDigit = false;
                break;
            }
        return isDigit;
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
Enter the first 9 digits of an ISBN as integer: 013031
Error: You must enter exactly nine digit
 */

//                                                 _Output Four_
/*
Enter the first 9 digits of an ISBN as integer: 01@0S1E97
Error: You must enter exactly nine digit
 */