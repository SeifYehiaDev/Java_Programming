/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/12/2022
 * */

package Chapter_05_Lists;

public class Listing_05_12_TestBreak {
    public static void main(String[] args) {
        int sum = 0, number = 0;
        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100) break;
        }
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}

//                                                 _Output_
/*
The number is 14
The sum is 105
 */