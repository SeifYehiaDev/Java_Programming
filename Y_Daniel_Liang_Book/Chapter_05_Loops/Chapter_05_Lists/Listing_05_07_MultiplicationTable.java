/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 23/12/2022
 * */

package Chapter_05_Lists;

public class Listing_05_07_MultiplicationTable {
    public static void main(String[] args) {
        int i, j;
        System.out.println("             Multiplication Table");
        System.out.print("       ");
        for (i = 1; i < 10; System.out.print(i + "   "), i++) ;
        System.out.println("\n———————————————————————————————————————");
        for (i = 1; i < 10; i++) {
            System.out.print(i + " | ");
            for (j = 1; j < 10; j++)
                System.out.printf("%4d", i * j);
            System.out.println();
        }
    }
}

//                                                 _Output_
/*
             Multiplication Table
       1   2   3   4   5   6   7   8   9
———————————————————————————————————————
1 |    1   2   3   4   5   6   7   8   9
2 |    2   4   6   8  10  12  14  16  18
3 |    3   6   9  12  15  18  21  24  27
4 |    4   8  12  16  20  24  28  32  36
5 |    5  10  15  20  25  30  35  40  45
6 |    6  12  18  24  30  36  42  48  54
7 |    7  14  21  28  35  42  49  56  63
8 |    8  16  24  32  40  48  56  64  72
9 |    9  18  27  36  45  54  63  72  81
 */