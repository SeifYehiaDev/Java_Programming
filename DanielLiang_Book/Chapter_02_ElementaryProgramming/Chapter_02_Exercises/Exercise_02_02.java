/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 25/07/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_02 {
    public static void main(String[] args) {
        double radius, length, area, volume;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        radius = input.nextDouble();
        length = input.nextDouble();
        area = Math.pow(radius, 2.0) * Math.PI;
        volume = area * length;
        System.out.printf("""
                The area is %.4f
                The volume is %.1f""", area, volume);
    }
}

//                                                 _Output_
/*
Enter the radius and length of a cylinder: 5.5 12
The area is 95.0332
The volume is 1140.4
 */