/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 22/07/2024
 * */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_08_SalesTax {
    public static void main(String[] args) {
        double purchaseAmount, tax;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        purchaseAmount = input.nextDouble();
        tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + tax);
        System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);
        System.out.printf("Sales tax is $%.2f", tax);
    }
}

//                                                 _Output_
/*
Enter purchase amount: 197.55
Sales tax is $11.853
Sales tax is $11.85
Sales tax is $11.85
 */