/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Rewrite the following conditional expressions using if-else statements.
 * a. score = (x > 10) ? 3 * scale : 4 * scale;
 * b. tax = (income > 10000) ? income * 0.2 : income * 0.17 + 1000;
 * c. System.out.println((number % 3 == 0) ? i : j);
 * */
//                                                 _Solution_

public class Question_03_35 {
    public static void main(String[] args) {
        int score, x = 12, scale = 2, number = 15, i = 5, j = 6;
        double income = 9_000.0, tax;
        System.out.println("a. score = (x > 10) ? 3 * scale : 4 * scale;");
        System.out.println("x = " + x + " & scale = " + scale);
        if (x > 10)
            score = 3 * scale;
        else
            score = 4 * scale;
        System.out.println("score = " + score);
        System.out.println("b. tax = (income > 10000) ? income * 0.2 : income * 0.17 + 1000;");
        if (income > 10_000)
            tax = income * 0.2;
        else
            tax = income * 0.17 + 1000;
        System.out.println("tax = " + tax);
        System.out.println("c. System.out.println((number % 3 == 0) ? i : j);");
        if (number % 3 == 0)
            System.out.println(i);
        else
            System.out.println(j);
    }
}

/*                                                 _Output_
 * a. score = (x > 10) ? 3 * scale : 4 * scale;
 * x = 12 & scale = 2
 * score = 6
 * b. tax = (income > 10000) ? income * 0.2 : income * 0.17 + 1000;
 * tax = 2530.0
 * c. System.out.println((number % 3 == 0) ? i : j);
 * 5
 * */