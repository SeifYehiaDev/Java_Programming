/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 15/01/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_02 {
    public static void main(String[] args) {
        final int FIRST_NUMBER = (int) (Math.random() * 100),
                  SECOND_NUMBER = (int) (Math.random() * 100),
                  THIRD_NUMBER = (int) (Math.random() * 100);
        int answer;
        Scanner input = new Scanner(System.in);
        System.out.printf("What's %d + %d + %d? ", FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER);
        answer = input.nextInt();
        System.out.printf("%d + %d + %d = %d is %b", FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER, answer, FIRST_NUMBER + SECOND_NUMBER + THIRD_NUMBER == answer);
    }
}

//                                                 _Output One_
/*
What's 43 + 35 + 61? 139
43 + 35 + 61 = 139 is true
 */

//                                                 _Output Two_
/*
What's 47 + 10 + 84? 100
47 + 10 + 84 = 100 is false
 */