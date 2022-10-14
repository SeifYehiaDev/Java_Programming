/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 14/10/2022
 * */

package Chapter_04_Examples;

public class Example_04_03 {
    public static void main(String[] args) {
        /* The Rounding Methods
         * 1- ceil(x)  ===> x is rounded up to its nearest integer.
         * 2- floor(x) ===> x is rounded down to its nearest integer.
         * 3- rint(x)  ===> x is rounded up to its nearest integer.
         * 4- round(x)
         * Returns (int)Math.floor(x + 0.5) if x is a float and ===> float return int
         * Returns (long)Math.floor(x + 0.5) if x is a double   ===> double return long
         * */
        System.out.println("__________________Math.ceil(x)________________________");
        System.out.println("Math.ceil(2.0) = " + Math.ceil(2));
        System.out.println("Math.ceil(2.1) = " + Math.ceil(2.1));
        System.out.println("Math.ceil(2.5) = " + Math.ceil(2.1));
        System.out.println("Math.ceil(2.9) = " + Math.ceil(2.9));
        System.out.println("__________________Math.floor(x)________________________");
        System.out.println("Math.floor(2.0) = " + Math.floor(2.0));
        System.out.println("Math.floor(2.1) = " + Math.floor(2.1));
        System.out.println("Math.floor(2.5) = " + Math.floor(2.5));
        System.out.println("Math.floor(2.9) = " + Math.floor(2.5));
        System.out.println("__________________Math.rint(x)________________________");
        System.out.println("Math.rint(2.0) = " + Math.rint(2.0));
        System.out.println("Math.rint(2.1) = " + Math.rint(2.1));
        System.out.println("Math.rint(2.5) = " + Math.rint(2.5));
        System.out.println("Math.rint(2.9) = " + Math.rint(2.5));
        System.out.println("__________________Math.round(x)________________________");
        System.out.println("Math.round(2.0F) = " + Math.round(2.0F)); // return int  because x is float.
        System.out.println("Math.round(2.4F) = " + Math.round(2.4F)); // return int  because x is float.
        System.out.println("Math.round(2.5D) = " + Math.round(2.5D)); // return long because x is double.
        System.out.println("Math.round(2.6D) = " + Math.round(2.6D)); // return long because x is double.
    }
}

//                                                 _Output_
/*
__________________Math.ceil(x)________________________
Math.ceil(2.0) = 2.0
Math.ceil(2.1) = 3.0
Math.ceil(2.5) = 3.0
Math.ceil(2.9) = 3.0
__________________Math.floor(x)________________________
Math.floor(2.0) = 2.0
Math.floor(2.1) = 2.0
Math.floor(2.5) = 2.0
Math.floor(2.9) = 2.0
__________________Math.rint(x)________________________
Math.rint(2.0) = 2.0
Math.rint(2.1) = 2.0
Math.rint(2.5) = 2.0
Math.rint(2.9) = 2.0
__________________Math.round(x)________________________
Math.round(2.0F) = 2
Math.round(2.4F) = 2
Math.round(2.5D) = 3
Math.round(2.6D) = 3
*/