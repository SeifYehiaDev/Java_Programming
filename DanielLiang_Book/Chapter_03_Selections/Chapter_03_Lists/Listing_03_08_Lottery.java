/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 29/07/2024
 * */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_08_Lottery {
    public static void main(String[] args) {
        int lottery = (int) (10 + Math.random() * 90), guess;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        guess = input.nextInt();
        System.out.printf("The lottery number is %d\n", lottery);
        if (lottery == guess)
            System.out.print("Exact match: you win $10,000");
        else if (lottery % 10 == guess / 10 && lottery / 10 == guess % 10)
            System.out.print("Match all digits: you win $3,000");
        else if (lottery % 10 == guess % 10 || lottery % 10 == guess / 10 || lottery / 10 == guess % 10 || lottery / 10 == guess / 10)
            System.out.print("Match one digit: you win $1,000");
        else
            System.out.print("Sorry, no match");
    }
}

//                                                 _Output One_
/*
Enter your lottery pick (two digits): 12
The lottery number is 12
Exact match: you win $10,000
 */

//                                                 _Output Two_
/*
Enter your lottery pick (two digits): 94
The lottery number is 49
Match all digits: you win $3,000
 */

//                                                 _Output Three_
/*
Enter your lottery pick (two digits): 50
The lottery number is 58
Match one digit: you win $1,000
 */

//                                                 _Output Four_
/*
Enter your lottery pick (two digits): 90
The lottery number is 85
Sorry, no match
 */