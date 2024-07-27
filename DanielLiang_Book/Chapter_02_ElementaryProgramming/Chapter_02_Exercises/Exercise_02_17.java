/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 27/07/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_17 {
    public static void main(String[] args) {
        double outsideTemperature, speed, windchillTemperature;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        outsideTemperature = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        speed = input.nextDouble();
        windchillTemperature = 35.74 + 0.6215 * outsideTemperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * outsideTemperature * Math.pow(speed, 0.16);
        System.out.printf("The wind chill index is %.5f", windchillTemperature);
    }
}

//                                                 _Output_
/*
Enter the temperature in Fahrenheit between -58°F and 41°F: 5.3
Enter the wind speed (>=2) in miles per hour: 6
The wind chill index is -5.56707
 */