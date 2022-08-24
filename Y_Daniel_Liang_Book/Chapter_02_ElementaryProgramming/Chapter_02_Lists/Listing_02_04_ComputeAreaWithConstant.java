/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_04_ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = Math.PI;
        Scanner input = new Scanner(System.in);
        double radius, area;
        System.out.print("Enter a number for radius >> ");
        radius = input.nextDouble();
        area = Math.pow(radius, 2.0) * PI;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
/*                                                 _Output_
 * Enter a number for radius >> 5
 * The area for the circle of radius 5.0 is 78.53981633974483
 * */