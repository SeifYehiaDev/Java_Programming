/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Examples;

public class Example_02_11 {
    public static void main(String[] args) {
        int value = 2147483647 + 1;
        // int value = 2147483648; Error out of range +1
        System.out.println("Max value of integer " + Integer.MAX_VALUE + " and minimum value of integer " + Integer.MIN_VALUE);
        System.out.println("value = " + value);
    }
}

/*                                                 _Output_
 * Max value of integer 2147483647 and minimum value of integer -2147483648
 * value = -2147483648
 * */