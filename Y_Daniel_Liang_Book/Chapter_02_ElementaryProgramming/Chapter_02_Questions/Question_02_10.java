/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_02_Questions;

/*                                                 _Question_
 * Find the largest and smallest byte, short, int, long, float, and double.
 * Which of these data types requires the least amount of memory?
 * */
//                                                 _Solution_
public class Question_02_10 {
    public static void main(String[] args) {
        System.out.println("The minimum value of byte is " + Byte.MIN_VALUE + " The maximum value of byte is " + Byte.MAX_VALUE);
        System.out.println("The minimum value of short is " + Short.MIN_VALUE + " The maximum value of short is " + Short.MAX_VALUE);
        System.out.println("The minimum value of int is " + Integer.MIN_VALUE + " The maximum value of int is " + Integer.MAX_VALUE);
        System.out.println("The minimum value of long is " + Long.MIN_VALUE + " The maximum value of long is " + Long.MAX_VALUE);
        System.out.println("The minimum value of float is " + Float.MIN_VALUE + " The maximum value of float is " + Float.MAX_VALUE);
        System.out.println("The minimum value of double is " + Double.MIN_VALUE + " The maximum value of double is " + Double.MAX_VALUE);
        // Which of these data types requires the least amount of memory?
        // byte because is 1 byte = 8 bit range from -128 to 127
    }
}

/*                                                 _Output_
 * The minimum value of byte is -128 The maximum value of byte is 127
 * The minimum value of short is -32768 The maximum value of short is 32767
 * The minimum value of int is -2147483648 The maximum value of int is 2147483647
 * The minimum value of long is -9223372036854775808 The maximum value of long is 9223372036854775807
 * The minimum value of float is 1.4E-45 The maximum value of float is 3.4028235E38
 * The minimum value of double is 4.9E-324 The maximum value of double is 1.7976931348623157E308
 * */