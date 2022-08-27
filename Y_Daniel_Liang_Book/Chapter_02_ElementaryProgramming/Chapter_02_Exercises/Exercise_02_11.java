/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years
 * and displays the population after the number of years.
 * Use the hint in Programming Exercise 1.11 for this program.
 * One birth every 7 seconds
 * One death every 13 seconds
 * One new immigrant every 45 seconds
 * Assume the current population is 312,032,486
 * The population should be cast into an integer
 * Here is a sample run of the program:
 * Enter the number of years: 5
 * The population in 5 years is 325932970
 * */
//                                                 _Solution_
public class Exercise_02_11 {
    public static void main(String[] args) {
        final int CURRENT_POPULATION = 312032486, NUMBER_OF_SECOND_IN_YEAR = 31536000;
        final double SECOND_OF_BIRTH = 7, SECOND_OF_DEATH = 13, SECOND_OF_NEW_IMMIGRANT = 45;
        int numberOfYears;
        double population;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        numberOfYears = input.nextInt();
        population = CURRENT_POPULATION + (((NUMBER_OF_SECOND_IN_YEAR /  SECOND_OF_BIRTH) - (NUMBER_OF_SECOND_IN_YEAR / SECOND_OF_DEATH) + (NUMBER_OF_SECOND_IN_YEAR / SECOND_OF_NEW_IMMIGRANT)) * numberOfYears);
        System.out.println("The population in " + numberOfYears + " years is " + (int) Math.ceil(population));
    }
}

/*                                                 _Output_
 * Enter the number of years: 5
 * The population in 5 years is 325932970
 * */