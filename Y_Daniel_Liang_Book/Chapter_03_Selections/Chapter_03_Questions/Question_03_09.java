/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Suppose x = 2 and y = 3. Show the output, if any, of the following code.
 * What is the output if x = 3 and y = 2?
 * What is the output if x = 3 and y = 3?
 *       if (x > 2)
            if (y > 2) {
                int z = x + y;
                System.out.println("z is " + z);
            } else
                System.out.println("x is " + x);
 * */
//                                                 _Solution_

public class Question_03_09 {
    public static void main(String[] args) {
        int x, y;
        x = 2;
        y = 3;
        System.out.println("Case 1 when x = " + x + " & y = " + y);
        if_else_condition(x, y);
        // no actions
        System.out.println("**********************************");
        x = 3;
        y = 2;
        System.out.println("Case 2 when x = " + x + " & y = " + y);
        if_else_condition(x, y);
        // x = 3;
        System.out.println("**********************************");
        x = 3;
        y = 3;
        System.out.println("Case 3 when x = " + x + " & y = " + y);
        if_else_condition(x, y);
        // z = 3 + 3 = 6;
    }

    public static void if_else_condition(int x, int y) {
        if (x > 2)
            if (y > 2) {
                int z = x + y;
                System.out.println("z is " + z);
            } else
                System.out.println("x is " + x);
    }
}

/*                                                 _Output_
 *
 * */