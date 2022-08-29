/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Which of the following statements are equivalent? Which ones are correctly indented?
 * */
//                                                 _Solution_

public class Question_03_11 {
    public static void main(String[] args) {
        int i = 1, j = 2, x = 3, k = 4, y = 5, z = 6;
        /*
         * Which of the following statements are equivalent?
         * a & c & d
         * */
        System.out.println("a");
        {
            if (i > 0)
                if (j > 0)
                    x = 0;
                else if (k > 0)
                    y = 0;
                else
                    z = 0;
        }
        System.out.println("b");
        {
            if (i > 0) {
                if (j > 0)
                    x = 0;
                else if (k > 0)
                    y = 0;
            } else
                z = 0;
        }
        System.out.println("c");
        if (i > 0)
            if (j > 0)
                x = 0;
            else if (k > 0)
                y = 0;
            else
                z = 0;
        System.out.println("d");
        {
            if (i > 0)
                if (j > 0)
                    x = 0;
                else if (k > 0)
                    y = 0;
                else
                    z = 0;
        }
        /*
         * Which ones are correctly indented?
         * b
         * */

    }
}

/*                                                 _Output_
 * */