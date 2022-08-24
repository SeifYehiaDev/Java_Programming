/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_02_ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        double area, radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        radius = input.nextDouble();
        area = Math.pow(radius, 2.0) * Math.PI;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
/*                                                 _Output_
 * Enter a number for radius: 2.5
 * The area for the circle of radius 2.5 is 19.634954084936208
 * */