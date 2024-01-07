/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 07/01/2024
 * */

package Chapter_01_Exercises;

public class Exercise_01_07 {
    public static void main(String[] args) {
        double pi = 0;
        for (int index = 1; index <= 13; index += 2) {
            pi += 1.0 / index;
            pi -= 1.0 / (index += 2);
        }
        System.out.print("Approximate PI = " + 4 * pi);
    }
}

//                                                 _Output_
/*
Approximate PI = 3.017071817071818
 */