/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 16/10/2022
 * */

package Chapter_04_Examples;

public class Example_04_08 {
    public static void main(String[] args) {
        char ch = (char) 0XAB0041; // The lower 16 bits hex code 0041 is assigned to ch
        // 0041 Hexadecimal = 65 decimal = 'A' Character
        System.out.println(ch); // ch is character A
        System.out.println("______________________________________________________________");
        ch = (char) 65.25; // Decimal 65 is assigned to ch
        System.out.println(ch);  // ch is character A
        System.out.println("______________________________________________________________");
        int i = (int) 'A'; // The Unicode of character A is assigned to i
        System.out.println(i); // i is 65
        System.out.println("______________________________________________________________");
        System.out.println("Byte range from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        byte b = 'a'; // implicit casting can used because it's in range
        System.out.println(b);
        // b = '\uFFF4' ; // implicit casting cannot use because unicode is 16 bits and Byte 8 bits
        // solve this problem using Explicit Casting
        b = (byte) '\u0061'; // Explicit Casting
        System.out.println(b);
        System.out.println("______________________________________________________________");
        int y = '2' + '3'; // (int)'2' is 50 and (int)'3' is 51
        System.out.println("i is " + y); // y is 101
        int j = 2 + 'a'; // (int)'a' is 97
        System.out.println("j is " + j); // j is 99
        System.out.println(j + " is the Unicode for character " + (char)j); // 99 is the Unicode for character c
        System.out.println("Chapter " + '2');
    }
}

//                                                 _Output_
/*
A
______________________________________________________________
A
______________________________________________________________
65
______________________________________________________________
Byte range from -128 to 127
97
97
______________________________________________________________
i is 101
j is 99
99 is the Unicode for character c
Chapter 2
 */