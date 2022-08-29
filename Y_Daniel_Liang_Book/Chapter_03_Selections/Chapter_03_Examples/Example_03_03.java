/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/8/2022
 * */

package Chapter_03_Examples;

public class Example_03_03 {
    public static void main(String[] args) {
        double radius = -5, area;
        System.out.println("The radius is "+ radius);
        if (radius >= 0);{
            area = Math.pow(radius, 2.0) * Math.PI;
            System.out.println("area = " + area);
        }
    }
}

/*                                                 _Output_
 * The radius is -5.0
 * area = 78.53981633974483
 * */