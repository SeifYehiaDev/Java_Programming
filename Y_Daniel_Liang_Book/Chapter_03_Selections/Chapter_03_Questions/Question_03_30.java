/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * What is y after the following switch statement is executed?
 * Rewrite the code using an if-else statement.
 * */
//                                                 _Solution_

public class Question_03_30 {
    public static void main(String[] args) {
        int x = 3, y = 3;
        System.out.println("x = " + x + " & y = " + y);
        switch (x + 3) {
            case 6:
                y = 1;
            default:
                y += 1;
        }
        System.out.println("y = " + y);
        // Rewrite the code using an if-else statement.
        x = 3;
        y = 3;
        System.out.println("Rewrite the code using an if-else statement.");
        System.out.println("x = " + x + " & y = " + y);
        if (x + 3 == 6)
            y = 1;
        if (y == 1)
            y += 1;
        System.out.println("y = " + y);
    }
}

/*                                                 _Output_
 * x = 3 & y = 3
 * y = 2
 * Rewrite the code using an if-else statement.
 * x = 3 & y = 3
 * y = 2
 * */