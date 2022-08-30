/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * a. Is (x > 0 && x < 10) the same as ((x > 0) && (x < 10))?
 * b. Is (x > 0 || x < 10) the same as ((x > 0) || (x < 10))?
 * c. Is (x > 0 || x < 10 && y< 0) the same as (x > 0 || (x < 10 && y < 0))?
 * */
//                                                 _Solution_

public class Question_03_40 {
    public static void main(String[] args) {
        int x = 9, y = 10;
        System.out.println("a. Is (x > 0 && x < 10) the same as ((x > 0) && (x < 10))?");
        System.out.println("x = " + x);
        System.out.println("(x > 0 && x < 10) is " + ((x > 0 && x < 10)));
        System.out.println("((x > 0) && (x < 10)) is " + ((x > 0) && (x < 10)));
        System.out.println("They are the same");
        System.out.println();
        System.out.println("b. Is (x > 0 || x < 10) the same as ((x > 0) || (x < 10))?");
        System.out.println("(x > 0 || x < 10) is " + (x > 0 || x < 10));
        System.out.println("((x > 0) || (x < 10)) is " + ((x > 0) || (x < 10)));
        System.out.println("They are the same");
        System.out.println();
        System.out.println("c. Is (x > 0 || x < 10 && y< 0) the same as (x > 0 || (x < 10 && y < 0))?");
        System.out.println("(x > 0 || x < 10 && y< 0) is " + (x > 0 || x < 10 && y < 0));
        System.out.println("(x > 0 || (x < 10 && y < 0)) is " + (x > 0 || (x < 10 && y < 0)));
    }
}

/*                                                 _Output_
 * a. Is (x > 0 && x < 10) the same as ((x > 0) && (x < 10))?
 * x = 9
 * (x > 0 && x < 10) is true
 * ((x > 0) && (x < 10)) is true
 * They are the same
 *
 * b. Is (x > 0 || x < 10) the same as ((x > 0) || (x < 10))?
 * (x > 0 || x < 10) is true
 * ((x > 0) || (x < 10)) is true
 * They are the same
 *
 * c. Is (x > 0 || x < 10 && y< 0) the same as (x > 0 || (x < 10 && y < 0))?
 * (x > 0 || x < 10 && y< 0) is true
 * (x > 0 || (x < 10 && y < 0)) is true
 * */