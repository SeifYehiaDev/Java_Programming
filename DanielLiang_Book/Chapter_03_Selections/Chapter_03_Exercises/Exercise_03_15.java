/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 31/07/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_15 {
    public static void main(String[] args) {
        int lottery = (int) (100 + Math.random() * 900), guess, guessCopy, count = 0, firstDigit, secondDigit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        guess = input.nextInt();
        System.out.printf("The lottery number is %d\n", lottery);
        if (lottery == guess)
            System.out.print("Exact match: you win $10,000");
        else {
            for (int x = 1; x <= 3; x++) {
                firstDigit = lottery % 10;
                guessCopy = guess;
                for (int y = 1; y <= 3; y++) {
                    secondDigit = guessCopy % 10;
                    if (firstDigit == secondDigit) {
                        count++;
                        break;
                    }
                    guessCopy /= 10;
                }
                lottery /= 10;
            }
            if (count == 3)
                System.out.print("Match all digits: you win $3,000");
            else if (count == 0)
                System.out.print("Sorry, no match");
            else
            System.out.print("Match one digit: you win $1,000");
        }
    }
}

//                                                 _Output One_
/*
Enter your lottery pick (three digits): 847
The lottery number is 847
Exact match: you win $10,000
 */

//                                                 _Output Two_
/*
Enter your lottery pick (three digits): 263
The lottery number is 632
Match all digits: you win $3,000
 */

//                                                 _Output Three_
/*
Enter your lottery pick (three digits): 776
The lottery number is 775
Match one digit: you win $1,000
 */

//                                                 _Output Four_
/*
Enter your lottery pick (three digits): 347
The lottery number is 216
Sorry, no match
 */