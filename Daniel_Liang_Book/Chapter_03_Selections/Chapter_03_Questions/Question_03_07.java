/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 11/01/2024
 * */

package Chapter_03_Questions;

public class Question_03_07 {
    public static void main(String[] args) {
        System.out.println("When the number is equal 30 for code A:");
        codeA(30);
        System.out.println("When the number is equal 30 for code B:");
        codeB(30);
        System.out.println("When the number is equal 35 for code A:");
        codeA(35);
        System.out.println("When the number is equal 35 for code B:");
        codeB(35);
    }

    public static void codeA(int number) {
        if (number % 2 == 0)
            System.out.println(number + " is even.");
        System.out.println(number + " is odd.");
    }

    public static void codeB(int number) {
        if (number % 2 == 0)
            System.out.println(number + " is even.");
        else
            System.out.println(number + " is odd.");
    }

}

//                                                 _Output_
/*
When the number is equal 30 for code A:
30 is even.
30 is odd.
When the number is equal 30 for code B:
30 is even.
When the number is equal 35 for code A:
35 is odd.
When the number is equal 35 for code B:
35 is odd.
 */