/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 1/9/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                    /*(Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
                    consists of 10 digits: d1_d2_d3_d4_d5_d6_d7_d8_d9_d10. The last digit, d10, is a checksum,
                    which is calculated from the other nine digits using the following formula:
                (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
                    If the checksum is 10, the last digit is denoted as X according to the ISBN-10
                    convention. Write a program that prompts the user to enter the first 9 digits and
                    displays the 10-digit ISBN (including leading zeros). Your program should read*/
//                                                 _Solution_
public class Exercise_03_09 {
    public static void main(String[] args) {
        int isbn, sum = 0, checksum, index, arrayIsbn[] = new int[9];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        isbn = input.nextInt();
        for (index = arrayIsbn.length - 1; index >= 0; index--) {
            arrayIsbn[index] = isbn % 10;
            isbn /= 10;
        }
        for (index = 0; index < arrayIsbn.length; index++)
            sum += arrayIsbn[index] * (index + 1);
        checksum = sum % 11;
        System.out.print("The ISBN-10 number is ");
        for (int value : arrayIsbn)
            System.out.print(value);
        System.out.println((checksum == 10) ? "X" : checksum);

        //                                      another primitive solution
/*        int isbn, checksum, d1, d2, d3, d4, d5, d6, d7, d8, d9;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        isbn = input.nextInt();
        d9 = isbn % 10;
        isbn /= 10;
        d8 = isbn % 10;
        isbn /= 10;
        d7 = isbn % 10;
        isbn /= 10;
        d6 = isbn % 10;
        isbn /= 10;
        d5 = isbn % 10;
        isbn /= 10;
        d4 = isbn % 10;
        isbn /= 10;
        d3 = isbn % 10;
        isbn /= 10;
        d2 = isbn % 10;
        isbn /= 10;
        d1 = isbn % 10;
        checksum = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        System.out.printf("The ISBN-10 number is %d%d%d%d%d%d%d%d%d", d1, d2, d3, d4, d5, d6, d7, d8, d9);
        System.out.print((checksum == 10) ? "X" : checksum);*/

        //                                      another solution using array

/*        int checksum, sum = 0, index, isbn[] = new int[9];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        for (index = 0; index < isbn.length; index++)
            isbn[index] = input.nextInt();
        for (index = 0; index < isbn.length; index++)
            sum += isbn[index] * (index + 1);
        checksum = sum % 11;
        System.out.print("The ISBN-10 number is ");
        for (int value : isbn)
            System.out.print(value);
        System.out.println((checksum == 10) ? "X" : checksum);*/
    }
}

/*                                                 _Output One_
 * Enter the first 9 digits of an ISBN as integer: 013601267
 * The ISBN-10 number is 0136012671
 * */

/*                                                 _Output Two_
 * Enter the first 9 digits of an ISBN as integer: 013031997
 * The ISBN-10 number is 013031997X
 * */