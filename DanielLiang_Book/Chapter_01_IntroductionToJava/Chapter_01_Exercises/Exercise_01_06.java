/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 21/07/2024
 * */

package Chapter_01_Exercises;

public class Exercise_01_06 {
    public static void main(String[] args) {
        System.out.println("SumOfSeries V1");
        sumOfSeries_V1();
        System.out.println("\n_______________________________________");
        System.out.println("SumOfSeries V2");
        System.out.print("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = " + sumOfSeries_V2(1, 9));
        System.out.println("\n_______________________________________");
        System.out.println("SumOfSeries V3");
        System.out.print("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = " + sumOfSeries_V3(1, 9));
    }

    public static void sumOfSeries_V1() {
        System.out.printf("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = %d", 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
    }

    public static int sumOfSeries_V2(final int first, final int last) {
        int sum = 0;
        for (int number = first; number <= last; number++) sum += number;
        return sum;
    }

    public static int sumOfSeries_V3(int first, final int last) {
        if (first == 0) first = 1;
        int n = last - first + 1;
        double m = (first + last) / 2.0;
        return (int) (n * m);
    }
}

//                                                 _Output_
/*
SumOfSeries V1
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45
_______________________________________
SumOfSeries V2
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45
_______________________________________
SumOfSeries V3
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45
 */