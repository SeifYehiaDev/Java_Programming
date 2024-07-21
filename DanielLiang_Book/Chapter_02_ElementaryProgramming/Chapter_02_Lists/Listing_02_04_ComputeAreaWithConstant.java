/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 22/07/2024
 * */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_04_ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = Math.PI;
        double radius, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for a radius: ");
        radius = input.nextDouble();
        area = PI * Math.pow(radius, 2.0);
        System.out.printf("The area for the circle of radius %.1f is %.7f", radius, area);
    }
}

//                                                 _Output_
/*
Enter a number for a radius: 2.5
The area for the circle of radius 2.5 is 19.6349541
 */