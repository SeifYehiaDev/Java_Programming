/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 09/01/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_03 {
    public static void main(String[] args) {
        final double METERS_PER_FOOT = 0.305D;
        double feet, meters;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        feet = input.nextDouble();
        meters = feet * METERS_PER_FOOT;
        System.out.print(feet + " feet is " + meters + " meters");
    }
}

//                                                 _Output_
/*
Enter a value for feet: 16.5
16.5 feet is 5.0325 meters
 */