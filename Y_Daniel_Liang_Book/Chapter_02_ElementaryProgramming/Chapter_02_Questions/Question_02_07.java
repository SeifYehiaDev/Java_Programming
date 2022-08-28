/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_02_Questions;

/*                                                 _Question_
 * What are the benefits of using constants? Declare an int constant SIZE with value 20.
 * */
//                                                 _Solution_
public class Question_02_07 {
    public static void main(String[] args) {
        /*
         * What are the benefits of using constants?
         * 1- you don't have to repeatedly type the same value if it is used multiple times.
         * 2- if you have to change the constant value (e.g., from 3.14 to 3.14159 for PI),
         * you need to change it only in a single location in the source code.
         * 3- Descriptive name for a constant makes the program easy to read.
         * */

        /*
         * Declare an int constant SIZE with value 20.
         * final (Keyword) + DataType + Identify(NameOfVariable) = Value  <========== initialization the variable is must
         * name of constant variable should be an upper case like PI , SIZE , MAX_VALUE
         * */
        final int SIZE = 20;
        System.out.println("SIZE is a constant variable is equal " + SIZE);
    }
}

/*                                                 _Output_
 * SIZE is a constant variable is equal 20
 * */