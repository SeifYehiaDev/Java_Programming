/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_01_Exercises;

/*                                                 _Question_
 * (Area and perimeter of a circle) Write a program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formula:
 * perimeter = 2 * radius * pi
 * area = radius * radius * pi
 * */
//                                                 _Solution_
public class Exercise_01_08 {
    public static void main(String[] args) {
        float radius = 5.5F, perimeter, area;
        System.out.println("Perimeter of a circle is " + (2 * radius * Math.PI));
        System.out.println("Area of a circle is " + (Math.pow(radius, 2.0) * Math.PI));
    }
}
/*                                                 _Output_
 * Perimeter of a circle is 34.55751918948772
 * Area of a circle is 95.03317777109125
 * */