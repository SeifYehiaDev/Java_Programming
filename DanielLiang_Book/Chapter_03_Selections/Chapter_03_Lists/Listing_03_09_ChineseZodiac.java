/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 29/07/2024
 * */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_09_ChineseZodiac {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = input.nextInt();
        switch (year % 12) {
            case 0:  System.out.print("monkey");break;
            case 1:  System.out.print("rooster");break;
            case 2:  System.out.print("dog");break;
            case 3:  System.out.print("pig");break;
            case 4:  System.out.print("rat");break;
            case 5:  System.out.print("ox");break;
            case 6:  System.out.print("tiger");break;
            case 7:  System.out.print("rabbit");break;
            case 8:  System.out.print("dragon");break;
            case 9:  System.out.print("snake");break;
            case 10: System.out.print("horse");break;
            case 11: System.out.print("sheep");
        }
    }
}

//                                                 _Output One_
/*
Enter a year: 1963
rabbit
 */

//                                                 _Output Two_
/*
Enter a year: 1877
ox
 */