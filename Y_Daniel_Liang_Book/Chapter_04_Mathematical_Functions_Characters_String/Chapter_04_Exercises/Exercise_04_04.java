/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 20/10/2022
 * */

package Chapter_04_Exercises;


import java.util.Scanner;

//                                                 _Question_
                    /*(Geometry: area of a hexagon) The area of a hexagon can be computed using the
                    following formula (s is the length of a side):
                    Write a program that prompts the user to enter the side of a hexagon and displays its area.*/
//                                                 _Solution_
public class Exercise_04_04 {
    public static void main(String[] args) {
        double areaOfHexagon;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        areaOfHexagon = (6 * Math.pow(input.nextDouble(), 2.0)) / (4 * Math.tan(Math.PI / 6));
        System.out.printf("The area of the hexagon is %.2f\n", areaOfHexagon);
//      System.out.println("The area of the hexagon is " + Math.round(areaOfHexagon * 100) / 100.0);

    }
}

//                                                 _Output_
/*
Enter the side: 5.5
The area of the hexagon is 78.59
 */