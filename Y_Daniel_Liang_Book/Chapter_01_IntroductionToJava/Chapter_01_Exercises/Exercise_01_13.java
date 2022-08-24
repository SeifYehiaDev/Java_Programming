/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_01_Exercises;

/*                                                 _Question_
 * (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
 * ax + by = e =====> x = (ed - bf) / (ad - bc)
 * cx + dy = f =====> y = (af - ec) / (ad - bc)
 * Write a program that solves the following equation and displays the value for x and y:
 * 3.4x + 50.2y = 44.50
 * 2.1x + 0.55y = 5.90
 * */
//                                                 _Solution_
public class Exercise_01_13 {
    public static void main(String[] args) {
        double x, y;
        System.out.println("3.4x + 50.2y = 44.50");
        System.out.println("2.1x + 0.55y = 5.90");
        x = ((44.50 * 0.55 - 5.90 * 50.2) / (3.4 * 0.55 - 50.2 * 2.1));
        y = ((3.4 * 5.90 - 44.50 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1));
        System.out.println("x = " + x + "\ny = " + y);
    }
}

/*                                                 _Output_
 * 3.4x + 50.2y = 44.50
 * 2.1x + 0.55y = 5.90
 * x = 2.623901496861419
 * y = 0.7087397392563978
 * */