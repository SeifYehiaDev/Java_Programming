/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_20 {
    public static void main(String[] args) {
        String string;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        string = input.nextLine();
        System.out.printf("\"%s\" has a length of %d and its first character is %c", string, string.length(), string.charAt(0));
    }
}

//                                                 _Output_
/*
Enter a string: Welcome to Java
"Welcome to Java" has a length of 15 and its first character is W
 */