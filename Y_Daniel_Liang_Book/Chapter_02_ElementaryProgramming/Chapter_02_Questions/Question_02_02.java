/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_02_Questions;

import java.util.Scanner;

/*                                                 _Question_
 * How do you write a statement to let the user enter a double value from the keyboard?
 * What happens if you entered 5a when executing the following code?
 * */
//                                                 _Solution_
public class Question_02_02 {
    public static void main(String[] args) {
        //   How do you write a statement to let the user enter a double value from the keyboard?
        double doubleValue;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the double value >> ");
        doubleValue = input.nextDouble();
        System.out.println("You enter a double number is " + doubleValue);
        // What happens if you entered 5a when executing the following code?
        /*
        * Exception in thread "main" java.util.InputMismatchException
        *     at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        *     at java.base/java.util.Scanner.next(Scanner.java:1594)
        *     at java.base/java.util.Scanner.nextDouble(Scanner.java:2564)
        *     at Chapter_02_Questions.Question_02_02.main(Question_02_02.java:22)
        * */
    }
}

/*                                                 _Output_
 * Please enter the double value >> 5
 * You enter a double number is 5.0
 * */