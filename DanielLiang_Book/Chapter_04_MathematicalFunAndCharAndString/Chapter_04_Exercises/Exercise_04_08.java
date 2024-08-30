/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 24/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_08 {
    public static void main(String[] args) {
        byte asciiCode;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        asciiCode = input.nextByte();
        if (asciiCode < 0) {
            System.out.print("Error: invalid input");
            System.exit(1);
        }
        System.out.printf("The character for ASCII code %d is %c", asciiCode, (char) asciiCode);
    }
}

//                                                 _Output One_
/*
Enter an ASCII code: 69
The character for ASCII code 69 is E
 */

//                                                 _Output Two_
/*
Enter an ASCII code: -69
Error: invalid input
 */