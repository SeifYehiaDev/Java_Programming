/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the side of a hexagon and displays its area.
 * The formula for computing the area of a hexagon is
 *                                                        3 * Math.sqrt(3)
 *                                                Area = ------------------- s^2
 *                                                                2
 * where s is the length of a side.
 * Here is a sample run:
 * Enter the side: 5.5
 * The area of the hexagon is 78.5895
 * */
//                                                 _Solution_
public class Exercise_02_16 {
    public static void main(String[] args) {
        double area, side;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        side = input.nextDouble();
        area = 3 * Math.sqrt(3) / 2 * Math.pow(side, 2.0);
        System.out.printf("The area of the hexagon is %.4f", area);
        //System.out.println("The area of the hexagon is " + area);
    }
}

/*                                                 _Output_
 * Enter the side: 5.5
 * The area of the hexagon is 78.5918
 * */