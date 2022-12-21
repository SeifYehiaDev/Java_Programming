/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 21/12/2022
 * */

package Chapter_05_Questions;

//                                                 _Question_
/*How many times are the following loop bodies repeated? What is the output of each loop?*/
//                                                 _Solution_
public class Question_05_03 {
    public static void main(String[] args) {
/*        int i = 1;
        while (i < 10)
            if (i % 2 == 0)
                System.out.println(i);*/
        System.out.println("A is infinite loop");
        System.out.println("********************************");
/*        int i = 1;
        while (i < 10)
            if (i % 2 == 0)
                System.out.println(i++);*/
        System.out.println("B is infinite loop");
        System.out.println("********************************");
        int i = 1, count = 0;
        while (i < 10) {
            if ((i++) % 2 == 0)
                System.out.println(i);
            count++;
        }
        System.out.println("C is finite loop repeated " + count + " times");
    }
}

//                                                 _Output_
/*
A is infinite loop
********************************
B is infinite loop
********************************
3
5
7
9
C is finite loop repeated 9 times
 */