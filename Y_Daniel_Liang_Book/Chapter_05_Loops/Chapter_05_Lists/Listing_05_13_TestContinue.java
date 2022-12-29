/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/12/2022
 * */

package Chapter_05_Lists;

public class Listing_05_13_TestContinue {
    public static void main(String[] args) {
        int sum = 0, number = 0;
        while (number < 20) {
            number++;
            if (number == 10 || number == 11) continue;
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}

//                                                 _Output_
/*
The sum is 189
 */