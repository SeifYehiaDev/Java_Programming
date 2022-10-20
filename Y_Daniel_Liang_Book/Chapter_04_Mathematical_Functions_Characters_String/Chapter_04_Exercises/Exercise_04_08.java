/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 20/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Find the character of an ASCII code) Write a program that receives an ASCII code
                (an integer between 0 and 127) and displays its character.*/
//                                                 _Solution_
public class Exercise_04_08 {
    public static void main(String[] args) {
        short asciiCode;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        asciiCode = input.nextShort();
        if (asciiCode < 0 || asciiCode > Byte.MAX_VALUE) {
            System.out.println(" Error: integer number should be between 0 and 127");
            System.exit(1);
        }
        System.out.println("The character for ASCII code " + asciiCode + " is " + (char) asciiCode);
    }
}

//                                                 _Output_
/*
Enter an ASCII code: 69
The character for ASCII code 69 is E
 */