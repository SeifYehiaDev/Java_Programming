/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 25/07/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_04 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.454;
        double pounds, kilograms;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        pounds = input.nextDouble();
        kilograms = pounds * KILOGRAMS_PER_POUND;
        System.out.printf("%.1f pounds is %.3f kilograms", pounds, kilograms);
    }

}

//                                                 _Output_
/*
Enter a number in pounds: 55.5
55.5 pounds is 25.197 kilograms
 */