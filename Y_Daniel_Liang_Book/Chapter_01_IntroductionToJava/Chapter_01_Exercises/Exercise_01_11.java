/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_01_Exercises;

/*                                                 _Question_
 * (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
 *  One birth every 7 seconds
 *  One death every 13 seconds
 *  One new immigrant every 45 seconds
 *
 * Write a program to display the population for each of the next five years.
 * Assume the current population is 312,032,486 and one year has 365 days.
 * Hint: In Java, if two integers perform division, the result is an integer. The fractional part is truncated. For example
 * 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5).
 * To get an accurate result with the fractional part, one of the values involved in the division must be a number with a
 * decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 * */
//                                                 _Solution_
public class Exercise_01_11 {
    public static void main(String[] args) {
        final int CURRENT_POPULATION = 312032486, YEAR_IN_SECOND = 365 * 24 * 60 * 60;
        final double SECOND_OF_BIRTH = 7.0D, SECOND_OF_DEATH = 13.0D, SECOND_OF_NEW_IMMIGRANT = 45.0D;
        double populationPerYear = (YEAR_IN_SECOND / SECOND_OF_BIRTH) + (YEAR_IN_SECOND / SECOND_OF_NEW_IMMIGRANT) - (YEAR_IN_SECOND / SECOND_OF_DEATH);
        System.out.println("Population projection");
        System.out.println("Current population: 312032486");
        System.out.println("One birth every 7 seconds.");
        System.out.println("One death every 13 seconds.");
        System.out.println("One new immigrant every 45 seconds.");
        for (int i = 1; i <= 5; i++)
            System.out.println("Year " + i + " projection: " + (CURRENT_POPULATION + populationPerYear * i));
    }
}
/*                                                 _Output_
 * Population projection
 * Current population: 312032486
 * One birth every 7 seconds.
 * One death every 13 seconds.
 * One new immigrant every 45 seconds.
 * Year 1 projection: 3.148125827032967E8
 * Year 2 projection: 3.175926794065934E8
 * Year 3 projection: 3.203727761098901E8
 * Year 4 projection: 3.231528728131868E8
 * Year 5 projection: 3.2593296951648355E8
 * */