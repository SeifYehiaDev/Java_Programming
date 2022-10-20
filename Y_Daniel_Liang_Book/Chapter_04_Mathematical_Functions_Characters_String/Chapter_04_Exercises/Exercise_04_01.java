/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 20/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

//                                                 _Question_
                    /*(Geometry: area of a pentagon) Write a program that prompts the user to enter
                    the length from the center of a pentagon to a vertex and computes the area of the
                    pentagon, as shown in the following figure.*/
//                                                 _Solution_
public class Exercise_04_01 {
    public static void main(String[] args) {
        double area, radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        radius = input.nextDouble();
        area = (5 * Math.pow(2 * radius * Math.sin(Math.PI / 5), 2.0)) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("The area of the pentagon is %.2f\n", area);
//      System.out.println("The area of the pentagon is " + (Math.round(area * 100) / 100.0));
//      System.out.println("The area of the pentagon is ".concat(String.valueOf(Math.round(area * 100) / 100.0)));
    }
}

//                                                 _Output_
/*
Enter the length from the center to a vertex: 5.5
The area of the pentagon is 71.92
 */