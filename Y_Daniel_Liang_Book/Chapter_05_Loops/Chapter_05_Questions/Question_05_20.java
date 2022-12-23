/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 23/12/2022
 * */

package Chapter_05_Questions;

//                                                 _Question_
                                /*Show the output of the following programs.
            (Hint: Draw a table and list the variables in the columns to trace these programs.)*/
//                                                 _Solution_
public class Question_05_20 {
    public static void main(String[] args) {
        System.out.println("________________ Program (A) ________________");
        for (int i = 1; i < 5; i++) {
            int j = 0;
            while (j < i) {
                System.out.print(j + " ");
                j++;
            }
        }
        System.out.println("\n________________ Program (B) ________________");
        int i = 0;
        while (i < 5) {
            for (int j = i; j > 1; j--)
                System.out.print(j + " ");
            System.out.println("****");
            i++;
        }
        System.out.println("________________ Program (C) ________________");
        i = 5;
        while (i >= 1) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "xxx");
                num *= 2;
            }
            System.out.println();
            i--;
        }
        System.out.println("________________ Program (D) ________________");
        i = 1;
        do {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "G");
                num += 2;
            }
            System.out.println();
            i++;
        } while (i <= 5);
    }
}

//                                                 _Output_
/*
________________ Program (A) ________________
0 0 1 0 1 2 0 1 2 3
________________ Program (B) ________________
****
****
2 ****
3 2 ****
4 3 2 ****
________________ Program (C) ________________
1xxx2xxx4xxx8xxx16xxx
1xxx2xxx4xxx8xxx
1xxx2xxx4xxx
1xxx2xxx
1xxx
________________ Program (D) ________________
1G
1G3G
1G3G5G
1G3G5G7G
1G3G5G7G9G
 */