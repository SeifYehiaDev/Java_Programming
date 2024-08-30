/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_31 {
    public static void main(String[] args) {
        int option;
        double amount, rate;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        rate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        option = input.nextInt();
        if (option != 0 && option != 1) {
            System.out.print("Incorrect input");
            System.exit(1);
        }
        System.out.printf("Enter the %s amount: ", (option == 0) ? "dollar" : "RMB");
        amount = input.nextInt();
        if (option == 0)
            System.out.printf("$%.1f is %.1f yuan", amount, amount * rate);
        else
            System.out.printf("%.1f yuan is $%.2f", amount, amount / rate);
    }
}

//                                                 _Output One_
/*
Enter the exchange rate from dollars to RMB: 6.81
Enter 0 to convert dollars to RMB and 1 vice versa: 0
Enter the dollar amount: 100
$100.0 is 681.0 yuan
 */

//                                                 _Output Two_
/*
Enter the exchange rate from dollars to RMB: 6.81
Enter 0 to convert dollars to RMB and 1 vice versa: 1
Enter the RMB amount: 10000
10000.0 yuan is $1468.43
 */

//                                                 _Output Three_
/*
Enter the exchange rate from dollars to RMB: 6.81
Enter 0 to convert dollars to RMB and 1 vice versa: 5
Incorrect input
 */