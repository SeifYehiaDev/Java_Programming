/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 18/10/2022
 * */

package Chapter_04_Lists;

import java.util.Scanner;

public class Listing_04_02_OrderTwoCities {
    public static void main(String[] args) {

        String cityOne, cityTwo;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        cityOne = input.nextLine();
        System.out.print("Enter the second city: ");
        cityTwo = input.nextLine();
        System.out.println("The cities in alphabetical order are ".concat(((cityOne.compareTo(cityTwo) < 0) ? cityOne.concat(" ").concat(cityTwo) : cityTwo.concat(" ").concat(cityOne))));
    }
}

//                                                 _Output_
/*
Enter the first city: New York
Enter the second city: Boston
The cities in alphabetical order are Boston New York
 */