/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Convert pounds into kilograms) Write a program that converts pounds into kilograms,
 * The program prompts the user to enter a number in pounds, converts it to kilograms and displays the result.
 * One pound is 0.454 kilograms.
 * Here is a sample run:
 * Enter a number in pounds: 55.5
 * 55.5 pounds is 25.197 kilograms
 * */
//                                                 _Solution_
public class Exercise_02_04 {
    public static void main(String[] args) {
        final float POUND_KILOGRAMS = 0.454F;
        float pounds, kilograms;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        pounds = input.nextFloat();
        kilograms = pounds * POUND_KILOGRAMS ;
        System.out.println(pounds+" pounds is "+kilograms+" kilograms");
    }
}

/*                                                 _Output_
 * Enter a number in pounds: 55.5
 * 55.5 pounds is 25.197 kilograms
 * */