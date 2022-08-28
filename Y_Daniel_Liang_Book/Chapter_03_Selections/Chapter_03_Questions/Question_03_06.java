/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 28/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Write an if statement that increases pay by 3% if score is greater than 90, otherwise increases pay by 1%.
 * */
//                                                 _Solution_

import java.util.Scanner;

public class Question_03_06 {
    public static void main(String[] args) {
        double pay;
        int score;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your pay: ");
        pay = input.nextDouble();
        System.out.print("Enter a score: ");
        score = input.nextInt();
        System.out.println("pay before increase is " + pay);
        pay += (score > 90) ? pay * 0.03 : pay * 0.01;
/*        if (score > 90)
            pay += pay * 0.03; // pay = pay + pay * 0.03;
        else
            pay += pay * 0.01; // pay = pay + pay * 0.01;*/
        System.out.println("pay after increase is " + pay);
    }
}

/*                                                 _Output One_
 * Enter your pay: 1000.0
 * Enter a score: 100
 * pay before increase is 1000.0
 * pay after increase is 1030.0
 * */

/*                                                 _Output Two_
 * Enter your pay: 1000.0
 * Enter a score: 70
 * pay before increase is 1000.0
 * pay after increase is 1010.0
 * */