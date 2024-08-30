/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_04_Exercises;

public class Exercise_04_25 {
    public static void main(String[] args) {
        char[] letters = new char[3];
        int[] digits = new int[4];
        for (int letter = 0; letter < letters.length; letter++) letters[letter] = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
        for (int digit = 0; digit < digits.length; digit++) digits[digit] = (int) (Math.random() * 10);
        for (char letter : letters) System.out.printf("%c", letter);
        for (int digit : digits) System.out.printf("%d", digit);
    }
}

//                                                 _Output_
/*
BMP6283
 */