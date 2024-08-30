/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_34 {
    public static void main(String[] args) {
        double x0, y0, x1, y1, x2, y2;
        boolean online;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        x0 = input.nextDouble();
        y0 = input.nextDouble();
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        online = !(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0 || ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 0 || (x2 < x0) || (y2 < y0) || (x2 > x1) || (y2 > y1));
        System.out.printf("(%.1f, %.1f) %s on the line segment from (%.1f, %.1f) to (%.1f, %.1f)", x2, y2, (online) ? "is" : "isn't", x0, y0, x1, y1);
    }
}

//                                                 _Output One_
/*
Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5
(1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.5, 2.5)
 */

//                                                 _Output Two_
/*
Enter three points for p0, p1, and p2: 1 1 2 2 3.5 3.5
(3.5, 3.5) isn't on the line segment from (1.0, 1.0) to (2.0, 2.0)
 */