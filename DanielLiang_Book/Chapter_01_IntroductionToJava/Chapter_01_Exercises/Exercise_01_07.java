/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 21/07/2024
 * */

package Chapter_01_Exercises;

public class Exercise_01_07 {
    public static void main(String[] args) {
        System.out.println("Approximate Pi When value = 11");
        System.out.println("Approximate Pi = " + 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11));
        System.out.println("Approximate Pi = " + approximatePI(11));
        System.out.println("_________________________________________________");
        System.out.println("Approximate Pi When value = 13");
        System.out.println("Approximate Pi = " + 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13));
        System.out.print("Approximate Pi = " + approximatePI(13));
    }

    public static double approximatePI(final int value) {
        double sum = 0.0;
        for (int number = 1, count = 0; number <= value; number += 2, count++) {
            if (count % 2 == 0) sum += 1.0 / number;
            else sum -= 1.0 / number;
        }
        return 4 * sum;
    }
}

//                                                 _Output_
/*
Approximate Pi When value = 11
Approximate Pi = 2.9760461760461765
Approximate Pi = 2.9760461760461765
_________________________________________________
Approximate Pi When value = 13
Approximate Pi = 3.2837384837384844
Approximate Pi = 3.2837384837384844
 */