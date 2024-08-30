/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_22 {
    public static void main(String[] args) {
        String firstString, secondString;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        firstString = input.nextLine().trim();
        System.out.print("Enter string s2: ");
        secondString = input.nextLine().trim();
        System.out.printf("%s %s a substring of %s", secondString, (firstString.contains(secondString)) ? "is" : "isn't", firstString);
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
BDC isn't a substring of ABCD
 */