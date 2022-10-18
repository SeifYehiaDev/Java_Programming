/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 18/10/2022
 * */

package Chapter_04_Examples;

import java.util.Scanner;

public class Example_04_15 {
    public static void main(String[] args) {
        String firstString = "Hello", secondString;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the second string to compare: ");
        secondString = input.next();
        System.out.println("The first string is ".concat(firstString));
        System.out.println("The second string is ".concat(secondString));
        if (firstString == secondString)
            System.out.println("string1 and string2 are the same");
        else
            System.out.println("string1 and string2 are different");
    }
}

//                                                 _Output_
/*

 */