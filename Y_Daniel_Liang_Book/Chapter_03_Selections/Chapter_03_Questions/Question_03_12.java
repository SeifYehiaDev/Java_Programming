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
        int count = 563;
        boolean newLine, isYes;
       /* if (count % 10 == 0)
            newLine = true;
        else
            newLine = false;*/

        // Rewrite the following statement using a Boolean expression:
        isYes = count % 10 == 0;
        if (isYes)
            newLine = true;
        else
            newLine = false;

        // inline if
        isYes = count % 10 == 0;
        newLine = (isYes) ? true : false;

        // Advanced
        newLine = false;
        isYes = count % 10 == 0;
        if (isYes)
            newLine = true;
        // the correct answer
        newLine = false;
        newLine = count % 10 == 0;

    }
}

/*                                                 _Output_
 * */