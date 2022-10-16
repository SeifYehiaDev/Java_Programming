/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 16/10/2022
 * */

package Chapter_04_Examples;

public class Example_04_07 {
    public static void main(String[] args) {
        System.out.println("He said \"java is fun\"");
        System.out.println("\\b is a Backspace");
        System.out.println("Seif\bYehia");
        System.out.println("\\t is a Tab");
        System.out.println("Seif\tYehia");
        System.out.println("\\r is a Carriage Return");
        System.out.println("Seif\rYehia"); // remove seif
        System.out.println("SeifYehia\r"); // No Action
        System.out.println("\rSeifYehia"); // No Action
        System.out.println("\\n is a Carriage Linefeed");
        System.out.println("Seif\nYehia");
        System.out.println("\\f is a Carriage Formfeed"); // it's 
        System.out.println("Seif\fYehia\f");
    }
}

//                                                 _Output_
/*
He said "java is fun"
\b is a Backspace
SeiYehia
\t is a Tab
Seif	Yehia
\r is a Carriage Return
Yehia
SeifYehia
SeifYehia
\n is a Carriage Linefeed
Seif
Yehia
\f is a Carriage Formfeed
SeifYehia
 */