/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 20/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

//                                                 _Question_
                    /*(Vowel or consonant?) Write a program that prompts the user to enter a letter and
                    check whether the letter is a vowel or consonant.*/
//                                                 _Solution_
public class Exercise_04_13 {
    public static void main(String[] args) {
        char letter, upperLetter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        letter = input.nextLine().charAt(0);
        if (!Character.isLetter(letter)) {
            System.out.println(letter + " is an invalid input");
            System.exit(1);
        }
        upperLetter = Character.toUpperCase(letter);
        System.out.println(letter + " is a " + ((upperLetter == 'A' || upperLetter == 'O' || upperLetter == 'U' || upperLetter == 'I' || upperLetter == 'E') ? "vowel" : "consonant"));
    }
}

//                                                 _Output One_
/*
Enter a letter: B
B is a consonant
 */

//                                                 _Output Two_
/*
Enter a letter: a
a is a vowel
 */

//                                                 _Output Three_
/*
Enter a letter: #
# is an invalid input
 */