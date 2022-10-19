/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 19/10/2022
 * */

package Chapter_04_Lists;

public class Listing_04_06_FormatDemo {
    public static void main(String[] args) {
        int degree;
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");
        degree = 30;
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degree, Math.toRadians(degree), Math.sin(Math.toRadians(degree)), Math.cos(Math.toRadians(degree)), Math.tan(Math.toRadians(degree)));
        degree = 60;
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degree, Math.toRadians(degree), Math.sin(Math.toRadians(degree)), Math.cos(Math.toRadians(degree)), Math.tan(Math.toRadians(degree)));
    }
}

//                                                 _Output_
/*
Degrees   Radians   Sine      Cosine    Tangent
30        0.5236    0.5000    0.8660    0.5774
60        1.0472    0.8660    0.5000    1.7321
 */