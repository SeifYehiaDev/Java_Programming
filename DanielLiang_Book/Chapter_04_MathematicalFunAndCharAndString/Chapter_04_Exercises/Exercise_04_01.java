/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 23/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_01 {
    public static void main(String[] args) {
        double r, s, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        r = input.nextDouble();
        s = 2 * r * Math.sin(Math.PI / 5);
        area = (5 * Math.pow(s, 2.0)) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("The area of the pentagon is %.2f", area);
    }
}

//                                                 _Output_
/*
Enter the length from the center to a vertex: 5.5
The area of the pentagon is 71.92
 */