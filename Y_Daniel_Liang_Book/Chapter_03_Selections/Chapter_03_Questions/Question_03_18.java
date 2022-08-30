/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Assuming that x is 1, show the result of the following Boolean expressions
 * */
//                                                 _Solution_

public class Question_03_18 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("1- (true) && (3 > 4) = " + ((true) && (3 > 4)));
        System.out.println("2- !(x > 0) && (x > 0) = " + (!(x > 0) && (x > 0)));
        System.out.println("3- ( x != 0) || (x == 0) = " + ((x > 0) || (x < 0)));
        System.out.println("4- (x >= 0) || (x < 0) = " + ((x >= 0) || (x < 0)));
        System.out.println("5- (x != 1) == !(x == 1) = " + ((x != 1) == !(x == 1)));

    }
}

/*                                                 _Output_
 * 1- (true) && (3 > 4) = false
 * 2- !(x > 0) && (x > 0) = false
 * 3- ( x != 0) || (x == 0) = true
 * 4- (x >= 0) || (x < 0) = true
 * 5- (x != 1) == !(x == 1) = true
 * */