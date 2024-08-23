/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 24/08/2024
 * */

package Chapter_04_Exercises;

public class Exercise_04_06 {
    public static void main(String[] args) {
        final double RADIUS = 40;
        double firstAngle, secondAngle, thirdAngle, x1, y1, x2, y2, x3, y3, a, b, c, angleA, angleB, angleC;
        firstAngle = (Math.random() * (2 * Math.PI));
        secondAngle = (Math.random() * (2 * Math.PI));
        thirdAngle = (Math.random() * (2 * Math.PI));
        x1 = RADIUS * Math.cos(firstAngle);
        y1 = RADIUS * Math.sin(firstAngle);
        x2 = RADIUS * Math.cos(secondAngle);
        y2 = RADIUS * Math.sin(secondAngle);
        x3 = RADIUS * Math.cos(thirdAngle);
        y3 = RADIUS * Math.sin(thirdAngle);
        a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        angleA = Math.toDegrees(Math.acos((Math.pow(a, 2) - Math.pow(b, 2) - Math.pow(c, 2)) / (-2 * b * c)));
        angleB = Math.toDegrees(Math.acos((Math.pow(b, 2) - Math.pow(a, 2) - Math.pow(c, 2)) / (-2 * a * c)));
        angleC = Math.toDegrees(Math.acos((Math.pow(c, 2) - Math.pow(b, 2) - Math.pow(a, 2)) / (-2 * a * b)));
        System.out.printf("The three angles are %.2f %.2f %.2f", angleA, angleB, angleC);
    }
}

//                                                 _Output_
/*
The three angles are 76.39 71.06 32.55
 */