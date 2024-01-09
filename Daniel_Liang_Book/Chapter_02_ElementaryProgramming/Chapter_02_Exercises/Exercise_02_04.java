/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 09/01/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_04 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.454D;
        double pounds, kilograms;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        pounds = input.nextDouble();
        kilograms = pounds * KILOGRAMS_PER_POUND;
        System.out.print(pounds + " pounds is " + kilograms + " kilograms");
    }
}

//                                                 _Output_
/*
Enter a number in pounds: 55.5
55.5 pounds is 25.197 kilograms
 */