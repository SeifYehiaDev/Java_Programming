/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 22/12/2022
 * */

package Chapter_05_Questions;

//                                                 _Question_
                        /*Count the number of iterations in the following loops.*/
//                                                 _Solution_
public class Question_05_14 {
    public static void main(String[] args) {
        System.out.println("Loop (A)");
        int count_1 = 0;
        while (count_1 < 10) {
            count_1++;
        }
        System.out.println("iterations of loop is " + count_1); // 10
        System.out.println("Loop (B)");
        int count_2 = 0;
        for (; count_2 <= 10; count_2++) {
        }
        System.out.println("iterations of loop is " + count_2); // 11
        System.out.println("Loop (C)");
        int count_3 = 5;
        int number = 0;
        while (count_3 < 10) {
            count_3++;
            number++;
        }
        System.out.println("iterations of loop is " + number); // 5
        System.out.println("Loop (D)");
        count_3 = 5;
        number = 0;
        while (count_3 < 10) {
            count_3 = count_3 + 3;
            number++;
        }
        System.out.println("iterations of loop is " + number); // 2
    }
}

//                                                 _Output_
/*
Loop (A)
iterations of loop is 10
Loop (B)
iterations of loop is 11
Loop (C)
iterations of loop is 5
Loop (D)
iterations of loop is 2
 */