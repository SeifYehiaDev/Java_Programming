/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_09_ChineseZodiac {
    public static void main(String[] args) {
        int year;
        java.util.Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = input.nextInt();
        switch (year % 12) {
            case 0:
                System.out.println("monkey");
                break;
            case 1:
                System.out.println("rooster");
                break;
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
        }
    }
}

/*                                                 _Output One_
 * Enter a year: 1963
 * rabbit
 * */

/*                                                 _Output Two_
 * Enter a year: 1877
 * ox
 * */