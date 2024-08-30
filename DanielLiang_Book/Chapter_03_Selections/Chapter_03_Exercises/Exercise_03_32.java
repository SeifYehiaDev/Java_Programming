/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_32 {
    public static void main(String[] args) {
        double x0, y0, x1, y1, x2, y2, position;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        x0 = input.nextDouble();
        y0 = input.nextDouble();
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        System.out.printf("(%.1f, %.1f) is on the %sline from (%.1f, %.1f) to (%.1f, %.1f)",
                x2, y2, (position == 0) ? "" : (position > 0) ? "left side of the " : "right side of the ", x0, y0, x1, y1);
    }
}

//                                                 _Output One_
/*
Enter three points for p0, p1, and p2: 4.4 2 6.5 9.5 -5 4
(-5.0, 4.0) is on the left side of the line from (4.4, 2.0) to (6.5, 9.5)
 */

//                                                 _Output Two_
/*
Enter three points for p0, p1, and p2: 1 1 5 5 2 2
(2.0, 2.0) is on the line from (1.0, 1.0) to (5.0, 5.0)
 */

//                                                 _Output Three_
/*
Enter three points for p0, p1, and p2: 3.4 2 6.5 9.5 5 2.5
(5.0, 2.5) is on the right side of the line from (3.4, 2.0) to (6.5, 9.5)
 */