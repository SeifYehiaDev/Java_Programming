/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Write a Boolean expression that evaluates to true if weight is greater than 50 pounds or height is greater than 60 inches
 * */
//                                                 _Solution_

public class Question_03_26 {
    public static void main(String[] args) {
        int weight, height;
        boolean isWeightAndHeightValid;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter your weight in pounds and height in inches: ");
        weight = input.nextInt();
        height = input.nextInt();
        isWeightAndHeightValid = weight > 50 || height > 60;
        if (isWeightAndHeightValid)
            System.out.println("Your weight " + weight + " and height " + height + " are valid");
        else
            System.out.println("Your weight " + weight + " and height " + height + " aren't valid");
    }
}

/*                                                 _Output One_
 * Enter your weight in pounds and height in inches: 51 59
 * Your weight 51 and height 59 are valid
 * */

/*                                                 _Output Two_
 * Enter your weight in pounds and height in inches: 49 59
 * Your weight 49 and height 59 aren't valid
 * */