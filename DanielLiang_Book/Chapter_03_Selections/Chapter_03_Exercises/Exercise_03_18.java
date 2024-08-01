/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 01/08/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_18 {
    public static void main(String[] args) {
        double weight, shippingCost;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of the package: ");
        weight = input.nextDouble();
        if (weight > 50) {
            System.out.print("The package cannot be shipped.");
            System.exit(1);
        }
        shippingCost = weight * ((weight <= 1) ? 3.5 : (weight <= 3) ? 5.5 : (weight <= 10) ? 8.5 : 10.5);
        System.out.printf("Shipping cost of package is $%.1f", shippingCost);
    }
}

//                                                 _Output One_
/*
Enter the weight of the package: 50
Shipping cost of package is $525.00
 */

//                                                 _Output Two_
/*
Enter the weight of the package: 51
The package cannot be shipped.
 */