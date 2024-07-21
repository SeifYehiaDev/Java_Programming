/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 22/07/2024
 * */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_02_ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        double radius, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        radius = input.nextDouble();
        area = Math.PI * Math.pow(radius, 2.0);
        System.out.printf("The area for the circle of radius %.1f is %.7f", radius, area);
    }
}

//                                                 _Output One_
/*
Enter a number for radius: 2.5
The area for the circle of radius 2.5 is 19.6349541
 */

//                                                 _Output Two_
/*
Enter a number for radius: 23
The area for the circle of radius 23.0 is 1661.9025137
 */