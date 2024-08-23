/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 22/08/2024
 * */

package Chapter_04_Lists;

import java.util.Scanner;

public class Listing_04_02_OrderTwoCities_V2 {
    public static void main(String[] args) {
        String firstCity, secondCity;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        firstCity = input.nextLine();
        System.out.print("Enter the second city: ");
        secondCity = input.nextLine();
        if (firstCity.compareTo(secondCity) > 0) {
            String temp = firstCity;
            firstCity = secondCity;
            secondCity = temp;
        }
        System.out.printf("The cities in alphabetical order are %s %s", firstCity, secondCity);
    }
}

//                                                 _Output_
/*
Enter the first city: New York
Enter the second city: Boston
The cities in alphabetical order are Boston New York
 */