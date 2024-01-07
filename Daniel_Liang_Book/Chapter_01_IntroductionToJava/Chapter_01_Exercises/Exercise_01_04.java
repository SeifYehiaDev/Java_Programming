/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 07/01/2024
 * */

package Chapter_01_Exercises;

public class Exercise_01_04 {
    public static void main(String[] args) {
        System.out.println("a   a^2   a^3");
        for (int index = 1; index <= 4; index++)
            System.out.printf("%-4d%-6d%d\n", index, (int) Math.pow(index, 2.0), (int) Math.pow(index, 3));
    }
}

//                                                 _Output_
/*
a   a^2   a^3
1   1     1
2   4     8
3   9     27
4   16    64
 */