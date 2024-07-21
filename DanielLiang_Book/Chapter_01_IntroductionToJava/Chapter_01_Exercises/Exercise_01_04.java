/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 21/07/2024
 * */

package Chapter_01_Exercises;

public class Exercise_01_04 {
    public static void main(String[] args) {
        System.out.println("PrintTable V1");
        printTable_V1();
        System.out.println("\n_______________________________________");
        System.out.println("PrintTable V2");
        printTable_V2();
    }

    public static void printTable_V1() {
        System.out.print("""
                a    a^2    a^3
                1    1      1
                2    4      8
                3    9      27
                4    16     64""");
    }

    public static void printTable_V2() {
        System.out.println("a    a^2    a^3");
        for (int index = 1; index <= 4; index++)
            System.out.printf("%-5d%-7d%d\n", index, (int) Math.pow(index, 2.0), (int) Math.pow(index, 3.0));
    }
}

//                                                 _Output_
/*
PrintTable V1
a    a^2    a^3
1    1      1
2    4      8
3    9      27
4    16     64
_______________________________________
PrintTable V2
a    a^2    a^3
1    1      1
2    4      8
3    9      27
4    16     64
 */