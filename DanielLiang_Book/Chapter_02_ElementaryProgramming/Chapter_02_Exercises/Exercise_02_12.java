/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 27/07/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_12 {
    public static void main(String[] args) {
        double speed, acceleration, length;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        speed = input.nextDouble();
        acceleration = input.nextDouble();
        length = Math.pow(speed, 2.0) / (2 * acceleration);
        System.out.printf("The minimum runway length for this airplane is %.3f", length);
    }
}

//                                                 _Output_
/*
Enter speed and acceleration: 60 3.5
The minimum runway length for this airplane is 514.286
 */