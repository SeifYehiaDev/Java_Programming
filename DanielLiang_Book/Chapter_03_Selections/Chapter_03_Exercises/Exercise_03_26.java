/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_26 {
    public static void main(String[] args) {
        int integerNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        integerNumber = input.nextInt();
        System.out.printf("""
                Is %d divisible by 5 and 6? %b
                Is %d divisible by 5 or 6? %b
                Is %d divisible by 5 or 6, but not both? %b""",
                integerNumber, integerNumber % 30 == 0, integerNumber, integerNumber % 5 == 0 || integerNumber % 6 == 0,
                integerNumber, integerNumber % 5 == 0 ^ integerNumber % 6 == 0);
    }
}

//                                                 _Output_
/*
Enter an integer: 10
Is 10 divisible by 5 and 6? false
Is 10 divisible by 5 or 6? true
Is 10 divisible by 5 or 6, but not both? true
 */