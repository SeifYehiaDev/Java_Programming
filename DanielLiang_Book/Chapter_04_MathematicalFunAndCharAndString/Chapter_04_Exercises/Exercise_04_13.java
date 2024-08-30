/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_13 {
    public static void main(String[] args) {
        char letter;
        boolean isVowel;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        letter = input.nextLine().trim().charAt(0);
        if (Character.isLetter(letter)) {
            isVowel = Character.toLowerCase(letter) == 'a' || Character.toLowerCase(letter) == 'e' || Character.toLowerCase(letter) == 'i' || Character.toLowerCase(letter) == 'o' || Character.toLowerCase(letter) == 'u';
            System.out.printf("%c is a %s", letter, (isVowel) ? "vowel" : "consonant");
        } else
            System.out.printf("%c is an invalid input", letter);
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