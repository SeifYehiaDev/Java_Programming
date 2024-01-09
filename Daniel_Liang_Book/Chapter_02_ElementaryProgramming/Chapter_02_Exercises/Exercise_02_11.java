/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 09/01/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_11 {
    public static void main(String[] args) {
        final int CURRENT_POPULATION = 312_032_486, SECONDS_OF_BIRTH = 7, SECONDS_OF_DEATH = 13, SECONDS_OF_IMMIGRANT = 45;
        int years, population, populationPerYear = (31_536_000 / SECONDS_OF_BIRTH) + (31_536_000 / SECONDS_OF_IMMIGRANT) - (31_536_000 / SECONDS_OF_DEATH);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        years = input.nextInt();
        population = CURRENT_POPULATION + populationPerYear * years;
        System.out.print("The population in 5 years is " + population);
    }
}

//                                                 _Output_
/*
Enter the number of years: 5
The population in 5 years is 325932966
 */