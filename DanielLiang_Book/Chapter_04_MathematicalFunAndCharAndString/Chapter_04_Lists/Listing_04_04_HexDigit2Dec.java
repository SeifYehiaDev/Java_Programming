/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 23/08/2024
 * */

package Chapter_04_Lists;

import java.util.Scanner;

public class Listing_04_04_HexDigit2Dec {
    public static void main(String[] args) {
        String hexString;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        hexString = input.nextLine();
        if (hexString.length() != 1) {
            System.out.print("You must enter exactly one character");
            System.exit(1);
        }
        if (hexString.charAt(0) >= 'A' && hexString.charAt(0) <= 'F')
            System.out.printf("The decimal value for hex digit %c is %d", hexString.charAt(0), hexString.charAt(0) - 'A' + 10);
        else if (Character.isDigit(hexString.charAt(0)))
            System.out.printf("The decimal value for hex digit %c is %c", hexString.charAt(0), hexString.charAt(0));
        else
            System.out.printf("%c is an invalid input", hexString.charAt(0));
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
The decimal value for hex digit B is 11
 */

//                                                 _Output Three_
/*
Enter a hex digit: 8
The decimal value for hex digit 8 is 8
 */

//                                                 _Output Four_
/*
Enter a hex digit: T
T is an invalid input
 */