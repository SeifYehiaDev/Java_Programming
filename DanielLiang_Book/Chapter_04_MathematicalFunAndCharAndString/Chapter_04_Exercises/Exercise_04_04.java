/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 23/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_04 {
    public static void main(String[] args) {
        double side, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        side = input.nextDouble();
        area = (6 * Math.pow(side, 2.0)) / (4 * Math.tan(Math.PI / 6));
        System.out.printf("The area of the hexagon is %.2f", area);
    }
}

//                                                 _Output_
/*
Enter the side: 5.5
The area of the hexagon is 78.59
 */