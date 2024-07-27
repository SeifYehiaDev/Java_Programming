/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 27/07/2024
 * */

package Chapter_02_Exercises;

public class Exercise_02_18 {
    public static void main(String[] args) {
        System.out.println("a    b    pow(a, b)");
        for (int index = 1; index <= 5; index++)
            System.out.printf("%-5d%-5d%d\n", index, index + 1, (int) Math.pow(index, index + 1));
    }
}

//                                                 _Output_
/*
a    b    pow(a, b)
1    2    1
2    3    8
3    4    81
4    5    1024
5    6    15625
 */