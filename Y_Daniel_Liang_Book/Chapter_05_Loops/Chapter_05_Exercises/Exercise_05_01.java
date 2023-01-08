/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 08/01/2023
 * */

package Chapter_05_Exercises;

import java.util.Scanner;

//                                                 _Question_
            /*(Count positive and negative numbers and compute the average of numbers) Write
            a program that reads an unspecified number of integers, determines how many
            positive and negative values have been read, and computes the total and average of
            the input values (not counting zeros). Your program ends with the input 0. Display
            the average as a floating-point number.*/
//                                                 _Solution_
public class Exercise_05_01 {
    public static void main(String[] args) {
        int numbers, positives, negatives, count;
        double total, average;
        Scanner input = new Scanner(System.in);
        total = positives = negatives = count = 0;
        System.out.print("Enter an integer, the input ends if it is 0: ");
        numbers = input.nextInt();
        if (numbers == 0) {
            System.out.println("No numbers are entered except ".concat(String.valueOf(numbers)));
            System.exit(1);
        }
        while (numbers != 0) {
            if (numbers > 0) positives++;
            else negatives++;
            total += numbers;
            count++;
            numbers = input.nextInt();
        }
        average = total / count;
        System.out.println("The number of positives ".concat((positives > 1) ? "are " : "is ") + positives + '\n'
                + "The number of negatives ".concat((negatives > 1) ? "are " : "is ") + negatives + '\n'
                + "The total is " + total + '\n'
                + "The average is " + average);
    }
}

//                                                 _Output One_
/*
Enter an integer, the input ends if it is 0: 1 2 -1 3 0
The number of positives are 3
The number of negatives is 1
The total is 5.0
The average is 1.3
 */

//                                                 _Output Two_
/*
Enter an integer, the input ends if it is 0: 0
No numbers are entered except 0
 */