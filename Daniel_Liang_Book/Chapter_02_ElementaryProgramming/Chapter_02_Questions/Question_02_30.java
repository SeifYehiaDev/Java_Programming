/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 09/01/2024
 * */

package Chapter_02_Questions;

import java.util.Scanner;

public class Question_02_30 {
    public static void main(String[] args) {
        System.out.print("""
                ■ If you change (int)(tax * 100) / 100.0 to (int)(tax * 100) / 100 in line
                11 in Listing 2.8, what will be the output for the input purchase amount of 197.55?
                
                """);
        double purchaseAmount, tax;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        purchaseAmount = input.nextDouble();
        tax = purchaseAmount * 0.06;
        //System.out.print("Sales tax is $" + (int) (tax * 100) / 100.0);
        System.out.print("Sales tax is $" + (int) (tax * 100) / 100);
    }
}

//                                                 _Output_
/*
■ If you change (int)(tax * 100) / 100.0 to (int)(tax * 100) / 100 in line
11 in Listing 2.8, what will be the output for the input purchase amount of 197.55?

Enter purchase amount: 197.55
Sales tax is $11
 */