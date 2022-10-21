/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 21/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

//                                                 _Question_
        /*(Check substring) Write a program that prompts the user to enter two strings and
        reports whether the second string is a substring of the first string.*/
//                                                 _Solution_
public class Exercise_04_22 {
    public static void main(String[] args) {
        String s1, s2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        s1 = input.nextLine();
        System.out.print("Enter string s2: ");
        s2 = input.nextLine();
        System.out.println(s2.concat(" is ").concat(((s1.contains(s2)) ? "a" : "not a").concat(" substring of ").concat(s1)));
    }
}

//                                                 _Output One_
/*
Enter string s1: ABCD
Enter string s2: BC
BC is a substring of ABCD
 */

//                                                 _Output Two_
/*
Enter string s1: ABCD
Enter string s2: BDC
BDC is not a substring of ABCD
 */