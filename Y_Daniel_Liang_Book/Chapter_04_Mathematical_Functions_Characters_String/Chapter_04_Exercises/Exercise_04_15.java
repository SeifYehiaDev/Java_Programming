/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 20/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Phone key pads) The international standard letter/number mapping found on the
                telephone is shown below:*/
//                                                 _Solution_
public class Exercise_04_15 {
    public static void main(String[] args) {
        char charLetter;
        String stringLetter;
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        stringLetter = input.nextLine();
        if (stringLetter.length() != 1 || !Character.isLetter(stringLetter.charAt(0))) {
            System.out.println((stringLetter.length() != 1) ? "You must enter exactly one character" : stringLetter.charAt(0) + " is an invalid input");
            System.exit(1);
        }
        charLetter = Character.toUpperCase(stringLetter.charAt(0));
        number = (charLetter >= 'W') ? 9 : (charLetter >= 'T') ? 8 : (charLetter >= 'P') ? 7 : (charLetter >= 'M') ? 6 : (charLetter >= 'J') ? 5 : (charLetter >= 'G') ? 4 : (charLetter >= 'D') ? 3 : 2;
        System.out.println("The corresponding number is " + number);
    }
}

//                                                 _Output One_
/*
Enter a letter: A
The corresponding number is 2
 */

//                                                 _Output Two_
/*
Enter a letter: a
The corresponding number is 2
 */

//                                                 _Output Three_
/*
Enter a letter: +
+ is an invalid input
 */

//                                                 _Output Four_
/*
Enter a letter: SeifYehia
You must enter exactly one character
 */