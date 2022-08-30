/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Write conditional expression that returns -1 or 1 randomly.
 * */
//                                                 _Solution_

import java.util.Random;

public class Question_03_36 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println((random.nextBoolean()) ? 1 : -1);
    }
}

/*                                                 _Output_
 * */