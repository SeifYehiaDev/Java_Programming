/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 01/08/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_20 {
    public static void main(String[] args) {
        double outsideTemperature, speed, windchillTemperature;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        outsideTemperature = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        speed = input.nextDouble();
        if (!(outsideTemperature >= -58 && outsideTemperature <= 41 && speed >= 2)) {
            if (outsideTemperature < -58 || outsideTemperature > 41)
                System.out.println("Error: The temperature should be between -58°F and 41°F.");
            if (speed < 2)
                System.out.print("Error: the wind speed should be greater than or equal to 2.");
            System.exit(1);
        }
        windchillTemperature = 35.74 + 0.6215 * outsideTemperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * outsideTemperature * Math.pow(speed, 0.16);
        System.out.printf("The wind chill index is %.5f", windchillTemperature);
    }
}

/*                                                 _Output One_
Enter the temperature in Fahrenheit between -58°F and 41°F: -60
Enter the wind speed (>=2) in miles per hour: 1
Error: The temperature should be between -58°F and 41°F.
Error: the wind speed should be greater than or equal to 2.
*/

/*                                                 _Output Two_
Enter the temperature in Fahrenheit between -58°F and 41°F: 5.3
Enter the wind speed (>=2) in miles per hour: 6
The wind chill index is -5.56707
*/