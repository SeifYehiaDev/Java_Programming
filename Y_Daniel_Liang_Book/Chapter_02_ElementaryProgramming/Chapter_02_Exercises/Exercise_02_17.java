/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/8/2022
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

/*                                                 _Question_
 * (Science: wind-chill temperature) How cold is it outside? The temperature alone is not enough to provide the answer.
 * Other factors including wind speed,relative humidity, and sunshine play important roles in determining coldness outside.
 * In 2001, the National Weather Service (NWS) implemented the new wind-chill temperature to measure the coldness using
 * temperature and wind speed. The formula is
 *                               Twc = 35.74 + 0.6215Ta - 35.75v^0.16 + 0.4275Tav^0.16
 * where ta is the outside temperature measured in degrees Fahrenheit and v is the peed measured in miles per hour.
 * twc is the wind-chill temperature.
 * The formula cannot be used for wind speeds below 2 mph or temperatures below -58 ºF or above 41ºF
 * Write a program that prompts the user to enter a temperature between -58 ºF and 41ºF and a wind speed greater
 * than or equal to 2 and displays the wind-chill temperature.
 * Use Math.pow(a, b) to compute v^0.16
 * Here is a sample run:
 * Enter the temperature in Fahrenheit between -58°F and 41°F: 5.3
 * Enter the wind speed (>=2) in miles per hour: 6
 * The wind chill index is -5.56707
 * */
//                                                 _Solution_
public class Exercise_02_17 {
    public static void main(String[] args) {
        double outsideTemperature, windChillTemperature, speed;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        outsideTemperature = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        speed = input.nextDouble();
        if (speed >= 2 && (outsideTemperature >= -58 && outsideTemperature <= 41)) {
            windChillTemperature = 35.74D + 0.6215 * outsideTemperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * outsideTemperature * Math.pow(speed, 0.16);
            System.out.printf("The wind chill index is %.5f", windChillTemperature);
            // System.out.println("The wind chill index is " + windChillTemperature);
        } else
            System.out.println("!!!Error , the temperature should be between -58°F and 41°F: & the wind speed (>=2)");
    }
}
/*                                                 _Output_
 * Enter the temperature in Fahrenheit between -58°F and 41°F: 5.3
 * Enter the wind speed (>=2) in miles per hour: 6
 * The wind chill index is -5.56707
 * */