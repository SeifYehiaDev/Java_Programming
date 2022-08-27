/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Compute the volume of a cylinder) Write a program that reads in the radius and length of a cylinder
 * and computes the area and volume using the following formulas:
 * area = radius * radius * pi
 * volume = area * length
 * Here is a sample run:
 * Enter the radius and length of a cylinder: 5.5 12
 * The area is 95.0331
 * The volume is 1140.4
 * */
//                                                 _Solution_
public class Exercise_02_02 {
    public static void main(String[] args) {
        double radius, length, area, volume;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        radius = input.nextDouble();
        length = input.nextDouble();
        area = Math.pow(radius, 2.0) * Math.PI;
        volume = area * length;
        System.out.println("The area is " + (float) area + "\nThe volume is " + (float) volume);
        // System.out.printf("The area is %.4f\nThe volume is %.1f\n",area,volume);
    }
}

/*                                                 _Output_
 * Enter the radius and length of a cylinder: 5.5 12
 * The area is 95.03318
 * The volume is 1140.3982
 * */