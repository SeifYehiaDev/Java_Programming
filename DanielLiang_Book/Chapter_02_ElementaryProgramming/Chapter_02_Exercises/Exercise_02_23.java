/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 27/07/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_23 {
    public static void main(String[] args) {
        double distance, fuelEfficiency, price, cost;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        fuelEfficiency = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        price = input.nextDouble();
        cost = distance / fuelEfficiency * price;
        System.out.printf("The cost of driving is $%.2f", cost);
    }
}

//                                                 _Output_
/*
Enter the driving distance: 900.5
Enter miles per gallon: 25.5
Enter price per gallon: 3.55
The cost of driving is $125.36
 */