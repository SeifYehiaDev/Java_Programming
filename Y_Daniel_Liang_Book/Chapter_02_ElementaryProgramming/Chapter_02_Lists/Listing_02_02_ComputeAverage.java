/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_02_ComputeAverage {
    public static void main(String[] args) {
        double numberOne, numberTwo, numberThree, average;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three number: ");
        numberOne = input.nextDouble();
        numberTwo = input.nextDouble();
        numberThree = input.nextDouble();
        average = (numberOne + numberTwo + numberThree) / 3;
        System.out.println("The average of " + numberOne + " " + numberTwo + " " + numberThree + " is " + average);
    }
}
/*                                                 _Output_
 * Enter three number: 1 2 3
 * The average of 1.0 2.0 3.0 is 2.0
 * */