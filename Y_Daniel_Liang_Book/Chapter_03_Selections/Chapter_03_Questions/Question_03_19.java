/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * (a) Write a Boolean expression that evaluates to true if a number stored in variable num is between 1 and 100.
 * (b) Write a Boolean expression that evaluates to true if a number stored in variable num is between 1 and 100 or
 * the number is negative.
 * */
//                                                 _Solution_

import java.util.Scanner;

public class Question_03_19 {
    public static void main(String[] args) {
        int number;
        boolean isValidNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("(a) Write a Boolean expression that evaluates to true if a number stored in variable num is between 1 and 100.");
        System.out.print("Enter a integer number between 1 and 100: ");
        number = input.nextInt();
        isValidNumber = number >= 1 && number <= 100;
        if (isValidNumber)
            System.out.println("Valid value " + number + " is between 1 and 100.");
        else
            System.out.println("Invalid value " + number + " isn't between 1 and 100");
        System.out.println("(b) Write a Boolean expression that evaluates to true if a number stored in variable num is between 1 and 100 or the number is negative. ");
        System.out.print("Enter another integer number between 1 and 100 or negative number: ");
        number = input.nextInt();
        isValidNumber = number >= 1 && number <= 100 || number < 0;
        if (isValidNumber)
            System.out.println("Valid value " + number + " is between 1 and 100 or negative number.");
        else
            System.out.println("Invalid value " + number + " isn't between 1 and 100 or negative number");
    }
}

/*                                                 _Output One_
 * (a) Write a Boolean expression that evaluates to true if a number stored in variable num is between 1 and 100.
 * Enter a integer number between 1 and 100: 50
 * Valid value 50 is between 1 and 100.
 * (b) Write a Boolean expression that evaluates to true if a number stored in variable num is between 1 and 100 or the number is negative.
 * Enter another integer number between 1 and 100 or negative number: -30
 * Valid value -30 is between 1 and 100 or negative number.
 * */

/*                                                 _Output Two_
 * (a) Write a Boolean expression that evaluates to true if a number stored in variable num is between 1 and 100.
 * Enter a integer number between 1 and 100: 200
 * Invalid value 200 isn't between 1 and 100
 * (b) Write a Boolean expression that evaluates to true if a number stored in variable num is between 1 and 100 or the number is negative.
 * Enter another integer number between 1 and 100 or negative number: 0
 * Invalid value 0 isn't between 1 and 100 or negative number
 * */