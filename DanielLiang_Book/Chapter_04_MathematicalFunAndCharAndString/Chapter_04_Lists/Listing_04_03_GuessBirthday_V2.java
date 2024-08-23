/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 23/08/2024
 * */

package Chapter_04_Lists;

import java.util.Scanner;

public class Listing_04_03_GuessBirthday_V2 {
    public static void main(String[] args) {
        final int[][] SET_ONE = {{1, 3, 5, 7}, {9, 11, 13, 15}, {17, 19, 21, 23}, {25, 27, 29, 31}},
                SET_TWO = {{2, 3, 6, 7}, {10, 11, 14, 15}, {18, 19, 22, 23}, {26, 27, 30, 31}},
                SET_THREE = {{4, 5, 6, 7}, {12, 13, 14, 15}, {20, 21, 22, 23}, {28, 29, 30, 31}},
                SET_FOUR = {{8, 9, 10, 11}, {12, 13, 14, 15}, {24, 25, 26, 27}, {28, 29, 30, 31}},
                SET_FIVE = {{16, 17, 18, 19}, {20, 21, 22, 23}, {24, 25, 26, 27}, {28, 29, 30, 31}};
        int answer, day = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Is your birthday in set1?");
        display(SET_ONE);
        System.out.print("Enter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1) day += SET_ONE[0][0];
        System.out.println();
        System.out.println("Is your birthday in set2?");
        display(SET_TWO);
        System.out.print("Enter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1) day += SET_TWO[0][0];
        System.out.println();
        System.out.println("Is your birthday in set3?");
        display(SET_THREE);
        System.out.print("Enter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1) day += SET_THREE[0][0];
        System.out.println();
        System.out.println("Is your birthday in set4?");
        display(SET_FOUR);
        System.out.print("Enter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1) day += SET_FOUR[0][0];
        System.out.println();
        System.out.println("Is your birthday in set5?");
        display(SET_FIVE);
        System.out.print("Enter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1) day += SET_FIVE[0][0];
        System.out.printf("Your birthday is %d!", day);
    }

    public static void display(int[][] array) {
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++)
                System.out.printf("%2d ", array[x][y]);
            System.out.println();
        }
    }
}

//                                                 _Output_
/*
Is your birthday in set1?
 1  3  5  7
 9 11 13 15
17 19 21 23
25 27 29 31
Enter 0 for No and 1 for Yes: 0

Is your birthday in set2?
 2  3  6  7
10 11 14 15
18 19 22 23
26 27 30 31
Enter 0 for No and 1 for Yes: 0

Is your birthday in set3?
 4  5  6  7
12 13 14 15
20 21 22 23
28 29 30 31
Enter 0 for No and 1 for Yes: 1

Is your birthday in set4?
 8  9 10 11
12 13 14 15
24 25 26 27
28 29 30 31
Enter 0 for No and 1 for Yes: 1

Is your birthday in set5?
16 17 18 19
20 21 22 23
24 25 26 27
28 29 30 31
Enter 0 for No and 1 for Yes: 0
Your birthday is 12!
 */