/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_24_V1 {
    public static void main(String[] args) {
        String firstCity, secondCity, thirdCity, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        firstCity = input.nextLine().trim();
        System.out.print("Enter the second city: ");
        secondCity = input.nextLine().trim();
        System.out.print("Enter the third city: ");
        thirdCity = input.nextLine().trim();
        if (firstCity.compareTo(secondCity) > 0) {
            temp = firstCity;
            firstCity = secondCity;
            secondCity = temp;
        }
        if (secondCity.compareTo(thirdCity) > 0) {
            temp = secondCity;
            secondCity = thirdCity;
            thirdCity = temp;
        }
        if (firstCity.compareTo(secondCity) > 0) {
            temp = firstCity;
            firstCity = secondCity;
            secondCity = temp;
        }
        System.out.printf("The three cities in alphabetical order are %s %s %s", firstCity, secondCity, thirdCity);
    }
}

//                                                 _Output_
/*
Enter the first city: Chicago
Enter the second city: Los Angeles
Enter the third city: Atlanta
The three cities in alphabetical order are Atlanta Chicago Los Angeles
 */