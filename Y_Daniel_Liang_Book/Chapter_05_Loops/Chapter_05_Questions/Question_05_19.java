/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 23/12/2022
 * */

package Chapter_05_Questions;

//                                                 _Question_
                        /*How many times is the println statement executed?*/
//                                                 _Solution_
public class Question_05_19 {
    public static void main(String[] args) {
        int numberOfPrint = 0;
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < i; j++) {
                System.out.println(i * j);
                numberOfPrint++;
            }
        System.out.println("How many times is the println statement executed? "+numberOfPrint);
    }
}

//                                                 _Output_
/*
0
0
2
0
3
6
0
4
8
12
0
5
10
15
20
0
6
12
18
24
30
0
7
14
21
28
35
42
0
8
16
24
32
40
48
56
0
9
18
27
36
45
54
63
72
How many times is the println statement executed? 45
 */