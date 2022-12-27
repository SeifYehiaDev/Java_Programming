/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/12/2022
 * */

package Chapter_05_Lists;

public class Listing_05_10_FutureTuition {
    public static void main(String[] args) {
        final double DOUBLE_TUITION = 20_000;
        double tuition = 10_000;
        int year = 0;
        while (tuition < DOUBLE_TUITION) {
            tuition += tuition * 0.07;
            year++;
        }
        System.out.println("Tuition will be doubled in " + year + " years");
        System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
    }
}

//                                                 _Output_
/*
Tuition will be doubled in 11 years
Tuition will be $21048.52 in 11 years
 */