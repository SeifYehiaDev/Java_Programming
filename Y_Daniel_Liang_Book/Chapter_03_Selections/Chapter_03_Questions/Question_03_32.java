/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Write a switch statement that displays Sunday, Monday, Tuesday, Wednesday,
 * Thursday, Friday, Saturday, if day is 0, 1, 2, 3, 4, 5, 6, accordingly.
 * */
//                                                 _Solution_

import java.util.Scanner;

public class Question_03_32 {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer day: ");
        switch (input.nextInt()) {
            default:
                System.out.println("Invalid day");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}

/*                                                 _Output_
 * Enter a integer day: 1
 * Monday
 * */