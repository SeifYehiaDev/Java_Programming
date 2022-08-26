/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 26/8/2022
 * */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_08_SalesTax {
    public static void main(String[] args) {
        double purchaseAmount, tax;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchase amount: "); //197.55
        purchaseAmount = input.nextDouble();
        tax = purchaseAmount * 0.06; // 11.853
        System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);
        /*
        * 11.853 * 100 = 1185.3
        * after casting (int)1185.3 = 1185
        * 1185 / 100.0 = 11.85
        * */
    }
}
/*                                                 _Output_
 * Enter purchase amount: 197.55
 * Sales tax is $11.85
 * */