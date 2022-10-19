/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 19/10/2022
 * */

package Chapter_04_Examples;

public class Example_04_21 {
    public static void main(String[] args) {
        System.out.printf("byteValue = %d\n", Byte.MAX_VALUE);
        System.out.printf("shortValue = %d\n", Short.MAX_VALUE);
        System.out.printf("intValue = %d\n", Integer.MAX_VALUE);
        System.out.printf("longValue = %d\n", Long.MAX_VALUE);
        System.out.println("_____________________________________________");
        System.out.printf("floatValue = %f\n", 12.3456F);
        System.out.printf("doubleValue = %f\n", 1.234567891011);
        System.out.println("_____________________________________________");
        boolean isValid = true;
        System.out.printf("isValid = %b\n", isValid);
        System.out.println("_____________________________________________");
        String fullName = "Seif Yehia Esmail";
        System.out.printf("fullName = %s\n", fullName);
        System.out.println("_____________________________________________");
        char charValue = 'S';
        System.out.printf("charValue = %c\n", charValue);
        System.out.println("_____________________________________________");
        double x = 5.2E-3;
        System.out.printf("x = %f\n", x);
        System.out.printf("x = %e\n", x);
        System.out.println("_____________________________________________");
        char letter = 'A';
        System.out.printf("letter = %c\n", letter);
       //  System.out.printf("letter = %d\n", letter); ===> Exception
    }
}

//                                                 _Output_
/*
byteValue = 127
shortValue = 32767
intValue = 2147483647
longValue = 9223372036854775807
_____________________________________________
floatValue = 12.345600
doubleValue = 1.234568
_____________________________________________
isValid = true
_____________________________________________
fullName = Seif Yehia Esmail
_____________________________________________
charValue = S
_____________________________________________
x = 0.005200
x = 5.200000e-03
_____________________________________________
letter = A
 */