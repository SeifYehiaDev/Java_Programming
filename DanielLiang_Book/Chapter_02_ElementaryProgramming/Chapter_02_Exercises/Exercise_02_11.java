/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 27/07/2024
 * */

package Chapter_02_Exercises;

public class Exercise_02_11 {
    public static void main(String[] args) {
        final long SECONDS_PER_YEARS = 31_536_000L;
        double currentPopulation = 312_032_486.0, populationIncreasePerYear, birthsPerYear, deathsPerYear, immigrantsPerYear;
        birthsPerYear = SECONDS_PER_YEARS / 7.0;
        deathsPerYear = SECONDS_PER_YEARS / 13.0;
        immigrantsPerYear = SECONDS_PER_YEARS / 45.0;
        populationIncreasePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;
        for (int i = 1; i <= 5; i++) currentPopulation += populationIncreasePerYear;
        System.out.printf("The population in 5 years is %d", (int) currentPopulation);
    }
}

//                                                 _Output_
/*
The population in 5 years is 325932969
 */