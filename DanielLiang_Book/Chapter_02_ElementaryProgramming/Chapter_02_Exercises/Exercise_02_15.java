/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 27/07/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_15 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, distance;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        distance = Math.sqrt(Math.abs(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0)));
        System.out.printf("The distance between the two points is %.15f", distance);
    }
}

//                                                 _Output_
/*
Enter x1 and y1: 1.5 -3.4
Enter x2 and y2: 4 5
The distance between the two points is 8.764131445842194
 */