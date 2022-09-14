/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 14/9/2022
 * */

package Chapter_03_Exercises;

//                                                 _Question_
                        /*(Random point) Write a program that displays a random coordinate in a rectangle.
                        The rectangle is centered at (0, 0) with width 100 and height 200.*/
//                                                 _Solution_
public class Exercise_03_16 {
    public static void main(String[] args) {
        int width, height;
        width = (int) (Math.random() * 100 - 50);
        height = (int) (Math.random() * 200 - 100);
        System.out.println("Random coordinate in rectangle centered at (0,0)");
        System.out.println("with width 100 and height 200: (" + width + ", " + height + ")");
    }
}

/*                                                 _Output_
 * Random coordinate in rectangle centered at (0,0)
 * with width 100 and height 200: (-13, 6)
 * */