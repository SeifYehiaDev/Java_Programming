/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Suppose that, when you run the following program, you enter the input 2 3 6 from the console. What is the output?
 * */
//                                                 _Solution_

public class Question_03_33 {
    public static void main(String[] args) {
        double x, y, z;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter three integer values: ");
        x = input.nextDouble();
        y = input.nextDouble();
        z = input.nextDouble();
        System.out.println((x < y && y < z) ? "sorted" : "not sorted");
    }
}

/*                                                 _Output_
 * Enter three integer values: 2 3 6
 * sorted
 * */