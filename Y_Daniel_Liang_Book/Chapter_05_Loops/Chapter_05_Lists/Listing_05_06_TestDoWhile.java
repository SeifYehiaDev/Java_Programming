/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 22/12/2022
 * */

package Chapter_05_Lists;

import java.util.Scanner;

public class Listing_05_06_TestDoWhile {
    public static void main(String[] args) {
        int data, sum = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
            sum += data;
        } while (data != 0);
        System.out.println("The sum is " + sum);
    }
}

//                                                 _Output_
/*
Enter an integer (the input ends if it is 0): 1
Enter an integer (the input ends if it is 0): 2
Enter an integer (the input ends if it is 0): 3
Enter an integer (the input ends if it is 0): 4
Enter an integer (the input ends if it is 0): 5
Enter an integer (the input ends if it is 0): 6
Enter an integer (the input ends if it is 0): 7
Enter an integer (the input ends if it is 0): 8
Enter an integer (the input ends if it is 0): 9
Enter an integer (the input ends if it is 0): 0
The sum is 45
 */