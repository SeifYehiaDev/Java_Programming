/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 28/10/2022
 * */

package Chapter_05_Lists;

import java.util.Scanner;

public class Listing_05_05_SentinelValue {
    public static void main(String[] args) {
        int sum = 0, number = Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);
        while (number != 0) {
            System.out.print("Enter an integer (the input ends if it is 0): ");
            number = input.nextInt();
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}

//                                                 _Output_
/*
Enter an integer (the input ends if it is 0): 2
Enter an integer (the input ends if it is 0): 3
Enter an integer (the input ends if it is 0): 4
Enter an integer (the input ends if it is 0): 0
The sum is 9
 */