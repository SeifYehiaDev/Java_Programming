/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Rewrite the following statement using a Boolean expression:
 * */
//                                                 _Solution_

public class Question_03_12 {
    public static void main(String[] args) {
        int count = 100;
        boolean newLine;
/*        if (count % 10 == 0)
            newLine = true;
        else
            newLine = false;*/
        newLine = count % 10 == 0;
        System.out.println(newLine);

    }
}

/*                                                 _Output_
 * */