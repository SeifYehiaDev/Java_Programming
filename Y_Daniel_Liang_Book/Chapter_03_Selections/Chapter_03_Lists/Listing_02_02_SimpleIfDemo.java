/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 28/8/2022
 * */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_02_02_SimpleIfDemo {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = input.nextInt();
        if (number % 5 == 0)
            System.out.println("HiFIve");
        if (number % 2 == 0)
            System.out.println("HiEven");
    }
}

/*                                                 _Output One_
 * Enter an integer: 4
 * HiEven
 * */

/*                                                 _Output Two_
 * Enter an integer: 30
 * HiFIve
 * HiEven
 * */