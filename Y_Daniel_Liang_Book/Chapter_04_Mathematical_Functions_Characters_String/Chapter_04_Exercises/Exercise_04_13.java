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
        char charLetter, upperLetter;
        String stringLetter;
        boolean validLength;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        stringLetter = input.nextLine();
        validLength = stringLetter.length() == 1;
        charLetter = stringLetter.charAt(0);
        if (!(validLength & Character.isLetter(charLetter))) {
            System.out.println((!validLength) ? "You must enter exactly one character" : charLetter + " is an invalid input");
            System.exit(1);
        }
        upperLetter = Character.toUpperCase(charLetter);
        System.out.println(charLetter + " is a " + ((upperLetter == 'A' || upperLetter == 'O' || upperLetter == 'U' || upperLetter == 'I' || upperLetter == 'E') ? "vowel" : "consonant"));
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

//                                                 _Output Four_
/*
Enter a letter: Seif Yehia
You must enter exactly one character
 */