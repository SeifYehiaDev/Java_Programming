/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 16/10/2022
 * */

package Chapter_04_Questions;

//                                                 _Question_
                                            /*Evaluate the following:
                                            int i = '1';
                                            int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
                                            int k = 'a';
                                            char c = 90;*/
//                                                 _Solution_
public class Question_04_11 {
    public static void main(String[] args) {
        int i = '1'; // i = 49
        System.out.println("i = '1' = " + i);
        int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
        /*
         * j = 49 + 50 * (52 - 51) + 98 / 97
         * j = 49 + 50 + 1
         * j = 100
         * */
        System.out.println("j = '1' + '2' * ('4' - '3') + 'b' / 'a' = " + j);
        int k = 'a'; // k = 97
        System.out.println("k = 'a' = " + k);
        char c = 90; // c = Z
        System.out.println("c = 90 = " + c);
    }
}

//                                                 _Output_
/*
i = '1' = 49
j = '1' + '2' * ('4' - '3') + 'b' / 'a' = 100
k = 'a' = 97
c = 90 = Z
 */