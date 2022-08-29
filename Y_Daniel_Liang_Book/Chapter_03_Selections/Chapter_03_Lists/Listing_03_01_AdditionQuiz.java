/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 28/8/2022
 * */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_01_AdditionQuiz {
    public static void main(String[] args) {
        int numberOne, numberTwo, answer;
        Scanner input = new Scanner(System.in);
        numberOne = (int) (System.currentTimeMillis() % 10); // generate random numbers
        numberTwo = (int) (System.currentTimeMillis() / 7 % 10); // generate random numbers
        System.out.println("What is " + numberOne + " + " + numberTwo + "?");
        answer = input.nextInt();
        System.out.println(numberOne + " + " + numberTwo + " = " + answer + " is " + (numberOne + numberTwo == answer));
    }
}

/*                                                 _Output_
 * What is 3 + 6?
 * 9
 * 3 + 6 = 9 is true
 * */