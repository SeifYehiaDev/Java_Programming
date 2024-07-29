/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 29/07/2024
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
            System.out.printf("%d is divisible by 2 and 3.\n", number);
        if (number % 2 == 0 || number % 3 == 0)
            System.out.printf("%d is divisible by 2 or 3.\n", number);
        if (number % 2 == 0 ^ number % 3 == 0)
            System.out.printf("%d is divisible by 2 or 3, but not both.", number);
    }
}

//                                                 _Output One_
/*
Enter an integer: 4
4 is divisible by 2 or 3.
4 is divisible by 2 or 3, but not both.
 */

//                                                 _Output Two_
/*
Enter an integer: 18
18 is divisible by 2 and 3.
18 is divisible by 2 or 3.
 */