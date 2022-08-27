/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Questions;


import java.util.Scanner;

/*                                                 _Question_
 * Show the output with the input value 1.99.
 * */
//                                                 _Solution_
public class Question_02_33 {
    public static void main(String[] args) {
        int inputValue;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value : ");
        inputValue = input.nextInt();
        System.out.println("You enter "+inputValue);
    }
}

/*                                                 _Output_
 * Exception in thread "main" java.util.InputMismatchException
 * */