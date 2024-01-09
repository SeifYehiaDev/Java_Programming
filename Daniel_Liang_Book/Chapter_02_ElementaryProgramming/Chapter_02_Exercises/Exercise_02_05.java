/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 09/01/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_05 {
    public static void main(String[] args) {
        double subtotal, gratuityRate, gratuity, total;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        subtotal = input.nextDouble();
        gratuityRate = input.nextDouble();
        gratuity = subtotal * (gratuityRate / 100.0);
        total = subtotal + gratuity;
        System.out.print("The gratuity is $" + gratuity + " and total is $" + total);
    }
}

//                                                 _Output_
/*
Enter the subtotal and a gratuity rate: 10 15
The gratuity is $1.5 and total is $11.5
 */