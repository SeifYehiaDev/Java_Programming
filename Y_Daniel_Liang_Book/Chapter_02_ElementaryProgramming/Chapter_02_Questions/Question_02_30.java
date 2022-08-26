/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 26/8/2022
 * */

package Chapter_02_Questions;

import java.util.Scanner;

/*                                                 _Question_
 * If you change (int)(tax * 100) / 100.0 to (int)(tax * 100) / 100 in line
 * 11 in Listing 2.8, what will be the output for the input purchase amount of 197.55?
 * */
//                                                 _Solution_
public class Question_02_30 {
    public static void main(String[] args) {
        double purchaseAmount, tax;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchase amount: "); //197.55
        purchaseAmount = input.nextDouble();
        tax = purchaseAmount * 0.06; // 11.853
        //System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);
        System.out.println("Sales tax is $" + (int) (tax * 100) / 100);
        /*
         * 11.853 * 100 = 1185.3
         * after casting (int)1185.3 = 1185
         * 1185 / 100 = 11
         * */
    }
}

/*                                                 _Output_
 * Enter purchase amount: 197.55
 * Sales tax is $11
 * */