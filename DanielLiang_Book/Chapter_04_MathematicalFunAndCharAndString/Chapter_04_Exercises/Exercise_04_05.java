/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 23/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_05 {
    public static void main(String[] args) {
        int numberOfSides;
        double side, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        numberOfSides = input.nextInt();
        System.out.print("Enter the side: ");
        side = input.nextDouble();
        area = (numberOfSides * Math.pow(side, 2.0)) / (4 * Math.tan(Math.PI / numberOfSides));
        System.out.printf("The area of the polygon is %.14f", area);
    }
}

//                                                 _Output_
/*
Enter the number of sides: 5
Enter the side: 6.5
The area of the polygon is 72.69017017488385
 */