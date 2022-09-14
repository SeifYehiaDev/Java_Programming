/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 14/9/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Cost of shipping) A shipping company uses the following function to calculate
                the cost (in dollars) of shipping based on the weight of the package (in pounds).
                                           3.5, if 0 < w <= 1
                                    c(w) = 5.5, if 1 < w <= 3
                                           8.5, if 3 < w <= 10
                                           10.5, if 10 < w <= 20
                Write a program that prompts the user to enter the weight of the package and
                display the shipping cost. If the weight is greater than 50, display a message “the
                package cannot be shipped.”*/
//                                                 _Solution_
public class Exercise_03_18 {
    public static void main(String[] args) {
        double cost, weight;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of the package: ");
        weight = input.nextDouble();
        if (weight < 0.0 || weight > 50.0) {
            System.out.println((weight > 50.0) ? "The package cannot be shipped." : "Error: Weight is a negative number");
            System.exit(0);
        }
        cost = (weight <= 1) ? 3.5 : (weight <= 3) ? 5.5 : (weight <= 10) ? 8.5 : 10.5;
        System.out.println("Shipping cost of package is $" + cost * weight);
    }
}

/*                                                 _Output One_
 * Enter the weight of the package: -632
 * Error: Weight is a negative number
 * */

/*                                                 _Output Two_
 * Enter the weight of the package: 100
 * The package cannot be shipped.
 * */

/*                                                 _Output Three_
 * Enter the weight of the package: 3
 * Shipping cost of package is $16.5
 * */

/*                                                 _Output Four_
 * Enter the weight of the package: 50
 * Shipping cost of package is $525.0
 * */