/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 28/8/2022
 * */

package Chapter_03_Examples;

import java.util.Scanner;

public class Example_03_01 {
    public static void main(String[] args) {
        double area, radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        radius = input.nextDouble();
        if (radius >= 0) {
            area = Math.pow(radius, 2.0) * Math.PI;
            System.out.println("The area for the circle of radius " + radius + " is " + area);
        } else
            System.out.println("Incorrect input");
    }
}

/*                                                 _Output_
 * Enter a number for radius: -5
 * Incorrect input
 * */