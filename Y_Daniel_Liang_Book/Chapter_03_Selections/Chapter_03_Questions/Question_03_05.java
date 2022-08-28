/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 28/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Write an if statement that increases pay by 3% if score is greater than 90.
 * */
//                                                 _Solution_

public class Question_03_05 {
    public static void main(String[] args) {
        double pay = 1500.6;
        int score = 100;
        System.out.println("Before if condition pay = " + pay);
        System.out.println("Your Score is " + score + " , it's greater than (>) 90");
        if (score > 90)
            pay += pay * 0.03;
        System.out.println("After if condition pay = " + pay);
    }
}

/*                                                 _Output_
 * Before if condition pay = 1500.6
 * Your Score is 100 , it's greater than (>) 90
 * After if condition pay = 1545.618
 * */