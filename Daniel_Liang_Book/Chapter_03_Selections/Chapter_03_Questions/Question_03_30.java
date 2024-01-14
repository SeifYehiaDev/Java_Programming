/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 14/01/2024
 * */

package Chapter_03_Questions;

public class Question_03_30 {
    public static void main(String[] args) {
        int x = 3, y = 3;
        System.out.print("""
                ■ What is y after the following switch statement is executed?
                y = 2
                ■ Rewrite the code using an if-else statement.
                """);
        if (x + 3 == 6)
            y = 1;
        y += 1;
        System.out.print("y = " + y);
    }
}

//                                                 _Output_
/*
■ What is y after the following switch statement is executed?
y = 2
■ Rewrite the code using an if-else statement.
y = 2
 */