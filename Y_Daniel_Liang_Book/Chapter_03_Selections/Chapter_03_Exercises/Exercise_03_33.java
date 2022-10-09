/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 9/10/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Financial: compare costs) Suppose you shop for rice in two different packages.
                You would like to write a program to compare the cost. The program prompts the
                user to enter the weight and price of the each package and displays the one with
                the better price.*/
//                                                 _Solution_
public class Exercise_03_33 {
    public static void main(String[] args) {
        double weightP1, priceP1, weightP2, priceP2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        weightP1 = input.nextDouble();
        priceP1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        weightP2 = input.nextDouble();
        priceP2 = input.nextDouble();
        System.out.println((priceP1 / weightP1 == priceP2 / weightP2) ? "Two packages have the same price." : "Package " + ((priceP1 / weightP1 > priceP2 / weightP2) ? "2" : "1") + " has a better price.");
    }
}

/*                                                 _Output One_
 * Enter weight and price for package 1: 100 25
 * Enter weight and price for package 2: 25 11.99
 * Package 1 has a better price.
 * */

/*                                                 _Output Two_
 * Enter weight and price for package 1: 50 24.59
 * Enter weight and price for package 2: 25 11.99
 * Package 2 has a better price.
 * */

/*                                                 _Output Three_
 * Enter weight and price for package 1: 50 25
 * Enter weight and price for package 2: 25 12.5
 * Two packages have the same price.
 * */