/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 07/01/2024
 * */

package Chapter_01_Lists;

public class Listing_01_06_ShowLogicErrors {
    public static void main(String[] args) {
        System.out.println("Celsius 35 is Fahrenheit degree \n" + (9 / 5 * 35 + 32));
        System.out.println("_______________________________________________\n");
        System.out.print("Celsius 35 is Fahrenheit degree \n" + (9.0 / 5 * 35 + 32));
    }
}

//                                                 _Output_
/*
Celsius 35 is Fahrenheit degree
67
_______________________________________________

Celsius 35 is Fahrenheit degree
95.0
 */