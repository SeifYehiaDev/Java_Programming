/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/12/2022
 * */

package Chapter_05_Lists;

public class Listing_05_08_TestSum {
    public static void main(String[] args) {
        float sum = 0;
        for (float i = 0.01F; i <= 1.0f; i += 0.01)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}

//                                                 _Output_
/*
The sum is 50.499985
 */