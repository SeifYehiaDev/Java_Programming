/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/12/2022
 * */

package Chapter_05_Examples;

public class Example_05_09 {
    public static void main(String[] args) {
        double currentValue = 0.01;
        int sum = 0;
        for (int count = 0; count < 100; count++) {
            sum += currentValue;
            currentValue += 0.01;
        }
        System.out.println("The sum is " + sum);
        System.out.println("The currentValue is " + currentValue);
    }
}

//                                                 _Output_
/*
The sum is 1
The currentValue is 1.0100000000000007
 */