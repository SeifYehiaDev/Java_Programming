/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 24/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_09 {
    public static void main(String[] args) {
        char character;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        character = input.nextLine().trim().charAt(0);
        System.out.printf("The Unicode for the character %c is %d", character, (int) character);
    }
}

//                                                 _Output_
/*
Enter a character: E
The Unicode for the character E is 69
 */