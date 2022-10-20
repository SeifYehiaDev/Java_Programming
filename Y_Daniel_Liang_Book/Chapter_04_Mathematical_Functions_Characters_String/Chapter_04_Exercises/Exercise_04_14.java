/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 20/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Convert letter grade to number) Write a program that prompts the user to enter a
                letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2,
                1, or 0.*/
//                                                 _Solution_
public class Exercise_04_14 {
    public static void main(String[] args) {
        String stringGrade;
        char charGrade;
        int grade;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        stringGrade = input.nextLine();
        charGrade = Character.toUpperCase(stringGrade.charAt(0));
        if (stringGrade.length() != 1 || charGrade < 'A' || charGrade > 'F') {
            System.out.println((stringGrade.length() != 1) ? "You must enter exactly one character" : stringGrade.charAt(0) + " is an invalid grade");
            System.exit(1);
        }
        switch (charGrade) {
            case 'A': grade = 4;break;
            case 'B': grade = 3;break;
            case 'C': grade = 2;break;
            case 'D': grade = 1;break;
            default: grade = 0;
        }
        System.out.println("The numeric value for grade " + stringGrade.charAt(0) + " is "+ grade);
    }
}

//                                                 _Output One_
/*
Enter a letter grade: B
The numeric value for grade B is 3
 */

//                                                 _Output Two_
/*
Enter a letter grade: T
T is an invalid grade
 */

//                                                 _Output Three_
/*
Enter a letter grade: Seif Yehia
You must enter exactly one character
 */