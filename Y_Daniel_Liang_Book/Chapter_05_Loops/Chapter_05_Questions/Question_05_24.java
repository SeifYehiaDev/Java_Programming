/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/12/2022
 * */

package Chapter_05_Questions;

//                                                 _Question_
/*What is the keyword break for? What is the keyword continue for? Will the following programs terminate? If so, give the output.*/
//                                                 _Solution_
public class Question_05_24 {
    public static void main(String[] args) {
        System.out.println("What is the keyword break for?");
        System.out.println("The keywords break using in switch and loop , break keyword breaks out of a loop");
        System.out.println();
        System.out.println("What is the keyword continue for?");
        System.out.println("The continue statement is always inside a loop. In the while and do-while loops, " +
                "the loop-continuation-condition is evaluated immediately after the continue statement.");
        System.out.println();
        System.out.println("Program (A)");
        int balance = 10;
        while (true) {
            if (balance < 9) break;
            balance = balance - 9;
        }
        System.out.println("Balance is " + balance); // Balance is 1
        System.out.println();
        System.out.println("Program (B)");
/*        balance = 10;
        while (true) {
            if (balance < 9) continue;
            balance = balance - 9;
        }
        System.out.println("Balance is " + balance);*/
        System.out.println("Infinite loop");
    }
}

//                                                 _Output_
/*
What is the keyword break for?
The keywords break using in switch and loop , break keyword breaks out of a loop

What is the keyword continue for?
The continue statement is always inside a loop. In the while and do-while loops, the loop-continuation-condition is evaluated immediately after the continue statement.

Program (A)
Balance is 1

Program (B)
Infinite loop
 */