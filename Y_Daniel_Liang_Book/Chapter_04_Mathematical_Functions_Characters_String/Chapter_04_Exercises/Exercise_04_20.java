/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 21/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Process a string) Write a program that prompts the user to enter a string and displays
                its length and its first character.*/
//                                                 _Solution_
public class Exercise_04_20 {
    public static void main(String[] args) {
        String message;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your message: ");
        message = input.nextLine();
        System.out.println("The message length is " + message.length());
        System.out.println("The first character of your message is '" + message.charAt(0) + "'");
    }
}

//                                                 _Output_
/*
Enter your message: Welcome to Java
The message length is 15
The first character of your message is 'W'
 */