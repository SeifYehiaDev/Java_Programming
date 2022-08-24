/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_02_Examples;

public class Example_02_05 {
    public static void main(String[] args) {
        // Binary      ======> 0b || 0B
        // octal       ======> 0
        // Hexadecimal ======> 0x || 0X
        int binaryNumber = 0B1111;
        int octalNumber = 07777;
        int hexadecimal = 0XFFFF;
        System.out.println("binaryNumber = 1111 after convert to decimal " + binaryNumber);
        System.out.println("octalNumber  = 7777 after convert to decimal " + octalNumber);
        System.out.println("binaryNumber = FFFF after convert to decimal " + hexadecimal);
    }
}

/*                                                 _Output_
 * binaryNumber = 1111 after convert to decimal 15
 * octalNumber  = 7777 after convert to decimal 4095
 * binaryNumber = FFFF after convert to decimal 65535
 * */