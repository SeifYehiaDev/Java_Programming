/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 26/9/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                     /*(Use the &&, || and ^ operators) Write a program that prompts the user to enter
                    an integer and determines whether it is divisible by 5 and 6, whether it is divisible
                    by 5 or 6, and whether it is divisible by 5 or 6, but not both.*/
//                                                 _Solution_
public class Exercise_03_26 {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = input.nextInt();
        System.out.println("Is " + number + " divisible by 5 and 6? " + (number % 5 == 0 && number % 6 == 0));
        System.out.println("Is " + number + " divisible by 5 or 6? " + (number % 5 == 0 || number % 6 == 0));
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + (number % 5 == 0 ^ number % 6 == 0));
    }
}

/*                                                 _Output_
 * Enter an integer: 10
 * Is 10 divisible by 5 and 6? false
 * Is 10 divisible by 5 or 6? true
 * Is 10 divisible by 5 or 6, but not both? true
 * */