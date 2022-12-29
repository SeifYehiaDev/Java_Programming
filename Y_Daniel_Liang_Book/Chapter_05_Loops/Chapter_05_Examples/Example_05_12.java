/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/12/2022
 * */

package Chapter_05_Examples;

import java.util.Scanner;

public class Example_05_12 {
    public static void main(String[] args) {
        int factor = 2, number;
        boolean found = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        while (factor <= number && !found) {
            if (number % factor == 0) found = true;
            else factor++;
        }
        System.out.println("The smallest factor other than 1 for " + number + " is " + factor);
    }
}

//                                                 _Output_
/*
Enter a number: 25
The smallest factor other than 1 for 25 is 5
 */