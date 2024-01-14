/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 14/01/2024
 * */

package Chapter_03_Questions;

public class Question_03_31 {
    public static void main(String[] args) {
        int x = 1, a = 3;
        System.out.print("""
                ■ What is x after the following if-else statement is executed?
                x = 17
                ■ Use a switch statement to rewrite it.
                """);
        switch (a) {
            case 1: x += 5;break;
            case 2: x += 10;break;
            case 3: x += 16;break;
            case 4: x += 34;
        }
        System.out.print("x = " + x);
    }
}

//                                                 _Output_
/*
■ What is x after the following if-else statement is executed?
x = 17
■ Use a switch statement to rewrite it.
x = 17
 */