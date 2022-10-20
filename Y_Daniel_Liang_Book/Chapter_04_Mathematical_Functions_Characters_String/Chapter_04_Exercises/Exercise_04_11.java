/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 20/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Decimal to hex) Write a program that prompts the user to enter an integer between
                0 and 15 and displays its corresponding hex number.*/
//                                                 _Solution_
public class Exercise_04_11 {
    public static void main(String[] args) {
        int hexadecimal;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        hexadecimal = input.nextInt();
        System.out.println((hexadecimal >= 0 && hexadecimal <= 9) ? "The hex value is " + hexadecimal : (hexadecimal >= 9 && hexadecimal <= 15) ? "The hex value is " + (char) (hexadecimal - 10 + 'A') : hexadecimal + " is an invalid input");
    }
}

//                                                 _Output One_
/*
Enter a decimal value (0 to 15): 11
The hex value is B
 */

//                                                 _Output Two_
/*
Enter a decimal value (0 to 15): 5
The hex value is 5
 */

//                                                 _Output Three_
/*
Enter a decimal value (0 to 15): 35
35 is an invalid input
 */