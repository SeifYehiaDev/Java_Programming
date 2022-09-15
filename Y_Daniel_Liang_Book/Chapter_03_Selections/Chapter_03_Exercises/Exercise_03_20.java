/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 15/9/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                    /*(Science: wind-chill temperature) Programming Exercise 2.17 gives a formula
                    to compute the wind-chill temperature. The formula is valid for temperatures in
                    the range between −58ºF and 41ºF and wind speed greater than or equal to 2.
                    Write a program that prompts the user to enter a temperature and a wind speed.
                    The program displays the wind-chill temperature if the input is valid; otherwise,
                    it displays a message indicating whether the temperature and/or wind speed is
                    invalid.*/
//                                                 _Solution_
public class Exercise_03_20 {
    public static void main(String[] args) {
        double outsideTemperature, windChillTemperature, speed;
        boolean valid;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        outsideTemperature = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        speed = input.nextDouble();
        valid = speed >= 2 && (outsideTemperature >= -58 && outsideTemperature <= 41);
        if (!valid) {
            if (outsideTemperature < -58 || outsideTemperature > 41)
                System.out.println("Error: The temperature should be between -58°F and 41°F");
            if (speed < 2)
                System.out.println("Error: the wind speed should be (>=2)");
            System.exit(0);
        }
        windChillTemperature = 35.74 + 0.6215 * outsideTemperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * outsideTemperature * Math.pow(speed, 0.16);
        System.out.println("The wind chill index is " + (int) (windChillTemperature * 1E5) / 1E5);
    }
}

/*                                                 _Output One_
 * Enter the temperature in Fahrenheit between -58°F and 41°F: -59
 * Enter the wind speed (>=2) in miles per hour: 1
 * Error: The temperature should be between -58°F and 41°F
 * Error: the wind speed should be (>=2)
 * */

/*                                                 _Output Two_
 * Enter the temperature in Fahrenheit between -58°F and 41°F: 5.3
 * Enter the wind speed (>=2) in miles per hour: 6
 * The wind chill index is -5.56706
 * */