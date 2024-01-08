/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 08/01/2024
 * */

package Chapter_02_Questions;

public class Question_02_03 {
    public static void main(String[] args) {
        System.out.print("""
                Are there any performance differences between the following two import statements?
                1- import java.util.Scanner; (specific import)
                2- import java.util.*; (wildcard import)
                ****************************** Answer ******************************
                Yes there are performance differences
                * The specific import specifies a single class in the import statement.
                * The wildcard import imports all the classes in a package by using the asterisk as the wildcard.
                """);
    }
}

//                                                 _Output_
/*
Are there any performance differences between the following two import statements?
1- import java.util.Scanner; (specific import)
2- import java.util.*; (wildcard import)
****************************** Answer ******************************
Yes there are performance differences
* The specific import specifies a single class in the import statement.
* The wildcard import imports all the classes in a package by using the asterisk as the wildcard.
 */