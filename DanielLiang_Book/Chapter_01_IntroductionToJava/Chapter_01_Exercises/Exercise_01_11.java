/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 21/07/2024
 * */

package Chapter_01_Exercises;

public class Exercise_01_11 {
    public static void main(String[] args) {
        final long SECONDS_PER_YEARS = 31_536_000L;
        long currentPopulation = 312_032_486L;
        double populationIncreasePerYear, birthsPerYear, deathsPerYear, immigrantsPerYear;
        birthsPerYear = SECONDS_PER_YEARS / 7.0;
        deathsPerYear = SECONDS_PER_YEARS / 13.0;
        immigrantsPerYear = SECONDS_PER_YEARS / 45.0;
        populationIncreasePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;
        System.out.println("Population projection for the next five years:");
        for (int i = 1; i <= 5; i++) {
            currentPopulation += (long) populationIncreasePerYear;
            System.out.println("Year " + i + ": " + currentPopulation);
        }
    }
}

//                                                 _Output_
/*
Population projection for the next five years:
Year 1: 314812582
Year 2: 317592678
Year 3: 320372774
Year 4: 323152870
Year 5: 325932966
 */