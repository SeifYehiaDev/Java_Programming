/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 24/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_12 {
    public static void main(String[] args) {
        int number;
        String hexString, binaryNumber = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        hexString = input.nextLine().trim();
        if (hexString.length() != 1) {
            System.out.print("Error: You must enter exactly one character");
            System.exit(1);
        }
        if (hexString.charAt(0) >= '0' && hexString.charAt(0) <= '9' || hexString.charAt(0) >= 'A' && hexString.charAt(0) <= 'F') {
            number = (Character.isDigit(hexString.charAt(0))) ? hexString.charAt(0) - '0' : hexString.charAt(0) - ('A' - 10);
            while (number > 0) {
                binaryNumber = String.valueOf((number % 2)).concat(binaryNumber);
                number /= 2;
            }
            System.out.print("The binary value is ".concat(binaryNumber));
        } else
            System.out.print(hexString.concat(" is an invalid input"));
    }
}

//                                                 _Output One_
/*
Enter a hex digit: B
The binary value is 1011
 */

//                                                 _Output Two_
/*
Enter a hex digit: 5
The binary value is 101
 */

//                                                 _Output Three_
/*
Enter a hex digit: G
G is an invalid input
 */

//                                                 _Output Four_
/*
Enter a hex digit: Seif
Error: You must enter exactly one character
 */