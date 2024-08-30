/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 24/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_10 {
    public static void main(String[] args) {
        int day = 0;
        char answer;
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
        Scanner input = new Scanner(System.in);
        for (int set = 1; set <= 5; set++) {
            System.out.printf("Is your birthday in Set%d?\n", set);
            System.out.println((set == 1) ? setOne : (set == 2) ? setTwo : (set == 3) ? setThree : (set == 4) ? setFour : setFive);
            System.out.print("Enter N for No and Y for Yes: ");
            answer = Character.toUpperCase(input.nextLine().trim().charAt(0));
            day += (answer == 'Y') ? (set == 1) ? 1 : (set == 2) ? 2 : (set == 3) ? 4 : (set == 4) ? 8 : 16 : 0;
            if (set != 5) System.out.println();
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
Enter N for No and Y for Yes: Y

Is your birthday in Set2?
 2  3  6  7
10 11 14 15
18 19 22 23
26 27 30 31
Enter N for No and Y for Yes: n

Is your birthday in Set3?
 4  5  6  7
12 13 14 15
20 21 22 23
28 29 30 31
Enter N for No and Y for Yes: N

Is your birthday in Set4?
 8  9 10 11
12 13 14 15
24 25 26 27
28 29 30 31
Enter N for No and Y for Yes: Y

Is your birthday in Set5?
16 17 18 19
20 21 22 23
24 25 26 27
28 29 30 31
Enter N for No and Y for Yes: y
Your birthday is 25!
 */