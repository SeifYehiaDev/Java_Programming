/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * What is wrong in the following code?
 *         if (score >= 60.0)
            System.out.println("D");
        else if (score >= 70.0)
            System.out.println("C");
        else if (score >= 80.0)
            System.out.println("B");
        else if (score >= 90.0)
            System.out.println("A");
        else
            System.out.println("F");
 * */
//                                                 _Solution_

public class Question_03_10 {
    public static void main(String[] args) {
        /*
         * What is wrong in the following code?
         * They must be arranged from large to small
         * */
        int score = 100;
        System.out.println("Your score is " + score);
        findYourScore(score);
        System.out.println("******************************");
        score = 90;
        System.out.println("Your score is " + score);
        findYourScore(score);
        System.out.println("******************************");
        score = 80;
        System.out.println("Your score is " + score);
        findYourScore(score);
        System.out.println("******************************");
        score = 70;
        System.out.println("Your score is " + score);
        findYourScore(score);
        System.out.println("******************************");
        score = 60;
        System.out.println("Your score is " + score);
        findYourScore(score);
        System.out.println("******************************");
        score = 50;
        System.out.println("Your score is " + score);
        findYourScore(score);
        System.out.println("******************************");
        score = 0;
        System.out.println("Your score is " + score);
        findYourScore(score);
        System.out.println("******************************");
        score = 1000;
        System.out.println("Your score is " + score);
        findYourScore(score);
        System.out.println("******************************");
        score = -1000;
        System.out.println("Your score is " + score);
        findYourScore(score);
    }

    public static void findYourScore(int score) {
        if (score >= 0.0 && score <= 100.0) {
            if (score <= 60.0)
                System.out.println("D");
            else if (score <= 70.0)
                System.out.println("C");
            else if (score <= 80.0)
                System.out.println("B");
            else if (score <= 90.0 || score <= 100.0)
                System.out.println("A");
            else
                System.out.println("F");
        } else
            System.out.println("Your score should be between 0 and 100");
    }
}

/*                                                 _Output_
 * Your score is 100
 * A
 * ******************************
 * Your score is 90
 * A
 * ******************************
 * Your score is 80
 * B
 * ******************************
 * Your score is 70
 * C
 * ******************************
 * Your score is 60
 * D
 * ******************************
 * Your score is 50
 * F
 * ******************************
 * Your score is 0
 * F
 * ******************************
 * Your score is 1000
 * Your score should be between 0 and 100
 * ******************************
 * Your score is -1000
 * Your score should be between 0 and 100
 * */