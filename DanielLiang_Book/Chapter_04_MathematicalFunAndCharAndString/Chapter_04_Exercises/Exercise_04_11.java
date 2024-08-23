/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 24/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_11 {
    public static void main(String[] args) {
        byte hexNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        hexNumber = input.nextByte();
        if (hexNumber < 0 || hexNumber > 15) {
            System.out.printf("%d is an invalid input", hexNumber);
            System.exit(1);
        }
        System.out.print("The hex value is ".concat((hexNumber <= 9) ? String.valueOf(hexNumber) : String.valueOf((char) (hexNumber + 'A' - 10))));
    }
}

//                                                 _Output One_
/*
Enter a decimal value (0 to 15): 11
The hex value is B
 */

//                                                 _Output Two_
/*
Enter a decimal value (0 to 15): 5
The hex value is 5
 */

//                                                 _Output Three_
/*
Enter a decimal value (0 to 15): 31
31 is an invalid input
 */

//                                                 _Output Four_
/*
Enter a decimal value (0 to 15): -31
-31 is an invalid input
 */