/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_04_24_V2 {
    public static void main(String[] args) {
        String[] cities = new String[3];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        cities[0] = input.nextLine().trim();
        System.out.print("Enter the second city: ");
        cities[1] = input.nextLine().trim();
        System.out.print("Enter the third city: ");
        cities[2] = input.nextLine().trim();
        Arrays.sort(cities);
        System.out.print("The three cities in alphabetical order are ");
        for (String city : cities) System.out.printf("%s ", city);
    }
}

//                                                 _Output_
/*
Enter the first city: Chicago
Enter the second city: Los Angeles
Enter the third city: Atlanta
The three cities in alphabetical order are Atlanta Chicago Los Angeles
 */