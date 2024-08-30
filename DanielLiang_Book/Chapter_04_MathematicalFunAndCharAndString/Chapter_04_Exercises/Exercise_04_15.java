/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_15 {
    public static void main(String[] args) {
        int number;
        char letter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        letter = Character.toUpperCase(input.nextLine().trim().charAt(0));
        if (Character.isLetter(letter)) {
            number = (letter >= 'W') ? 9 : (letter >= 'T') ? 8 : (letter >= 'P') ? 7 : (letter >= 'M') ? 6 : (letter >= 'J') ? 5 : (letter >= 'G') ? 4 : (letter >= 'D') ? 3 : 2;
            System.out.printf("The corresponding number is %d", number);
        } else
            System.out.printf("%c is an invalid input", letter);
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
Enter a letter: S
The corresponding number is 7
 */