/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 20/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

//                                                 _Question_
                    /*(Find the Unicode of a character) Write a program that receives a character and
                    displays its Unicode.*/
//                                                 _Solution_
public class Exercise_04_09 {
    public static void main(String[] args) {
        char chr;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        chr = input.nextLine().charAt(0);
        System.out.println("The Unicode for the character " + chr + " is " + (int) chr);
    }
}

//                                                 _Output_
/*
Enter a character: E
The Unicode for the character E is 69
 */