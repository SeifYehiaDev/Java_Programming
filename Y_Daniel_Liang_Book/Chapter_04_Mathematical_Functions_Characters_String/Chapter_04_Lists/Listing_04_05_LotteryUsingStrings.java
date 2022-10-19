/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 19/10/2022
 * */

package Chapter_04_Lists;

import java.util.Scanner;

public class Listing_04_05_LotteryUsingStrings {
    public static void main(String[] args) {
        String lottery, guess;
        Scanner input = new Scanner(System.in);
        lottery = (int) (Math.random() * 10) + "" + (int) (Math.random() * 10);
        System.out.print("Enter your lottery pick (two digits): ");
        guess = input.nextLine();
        System.out.println("The lottery number is " + lottery);
        System.out.println((lottery.equals(guess)) ? "Exact match: you win $10,000" : (lottery.charAt(0) == guess.charAt(1) && lottery.charAt(1) == guess.charAt(0)) ? "Match all digits: you win $3,000" : (lottery.charAt(0) == guess.charAt(0) || lottery.charAt(0) == guess.charAt(1) || lottery.charAt(1) == guess.charAt(0) || lottery.charAt(1) == guess.charAt(1)) ? "Match one digit: you win $1,000" : "Sorry, no match");
    }
}

//                                                 _Output One_
/*
Enter your lottery pick (two digits): 84
The lottery number is 84
Exact match: you win $10,000
 */

//                                                 _Output Two_
/*
Enter your lottery pick (two digits): 97
The lottery number is 79
Match all digits: you win $3,000
 */

//                                                 _Output Three_
/*
Enter your lottery pick (two digits): 28
The lottery number is 81
Match one digit: you win $1,000
 */

//                                                 _Output Four_
/*
Enter your lottery pick (two digits): 40
The lottery number is 39
Sorry, no match
 */