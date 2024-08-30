/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_28 {
    public static void main(String[] args) {
        double r1x, r1y, r1Width, r1Height, r2x, r2y, r2Width, r2Height;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width and height: ");
        r1x = input.nextDouble();
        r1y = input.nextDouble();
        r1Width = input.nextDouble();
        r1Height = input.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates, width and height: ");
        r2x = input.nextDouble();
        r2y = input.nextDouble();
        r2Width = input.nextDouble();
        r2Height = input.nextDouble();
        if ((Math.sqrt(Math.pow(r2y - r1y, 2)) + r2Height / 2 <= r1Height / 2) &&
                (Math.sqrt(Math.pow(r2x - r1x, 2)) + r2Width / 2 <= r1Width / 2) &&
                (r1Height / 2 + r2Height / 2 <= r1Height) &&
                (r1Width / 2 + r2Width / 2 <= r1Width))
            System.out.print("r2 is inside r1");
        else if ((r1x + r1Width / 2 > r2x - r2Width) || (r1y + r1Height / 2 > r2y - r2Height))
            System.out.print("r2 overlaps r1");
        else
            System.out.print("r2 does not overlap r1");
    }
}

//                                                 _Output One_
/*
Enter r1's center x-, y-coordinates, width and height: 2.5 4 2.5 43
Enter r2's center x-, y-coordinates, width and height: 1.5 5 0.5 3
r2 is inside r1
 */

//                                                 _Output Two_
/*
Enter r1's center x-, y-coordinates, width and height: 1 2 3 5.5
Enter r2's center x-, y-coordinates, width and height: 3 4 4.5 5
r2 overlaps r1
 */

//                                                 _Output three_
/*
Enter r1's center x-, y-coordinates, width and height: 1 2 3 3
Enter r2's center x-, y-coordinates, width and height: 40 45 3 2
r2 does not overlap r1
 */