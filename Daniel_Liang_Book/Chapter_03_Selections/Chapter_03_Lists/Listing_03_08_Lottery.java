/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 14/01/2024
 * */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_08_Lottery {
    public static void main(String[] args) {
        final int lottery = (int) (10 + Math.random() * 90); // generate random number from 10 to 99
        int guess;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        guess = input.nextInt();
        System.out.println("The lottery number is " + lottery);
        if (guess == lottery)
            System.out.print("Exact match: you win $10,000");
        else if (lottery % 10 == guess / 10 && guess % 10 == lottery / 10)
            System.out.print("Match all digits: you win $3,000");
        else if (lottery / 10 == guess / 10 || lottery / 10 == guess % 10 || lottery % 10 == guess / 10 || lottery % 10 == guess % 10)
            System.out.print("Match one digit: you win $1,000");
        else
            System.out.print("Sorry: no match");
    }
}

//                                                 _Output One_
/*
Enter your lottery pick (two digits): 82
The lottery number is 82
Exact match: you win $10,000
 */

//                                                 _Output Two_
/*
Enter your lottery pick (two digits): 89
The lottery number is 98
Match all digits: you win $3,000
 */

//                                                 _Output Three_
/*
Enter your lottery pick (two digits): 71
The lottery number is 16
Match one digit: you win $1,000
 */

//                                                 _Output Four_
/*
Enter your lottery pick (two digits): 96
The lottery number is 85
Sorry: no match
 */