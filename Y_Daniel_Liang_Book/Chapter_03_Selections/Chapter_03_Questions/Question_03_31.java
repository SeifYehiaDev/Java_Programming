/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * What is x after the following if-else statement is executed?
 * Use a switch statement to rewrite it and draw the flowchart for the new switch statement.
 * */
//                                                 _Solution_

public class Question_03_31 {
    public static void main(String[] args) {
        int x = 1, a = 3;
        System.out.println("x = " + x + " & a = " + a);
        if (a == 1)
            x += 5;
        else if (a == 2)
            x += 10;
        else if (a == 3)
            x += 16;
        else if (a == 4)
            x += 34;
        System.out.println("x = " + x);
        System.out.println("Use a switch statement to rewrite it and draw the flowchart for the new switch statement.");
        x = 1;
        a = 3;
        System.out.println("x = " + x + " & a = " + a);
        switch (a) {
            case 1:
                x += 5;
                break;
            case 2:
                x += 10;
                break;
            case 3:
                x += 16;
                break;
            case 4:
                x += 34;
        }
        System.out.println("x = " + x);
    }
}

/*                                                 _Output_
 * x = 1 & a = 3
 * x = 17
 * Use a switch statement to rewrite it and draw the flowchart for the new switch statement.
 * x = 1 & a = 3
 * x = 17
 * */