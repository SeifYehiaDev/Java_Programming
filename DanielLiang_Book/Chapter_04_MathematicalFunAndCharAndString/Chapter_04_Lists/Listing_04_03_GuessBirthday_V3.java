/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 23/08/2024
 * */

package Chapter_04_Lists;

import java.util.Scanner;

public class Listing_04_03_GuessBirthday_V3 {
    public static void main(String[] args) {
        String setOne, setTwo, setThree, setFour, setFive;
        setOne = """
                 1  3  5  7
                 9 11 13 15
                17 19 21 23
                25 27 29 31""";
        setTwo = """
                 2  3  6  7
                10 11 14 15
                18 19 22 23
                26 27 30 31""";
        setThree = """
                 4  5  6  7
                12 13 14 15
                20 21 22 23
                28 29 30 31""";
        setFour = """
                 8  9 10 11
                12 13 14 15
                24 25 26 27
                28 29 30 31""";
        setFive = """
                16 17 18 19
                20 21 22 23
                24 25 26 27
                28 29 30 31""";
        int answer, day = 0;
        Scanner input = new Scanner(System.in);
        for (int index = 1; index <= 5; index++) {
            System.out.printf("Is your birthday in Set%d?\n", index);
            System.out.println((index == 1) ? setOne : (index == 2) ? setTwo : (index == 3) ? setThree : (index == 4) ? setFour : setFive);
            System.out.print("Enter 0 for No and 1 for Yes: ");
            answer = input.nextInt();
            day += (answer == 1) ? (index == 1) ? 1 : (index == 2) ? 2 : (index == 3) ? 4 : (index == 4) ? 8 : 16 : 0;
            if (index != 5) System.out.println();
        }
        System.out.printf("Your birthday is %d!", day);
    }
}

//                                                 _Output_
/*
Is your birthday in Set1?
 1  3  5  7
 9 11 13 15
17 19 21 23
25 27 29 31
Enter 0 for No and 1 for Yes: 1

Is your birthday in Set2?
 2  3  6  7
10 11 14 15
18 19 22 23
26 27 30 31
Enter 0 for No and 1 for Yes: 1

Is your birthday in Set3?
 4  5  6  7
12 13 14 15
20 21 22 23
28 29 30 31
Enter 0 for No and 1 for Yes: 0

Is your birthday in Set4?
 8  9 10 11
12 13 14 15
24 25 26 27
28 29 30 31
Enter 0 for No and 1 for Yes: 0

Is your birthday in Set5?
16 17 18 19
20 21 22 23
24 25 26 27
28 29 30 31
Enter 0 for No and 1 for Yes: 1
Your birthday is 19!
 */