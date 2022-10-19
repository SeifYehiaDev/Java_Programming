/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 19/10/2022
 * */

package Chapter_04_Examples;

public class Example_04_22 {
    public static void main(String[] args) {
        System.out.printf("%5c\n", 'S'); // 4 space
        System.out.printf("%6b\n", true); // 2 space
        System.out.printf("%6b\n", false); // 1 space
        System.out.printf("%5d\n", 12345); // 0 space
        System.out.printf("%6d\n", 12345); // 1 space
        System.out.printf("%7d\n", 12345); // 2 space
        System.out.printf("%5s\n", "Seif"); // 1 space
        System.out.printf("%5.2f\n", 12.34_5678F); // 0 space
        System.out.printf("%1.4f\n", 12.3456_78F); // 0 space
        System.out.printf("%10.4f\n", 12.3456_78F); //  space = 10 - 7 = 3 // "   12.3457"
        System.out.println("__________________________________________________");
        System.out.printf("%3d#%2s#%4.2f\n", 1234, "Java", 51.6653); // 1234#Java#51.67
        System.out.printf("%8d%8s%8.1f\n", 1234, "Java", 5.6_3); // "    1234    Java     5.6"
        System.out.printf("%-8d%-8s%-8.1f \n", 1234, "Java", 5.6_3);// "1234    Java    5.6     "
        System.out.println("__________________________________________________");
        System.out.printf("%%b is a Boolean value\n");
        System.out.printf("%%c is a character\n");
        System.out.printf("%%d is a decimal integer\n");
        System.out.printf("%%f is a floating-point number\n");
        System.out.printf("%%e is a number in standard scientific notation\n");
        System.out.printf("%%s is a string\n");
    }
}

//                                                 _Output_
/*
    S
  true
 false
12345
 12345
  12345
 Seif
12.35
12.3457
   12.3457
__________________________________________________
1234#Java#51.67
    1234    Java     5.6
1234    Java    5.6
__________________________________________________
%b is a Boolean value
%c is a character
%d is a decimal integer
%f is a floating-point number
%e is a number in standard scientific notation
%s is a string
 */