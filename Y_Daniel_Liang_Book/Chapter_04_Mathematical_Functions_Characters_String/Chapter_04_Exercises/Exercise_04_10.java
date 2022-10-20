/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 20/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

//                                                 _Question_
            /*(Guess birthday) Rewrite Listing 4.3, GuessBirthday.java, to prompt the user to
            enter the character Y for Yes and N for No rather than entering 1 for Yes and 0
            for No.*/
//                                                 _Solution_
public class Exercise_04_10 {
    public static void main(String[] args) {
        final int[][] SET_ONE = {{1, 3, 5, 7}, {9, 11, 13, 15}, {17, 19, 21, 23}, {25, 27, 29, 31}},
                SET_TWO = {{2, 3, 6, 7}, {10, 11, 14, 15}, {18, 19, 22, 23}, {26, 27, 30, 31}},
                SET_THREE = {{4, 5, 6, 7}, {12, 13, 14, 15}, {20, 21, 22, 23}, {28, 29, 30, 31}},
                SET_FOUR = {{8, 9, 10, 11}, {12, 13, 14, 15}, {24, 25, 26, 27}, {28, 29, 30, 31}},
                SET_FIVE = {{16, 17, 18, 19}, {20, 21, 22, 23}, {24, 25, 26, 27}, {28, 29, 30, 31}};
        int day;
        char state;
        System.out.println("Is your birthday in Set1?");
        displayArray(SET_ONE);
        state = stateFormUser();
        System.out.println();
        day = (state == 'Y') ? SET_ONE[0][0] : 0;
        System.out.println("Is your birthday in Set2?");
        displayArray(SET_TWO);
        state = stateFormUser();
        System.out.println();
        day += (state == 'Y') ? SET_TWO[0][0] : 0;
        System.out.println("Is your birthday in Set3?");
        displayArray(SET_THREE);
        state = stateFormUser();
        System.out.println();
        day += (state == 'Y') ? SET_THREE[0][0] : 0;
        System.out.println("Is your birthday in Set4?");
        displayArray(SET_FOUR);
        state = stateFormUser();
        System.out.println();
        day += (state == 'Y') ? SET_FOUR[0][0] : 0;
        System.out.println("Is your birthday in Set5?");
        displayArray(SET_FIVE);
        state = stateFormUser();
        day += (state == 'Y') ? SET_FIVE[0][0] : 0;
        System.out.println("Your birthday is " + day + "!");
    }

    public static void displayArray(int[][] array) {
        int row, column, value;
        for (row = 0; row < 4; row++) {
            for (column = 0; column < 4; column++) {
                value = array[row][column];
                System.out.print(((value < 10) ? " " + value : value) + "\t");
            }
            System.out.println();
        }
    }

    public static char stateFormUser() {
        char state;
        boolean valid;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter N for No and Y for Yes: ");
            state = Character.toUpperCase(input.nextLine().charAt(0));
            valid = state == 'Y' || state == 'N';
            if (!valid)
                System.out.println("Error: invalid input please enter Y or N.\ntry again please");
        } while (!valid);
        return state;
    }
}

//                                                 _Output_
/*
Is your birthday in Set1?
 1	 3	 5	 7
 9	11	13	15
17	19	21	23
25	27	29	31
Enter N for No and Y for Yes: Y

Is your birthday in Set2?
 2	 3	 6	 7
10	11	14	15
18	19	22	23
26	27	30	31
Enter N for No and Y for Yes: N

Is your birthday in Set3?
 4	 5	 6	 7
12	13	14	15
20	21	22	23
28	29	30	31
Enter N for No and Y for Yes: N

Is your birthday in Set4?
 8	 9	10	11
12	13	14	15
24	25	26	27
28	29	30	31
Enter N for No and Y for Yes: Y

Is your birthday in Set5?
16	17	18	19
20	21	22	23
24	25	26	27
28	29	30	31
Enter N for No and Y for Yes: Y
Your birthday is 25!
 */