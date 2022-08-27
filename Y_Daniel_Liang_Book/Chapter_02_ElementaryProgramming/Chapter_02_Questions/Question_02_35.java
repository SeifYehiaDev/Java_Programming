/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Questions;

/*                                                 _Question_
 * What is an integer overflow? Can floating-point operations cause overflow?
 * */
//                                                 _Solution_
public class Question_02_35 {
    public static void main(String[] args) {
        /*
        * What is an integer overflow?
        * executing the following statement causes overflow, because the largest value that can be stored in a variable
        * of the int type is 2147483647. 2147483648 will be too large for an int value.
        * int value = 2147483647 + 1;
        * value = -2147483648
        *
        * Can floating-point operations cause overflow?
        * No the result is max value of float
        * */
        float value = 3.4028235E38F + 2 ;
        System.out.println("The minimum value of float " + Float.MIN_VALUE + " and the maximum value of float " + Float.MAX_VALUE);
        System.out.println(value);
    }
}

/*                                                 _Output_
 * The minimum value of float 1.4E-45 and the maximum value of float 3.4028235E38
 * 3.4028235E38
 * */