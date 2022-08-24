/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_02_Questions;

/*                                                 _Question_
 * Translate the following algorithm into Java code:
 * Step 1: Declare a double variable named miles with initial value 100.
 * Step 2: Declare a double constant named KILOMETERS_PER_MILE with value 1.609.
 * Step 3: Declare a double variable named kilometers, multiply miles and KILOMETERS_PER_MILE, and assign the result to kilometers.
 * Step 4: Display kilometers to the console.
 * What is kilometers after Step 4?
 * */
//                                                 _Solution_
public class Question_02_09 {
    public static void main(String[] args) {
        double miles = 100D, kilometers;
        final double KILOMETERS_PER_MILE = 1.609D;
        kilometers = miles * KILOMETERS_PER_MILE;
        System.out.println("kilometers = " + kilometers);
    }
}

/*                                                 _Output_
 * kilometers = 160.9
 * */