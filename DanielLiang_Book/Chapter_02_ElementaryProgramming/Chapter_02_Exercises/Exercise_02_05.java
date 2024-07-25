/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 25/07/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_05 {
    public static void main(String[] args) {
        int subtotal, gratuityRate;
        double gratuity, total;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        subtotal = input.nextInt();
        gratuityRate = input.nextInt();
        gratuity = subtotal * gratuityRate / 100.0;
        total = subtotal * (gratuityRate / 100.0 + 1);
        System.out.printf("The gratuity is $%.1f and total is $%.1f", gratuity, total);
    }
}

//                                                 _Output_
/*
Enter the subtotal and a gratuity rate: 10 15
The gratuity is $1.5 and total is $11.5
 */