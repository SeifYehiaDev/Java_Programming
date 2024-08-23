/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 23/08/2024
 * */

package Chapter_04_Lists;

import java.util.Scanner;

public class Listing_04_05_LotteryUsingStrings {
    public static void main(String[] args) {
        String lottery = String.valueOf((int) (Math.random() * 10)).concat(String.valueOf((int) (Math.random() * 10)));
        String guess;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        guess = input.nextLine();
        System.out.println("The lottery number is ".concat(lottery));
        if (lottery.equals(guess))
            System.out.print("Exact match: you win $10,000");
        else if (lottery.charAt(0) == guess.charAt(1) && lottery.charAt(1) == guess.charAt(0))
            System.out.print("Match all digits: you win $3,000");
        else if (lottery.charAt(0) == guess.charAt(0) || lottery.charAt(0) == guess.charAt(1) || lottery.charAt(1) == guess.charAt(0) || lottery.charAt(1) == guess.charAt(1))
            System.out.print("Match one digit: you win $1,000");
        else
            System.out.print("Sorry, no match");
    }
}

//                                                 _Output One_
/*
Enter your lottery pick (two digits): 03
The lottery number is 03
Exact match: you win $10,000
 */

//                                                 _Output Two_
/*
Enter your lottery pick (two digits): 85
The lottery number is 58
Match all digits: you win $3,000
 */

//                                                 _Output Three_
/*
Enter your lottery pick (two digits): 40
The lottery number is 50
Match one digit: you win $1,000
 */

//                                                 _Output Four_
/*
Enter your lottery pick (two digits): 14
The lottery number is 02
Sorry, no match
 */