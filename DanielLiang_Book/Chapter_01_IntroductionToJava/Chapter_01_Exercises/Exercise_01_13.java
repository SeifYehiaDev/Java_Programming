/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 21/07/2024
 * */

package Chapter_01_Exercises;

public class Exercise_01_13 {
    public static void main(String[] args) {
        final double a = 3.4, b = 50.2, e = 44.5, c = 2.1, d = 0.55, f = 5.9;
        double x, y, determinant = a * d - b * c;
        if (determinant == 0)
            System.out.print("The system of equations has either infinitely many solutions or no solution.");
        else {
            x = (e * d - b * f) / determinant;
            y = (a * f - e * c) / determinant;
            System.out.printf("""
                    The solution for x is: %.15f
                    The solution for y is: %.16f""", x, y);
        }
    }
}

//                                                 _Output_
/*
The solution for x is: 2.623901496861419
The solution for y is: 0.7087397392563978
 */