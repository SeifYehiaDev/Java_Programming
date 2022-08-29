/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/8/2022
 * */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_06_TestBooleanOperators {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = input.nextInt();
        if (number % 2 == 0 && number % 3 == 0)
            System.out.println(number + " is divisible by 2 and 3.");
        if (number % 2 == 0 || number % 3 == 0)
            System.out.println(number + " is divisible by 2 or 3.");
        if (number % 2 == 0 ^ number % 3 == 0)
            System.out.println(number + " is divisible by 2 or 3, but not both.");
    }
}

/*                                                 _Output One_
 * Enter an integer: 4
 * 4 is divisible by 2 or 3.
 * 4 is divisible by 2 or 3, but not both.
 * */

/*                                                 _Output Two_
 * Enter an integer: 18
 * 18 is divisible by 2 and 3.
 * 18 is divisible by 2 or 3.
 * */