/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 31/8/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
                two integers and prompts the user to enter the sum of these two integers.
                Revise the program to generate three single-digit integers and prompt the user to
                enter the sum of these three integers.*/
//                                                 _Solution_
public class Exercise_03_02 {
    public static void main(String[] args) {
        int numberOne, numberTwo, numberThree, answer;
        java.util.Scanner input = new Scanner(System.in);
        numberOne = (int) (1 + Math.random() * (50 - 1)); // generate random number between 1 - 50
        numberTwo = (int) (51 + Math.random() * (100 - 51)); // generate random number between 51 - 100
        numberThree = (int) (101 + Math.random() * (150 - 101)); // generate random number between 101 - 150
        System.out.println("What is " + numberOne + " + " + numberTwo + " + " + numberThree + "?");
        answer = input.nextInt();
        System.out.println(numberOne + " + " + numberTwo + " + " + numberThree+" = "+answer+" is "+(answer == numberOne + numberTwo + numberThree));
    }
}

/*                                                 _Output One_
 * What is 31 + 81 + 136?
 * 248
 * 31 + 81 + 136 = 248 is true
 * */

/*                                                 _Output Two_
 * What is 33 + 55 + 140?
 * 180
 * 33 + 55 + 140 = 180 is false
 * */