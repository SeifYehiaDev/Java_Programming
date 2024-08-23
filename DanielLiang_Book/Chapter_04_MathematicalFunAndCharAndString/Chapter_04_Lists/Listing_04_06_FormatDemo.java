/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 23/08/2024
 * */

package Chapter_04_Lists;

public class Listing_04_06_FormatDemo {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degree", "Radians", "Sine", "Cosine", "Tangent");
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",
                30, Math.toRadians(30), Math.sin(Math.toRadians(30)), Math.cos(Math.toRadians(30)), Math.tan(Math.toRadians(30)));
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f",
                60, Math.toRadians(60), Math.sin(Math.toRadians(60)), Math.cos(Math.toRadians(60)), Math.tan(Math.toRadians(60)));
    }
}

//                                                 _Output_
/*
Degree    Radians   Sine      Cosine    Tangent
30        0.5236    0.5000    0.8660    0.5774
60        1.0472    0.8660    0.5000    1.7321
 */