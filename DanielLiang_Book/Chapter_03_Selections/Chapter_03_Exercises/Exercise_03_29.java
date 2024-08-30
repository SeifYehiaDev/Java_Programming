/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_29 {
    public static void main(String[] args) {
        double x1,y1,r1,x2,y2,r2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
         x1 = input.nextDouble();
         y1 = input.nextDouble();
         r1 = input.nextDouble();
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
         x2 = input.nextDouble();
         y2 = input.nextDouble();
         r2 = input.nextDouble();
        if (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) <= Math.abs(r1 - r2))
            System.out.print("circle2 is inside circle1");
        else if (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) <= r1 + r2)
            System.out.print("circle2 overlaps circle1");
        else
            System.out.print("circle2 does not overlap circle1");
    }
}

//                                                 _Output One_
/*
Enter circle1's center x-, y-coordinates, and radius: 0.5 5.1 13
Enter circle2's center x-, y-coordinates, and radius: 1 1.7 4.5
circle2 is inside circle1
 */

//                                                 _Output Two_
/*
Enter circle1's center x-, y-coordinates, and radius: 3.4 5.7 5.5
Enter circle2's center x-, y-coordinates, and radius: 6.7 3.5 3
circle2 overlaps circle1
 */

//                                                 _Output Three_
/*
Enter circle1's center x-, y-coordinates, and radius: 3.4 5.5 1
Enter circle2's center x-, y-coordinates, and radius: 5.5 7.2 1
circle2 does not overlap circle1
 */