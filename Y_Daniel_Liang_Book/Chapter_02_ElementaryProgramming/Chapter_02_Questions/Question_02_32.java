/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 26/8/2022
 * */

package Chapter_02_Questions;


/*                                                 _Question_
 * How would you write the following arithmetic expression?
 * show expression at the book page number 63
 * */
//                                                 _Solution_
public class Question_02_32 {
    public static void main(String[] args) {
        int a = 5, b = 200, c = 10;
        double x = (-b + Math.pow((Math.pow(b, 2.0) - 4 * a * c), 0.5)) / (2 * a);
        System.out.println("x = " + x);
    }
}

/*                                                 _Output_
 * x = -0.050062656739996214
 * */