/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 23/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_02 {
    public static void main(String[] args) {
        final double RADIUS = 6371.01;
        String pointOne, pointTwo;
        double x1, y1, x2, y2, distance;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        pointOne = input.nextLine();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        pointTwo = input.nextLine();
        x1 = Double.parseDouble(pointOne.substring(0, pointOne.indexOf(',')));
        y1 = Double.parseDouble(pointOne.substring(pointOne.indexOf(',') + 2));
        x2 = Double.parseDouble(pointTwo.substring(0, pointTwo.indexOf(',')));
        y2 = Double.parseDouble(pointTwo.substring(pointTwo.indexOf(',') + 2));
        distance = RADIUS * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
        System.out.printf("The distance between the two points is %.11f km", distance);
    }
}

//                                                 _Output_
/*
Enter point 1 (latitude and longitude) in degrees: 39.55, -116.25
Enter point 2 (latitude and longitude) in degrees: 41.5, 87.37
The distance between the two points is 10691.79183231593 km
 */