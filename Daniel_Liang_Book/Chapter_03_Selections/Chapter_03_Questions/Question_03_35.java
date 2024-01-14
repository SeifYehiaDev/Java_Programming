/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 14/01/2024
 * */

package Chapter_03_Questions;

public class Question_03_35 {
    public static void main(String[] args) {
        double tax = 20, income = 100;
        System.out.print("""
                ■ Rewrite the following if statements using the conditional operator.
                a. score = (x > 10) ? 3 * scale : 4 * scale;
                      if (x > 10)
                            score *= 3;
                        else
                            score *= 4;
                b. tax = (income > 10000) ? income * 0.2 : income * 0.17 + 1000;
                        if (income > 10000)
                            tax = income * 0.2;
                        else
                            tax = income * 0.17 + 1000;
                c. System.out.println((number % 3 == 0) ? i : j);
                        if (number % 3 == 0)
                            System.out.println(i);
                        else
                            System.out.println(j);""");
    }
}

//                                                 _Output_
/*
■ Rewrite the following if statements using the conditional operator.
a. score = (x > 10) ? 3 * scale : 4 * scale;
      if (x > 10)
            score *= 3;
        else
            score *= 4;
b. tax = (income > 10000) ? income * 0.2 : income * 0.17 + 1000;
        if (income > 10000)
            tax = income * 0.2;
        else
            tax = income * 0.17 + 1000;
c. System.out.println((number % 3 == 0) ? i : j);
        if (number % 3 == 0)
            System.out.println(i);
        else
            System.out.println(j);
 */