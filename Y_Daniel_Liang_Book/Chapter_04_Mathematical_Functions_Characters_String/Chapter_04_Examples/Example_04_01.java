/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 14/10/2022
 * */

package Chapter_04_Examples;

public class Example_04_01 {
    public static void main(String[] args) {
        /*
         * Math.sin(radians) || Math.cos(radians) || Math.tan(radians)
         * degree = Math.toDegrees(radians) || radians = Math.toRadians(Degrees)
         * AngleInRadians = asin(AngleInDegree) || acos(AngleInDegree) || atan(AngleInDegree) ====> sin || cos || tan Inverse
         * From degree to radians ====> * (PI / 180)
         * From radians to degree ====> / (PI / 180)
         * */
        System.out.println("Math.toDegrees(Math.PI / 2) = " + Math.toDegrees(Math.PI / 2));
        System.out.println("Math.toRadians(30) = " + Math.toRadians(30));
        System.out.println("Math.sin(0) = " + Math.sin(0));
        System.out.println("Math.sin(Math.toRadians(270)) = " + Math.sin(Math.toRadians(270)));
        System.out.println("Math.sin(Math.PI / 6) = " + Math.sin(Math.PI / 6));
        System.out.println("Math.sin(Math.PI / 2) = " + Math.sin(Math.PI / 2));
        System.out.println("Math.cos(0) = " + Math.cos(0));
        System.out.println("Math.cos(Math.PI / 6) = " + Math.cos(Math.PI / 6));
        System.out.println("Math.cos(Math.PI / 2) = " + Math.cos(Math.PI / 2));
        System.out.println("Math.asin(0.5) = " + Math.asin(0.5));
        System.out.println("Math.acos(0.5) = " + Math.acos(0.5));
        System.out.println("Math.atan(1.0) = " + Math.atan(1.0));
        System.out.println("Math.toDegrees(Math.asin(90)) = " + Math.toDegrees(Math.asin(1)));
    }
}

//                                                 _Output_
/*
Math.toDegrees(Math.PI / 2) = 90.0
Math.toRadians(30) = 0.5235987755982988
Math.sin(0) = 0.0
Math.sin(Math.toRadians(270)) = -1.0
Math.sin(Math.PI / 6) = 0.49999999999999994
Math.sin(Math.PI / 2) = 1.0
Math.cos(0) = 1.0
Math.cos(Math.PI / 6) = 0.8660254037844387
Math.cos(Math.PI / 2) = 6.123233995736766E-17
Math.asin(0.5) = 0.5235987755982989
Math.acos(0.5) = 1.0471975511965979
Math.atan(1.0) = 0.7853981633974483
Math.toDegrees(Math.asin(90)) = 90.0
*/