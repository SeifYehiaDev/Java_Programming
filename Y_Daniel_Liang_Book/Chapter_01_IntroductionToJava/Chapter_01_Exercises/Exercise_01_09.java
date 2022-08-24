/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_01_Exercises;

/*                                                 _Question_
 * (Area and perimeter of a rectangle) Write a program that displays the area and
 * perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following
 * formula:
 * area = width x height
 * */
//                                                 _Solution_
public class Exercise_01_09 {
    public static void main(String[] args) {
        float width = 4.5F, height = 7.9F;
        System.out.println("Perimeter of a rectangle is " + (width + height) * 2);
        System.out.println("Area of a rectangle is " + width * height);
    }
}
/*                                                 _Output_
 * Perimeter of a rectangle is 24.8
 * Area of a rectangle is 35.55
 * */