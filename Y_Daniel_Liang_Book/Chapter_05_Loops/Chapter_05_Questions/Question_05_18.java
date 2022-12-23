/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 23/12/2022
 * */

package Chapter_05_Questions;

//                                                 _Question_
                                /*What is wrong with the following programs?*/
//                                                 _Solution_
public class Question_05_18 {
    public static void main(String[] args) {
        System.out.println("Program (A)");
        int i = 0;
        do {
            System.out.println(i + 4);
            i++;
        } while (i < 10);
        System.out.println("Program (B)");
        for (i = 0; i < 10; i++)
            System.out.println(i + 4);
    }
}

//                                                 _Output_
/*
Program (A)
4
5
6
7
8
9
10
11
12
13
Program (B)
4
5
6
7
8
9
10
11
12
13
 */