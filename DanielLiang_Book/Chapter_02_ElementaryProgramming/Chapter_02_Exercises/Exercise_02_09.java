/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 27/07/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_09 {
    public static void main(String[] args) {
        double startVelocity, endVelocity, time, acceleration;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");
        startVelocity = input.nextDouble();
        endVelocity = input.nextDouble();
        time = input.nextDouble();
        acceleration = (endVelocity - startVelocity) / time;
        System.out.printf("The average acceleration is %.4f", acceleration);
    }
}

//                                                 _Output_
/*
Enter v0, v1, and t: 5.5 50.9 4.5
The average acceleration is 10.0889
 */