/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 9/10/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                    /*(Financials: currency exchange) Write a program that prompts the user to enter
                    the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
                    to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
                    Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars
                    or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.*/
//                                                 _Solution_
public class Exercise_03_31 {
    public static void main(String[] args) {
        double amount,exchangeRate;
        int stateFormUser;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        exchangeRate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        stateFormUser = input.nextInt();
        System.out.print("Enter the " + ((stateFormUser == 0) ? "dollar" : "RMB") + " amount: ");
        amount = input.nextDouble();
        System.out.println((stateFormUser == 0) ? "$" + amount + " is " + (Math.round(amount * exchangeRate * 100) / 100.0) + " yuan" : amount + " yuan" + " is $" + (Math.round(amount / exchangeRate * 100) / 100.0));
    }
}

/*                                                 _Output One_
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice /versa: 0
 * Enter the dollar amount: 100
 * $100.0 is 681.0 yuan
 * */

/*                                                 _Output Two_
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice versa: 5
 * Enter the RMB amount: 10000
 * 10000.0 yuan is $1468.43
 * */