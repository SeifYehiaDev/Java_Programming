/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/12/2022
 * */

package Chapter_05_Examples;

public class Example_05_08 {
    public static void main(String[] args) {
        double sum = 0;
        for (double i = 0.01; i <= 1.0; i = i + 0.01)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}

//                                                 _Output_
/*
The sum is 49.50000000000003
 */