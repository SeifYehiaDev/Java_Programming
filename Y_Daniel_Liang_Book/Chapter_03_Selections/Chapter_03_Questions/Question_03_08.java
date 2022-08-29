/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Suppose x = 3 and y = 2; show the output, if any, of the following code.
 * What is the output if x = 3 and y = 4?
 * What is the output if x = 2 and y = 2?
 * Draw a flowchart of the code.
 *   if (x > 2) {
            if (y > 2) {
                z = x + y;
                System.out.println("z is " + z);
            }
        }
        else
            System.out.println("x is " + x);
 * */
//                                                 _Solution_

public class Question_03_08 {
    public static void main(String[] args) {
        System.out.println("Case 1 when x = 3 & y = 2");
        if_else_condition(3, 2);
        // no actions
        System.out.println("**********************************");
        System.out.println("Case 2 when x = 3 & y = 4");
        if_else_condition(3, 4);
        // z = 3 + 4 = 7
        System.out.println("**********************************");
        System.out.println("Case 3 when x = 2 & y = 2");
        if_else_condition(2, 2);
    }

    public static void if_else_condition(int x, int y) {
        int z;
        if (x > 2) {
            if (y > 2) {
                z = x + y;
                System.out.println("z is " + z);
            }
        } else
            System.out.print("x is " + x);
    }
}

/*                                                 _Output_
 * Case 1 when x = 3 & y = 2
 * **********************************
 * Case 2 when x = 3 & y = 4
 * z is 7
 * **********************************
 * Case 3 when x = 2 & y = 2
 * x is 2
 * */