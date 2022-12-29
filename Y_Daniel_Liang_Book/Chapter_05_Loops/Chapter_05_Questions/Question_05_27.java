/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/12/2022
 * */

package Chapter_05_Questions;

//                                                 _Question_
                /*After the break statement in (a) is executed in the following loop, which statement
                is executed? Show the output.After the continue statement in (b) is executed in the
                following loop, which statement is executed? Show the output.*/
//                                                 _Solution_
public class Question_05_27 {
    public static void main(String[] args) {
        System.out.println("Program (A)");
        System.out.println("After the break statement in (a) is executed in the following loop , which statement is executed?");
        System.out.println("-> System.out.println(i);");
        System.out.println("Show the output");
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i * j > 2) break;
                System.out.println(i * j);
            }
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Program (B)");
        System.out.println("After the continue statement in (b) is executed in the following loop, which statement is executed?");
        System.out.println("-> j++");
        System.out.println("Show the output");
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i * j > 2) continue;
                System.out.println(i * j);
            }
            System.out.println(i);
        }
    }
}

//                                                 _Output_
/*
Program (A)
After the break statement in (a) is executed in the following loop , which statement is executed?
-> System.out.println(i);
Show the output
1
2
1
2
2
3

Program (B)
After the continue statement in (b) is executed in the following loop, which statement is executed?
-> j++
Show the output
1
2
1
2
2
3
 */