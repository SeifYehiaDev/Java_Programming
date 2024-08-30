/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_33 {
    public static void main(String[] args) {
        double weightOne, priceOne, weightTwo, priceTwo;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        weightOne = input.nextDouble();
        priceOne = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        weightTwo = input.nextDouble();
        priceTwo = input.nextDouble();
        if (priceOne / weightOne == priceTwo / weightTwo)
            System.out.print("Two packages have the same price.");
        else
            System.out.printf("Package %d has a better price.", ((priceTwo / weightTwo) < (priceOne / weightOne)) ? 2 : 1);
    }
}

//                                                 _Output One_
/*
Enter weight and price for package 1: 50 24.59
Enter weight and price for package 2: 25 11.99
Package 2 has a better price.
 */

//                                                 _Output Two_
/*
Enter weight and price for package 1: 25 11.99
Enter weight and price for package 2: 50 24.59
Package 1 has a better price.
 */

//                                                 _Output Three_
/*
Enter weight and price for package 1: 50 25
Enter weight and price for package 2: 25 12.5
Two packages have the same price.
 */

