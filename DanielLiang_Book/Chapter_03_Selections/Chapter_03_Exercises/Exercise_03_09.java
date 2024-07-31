/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 31/07/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_09 {
    public static void main(String[] args) {
        String stringIsbn;
        int isbn, checkSum = 0, count = 9;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        isbn = input.nextInt();
        stringIsbn = String.valueOf(isbn);
        while (isbn > 0) {
            checkSum += (isbn % 10) * count;
            count--;
            isbn /= 10;
        }
        checkSum %= 11;
        System.out.print("The ISBN-10 number is ".concat(stringIsbn).concat((checkSum == 10) ? "X" : String.valueOf(checkSum)));
    }
}

//                                                 _Output One_
/*
Enter the first 9 digits of an ISBN as integer: 013601267
The ISBN-10 number is 136012671
 */

//                                                 _Output Two_
/*
Enter the first 9 digits of an ISBN as integer: 013031997
The ISBN-10 number is 13031997X
 */