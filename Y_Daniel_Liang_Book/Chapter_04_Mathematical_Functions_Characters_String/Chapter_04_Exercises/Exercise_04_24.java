/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Arrays;
import java.util.Scanner;

//                                                 _Question_
            /*(Order three cities) Write a program that prompts the user to enter three cities and
            displays them in ascending order.*/
//                                                 _Solution_
public class Exercise_04_24 {
    public static void main(String[] args) {
        String[] cities = new String[3];
        Scanner input = new Scanner(System.in);
        for (int index = 0; index < cities.length; index++) {
            System.out.print("Enter the ".concat((index == 0) ? "first" : (index == 1) ? "second" : "third").concat(" city: "));
            cities[index] = input.nextLine();
        }
        Arrays.sort(cities);
        System.out.print("The three cities in alphabetical order are ");
        for (String city : cities)
            System.out.print(city + " ");
    }
}

//                                                 _Output_
/*
Enter the first city: Chicago
Enter the second city: Los Angeles
Enter the third city: Atlanta
The three cities in alphabetical order are Atlanta Chicago Los Angeles
 */