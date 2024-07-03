/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 04/07/2024
 * */

package Chapter_01_Lists;

public class Listing_01_06_ShowLogicErrors {
    public static void main(String[] args) {
        System.out.println("Celsius 35 is Fahrenheit degree ");
        System.out.println(9 / 5 * 35 + 32); // logic Error.
        System.out.print(9.0 / 5 * 35 + 32); // Correct the logic Error.
    }
}

//                                                 _Output_
/*
Celsius 35 is Fahrenheit degree
67
95.0
 */