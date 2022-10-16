/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 16/10/2022
 * */

package Chapter_04_Examples;

public class Example_04_10 {
    public static void main(String[] args) {
        System.out.println("isDigit('a') is " + Character.isDigit('a')); // false
        System.out.println("isDigit('1') is " + Character.isDigit('1')); // true
        System.out.println("isLetter('a') is " + Character.isLetter('a')); // true
        System.out.println("isLowerCase('a') is " + Character.isLowerCase('a')); // true
        System.out.println("isUpperCase('a') is " + Character.isUpperCase('a')); // false
        System.out.println("isUpperCase('A') is " + Character.isUpperCase('A')); // true
        System.out.println("toLowerCase('T') is " + Character.toLowerCase('T')); // t
        System.out.println("toUpperCase('q') is " + Character.toUpperCase('q')); // Q
    }
}

//                                                 _Output_
/*
isDigit('a') is false
isDigit('1') is true
isLetter('a') is true
isLowerCase('a') is true
isUpperCase('a') is false
isUpperCase('A') is true
toLowerCase('T') is t
toUpperCase('q') is Q
 */