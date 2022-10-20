/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 20/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Hex to binary) Write a program that prompts the user to enter a hex digit and
                displays its corresponding binary number. Here is a sample run:*/
//                                                 _Solution_
public class Exercise_04_12 {
    public static void main(String[] args) {
        String hexString, binaryCode;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        hexString = input.nextLine();
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }
        char chr = Character.toUpperCase(hexString.charAt(0));
        switch (chr) {
            case '0':
                binaryCode = "0000";
                break;
            case '1':
                binaryCode = "0001";
                break;
            case '2':
                binaryCode = "0010";
                break;
            case '3':
                binaryCode = "0011";
                break;
            case '4':
                binaryCode = "0100";
                break;
            case '5':
                binaryCode = "0101";
                break;
            case '6':
                binaryCode = "0110";
                break;
            case '7':
                binaryCode = "0111";
                break;
            case '8':
                binaryCode = "1000";
                break;
            case '9':
                binaryCode = "1001";
                break;
            case 'A':
                binaryCode = "1010";
                break;
            case 'B':
                binaryCode = "1011";
                break;
            case 'C':
                binaryCode = "1100";
                break;
            case 'D':
                binaryCode = "1101";
                break;
            case 'E':
                binaryCode = "1110";
                break;
            case 'F':
                binaryCode = "1111";
                break;
            default:
                binaryCode = "Error";
        }
        System.out.println((binaryCode.equals("Error")) ? hexString.concat(" is an invalid input") : "The binary value is ".concat(binaryCode));
    }
}

//                                                 _Output One_
/*
Enter a hex digit: B
The binary value is 1011
 */

//                                                 _Output Two_
/*
Enter a hex digit: G
G is an invalid input
 */