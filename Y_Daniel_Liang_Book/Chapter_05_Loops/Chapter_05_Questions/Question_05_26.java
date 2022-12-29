/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/12/2022
 * */

package Chapter_05_Questions;

//                                                 _Question_
    /*Rewrite the programs TestBreak and TestContinue in Listings 5.12 and 5.13 without using break and continue.*/
//                                                 _Solution_
public class Question_05_26 {
    public static void main(String[] args) {
        System.out.println("Rewrite the programs in Listings 5.12");
        int sum = 0, number = 0;
        while (number < 20 && sum <= 100) {
            number++;
            sum += number;
        }
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
        System.out.println();
        System.out.println("Rewrite the programs in Listings 5.13");
        sum = 0;
        number = 0;
        while (number < 20) {
            number++;
            sum += (number == 10 || number == 11) ? 0 : number;
        }
        System.out.println("The sum is " + sum);
    }
}

//                                                 _Output_
/*
Rewrite the programs in Listings 5.12
The number is 14
The sum is 105

Rewrite the programs in Listings 5.13
The sum is 189
 */