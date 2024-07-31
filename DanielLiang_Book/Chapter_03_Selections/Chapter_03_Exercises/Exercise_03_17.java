/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 01/08/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_17 {
    public static void main(String[] args) {
        final String[] GAME = {"scissors", "rock", "paper"};
        int computer = (int) (Math.random() * 3), user;
        boolean isWin;
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        user = input.nextInt();
        isWin = (user == 0 && computer == 2 || user == 1 && computer == 0 || user == 2 && computer == 1);
        System.out.printf("The computer is %s. You are %s%s", GAME[computer], GAME[user],
                (computer == user) ? " too. It is a draw" : (isWin) ? ". You won" : ". You lose");
    }
}

//                                                 _Output One_
/*
scissor (0), rock (1), paper (2): 0
The computer is paper. You are scissors. You won
 */

//                                                 _Output Two_
/*
scissor (0), rock (1), paper (2): 2
The computer is scissors. You are paper. You lose
 */

//                                                 _Output Three_
/*
scissor (0), rock (1), paper (2): 2
The computer is paper. You are paper too. It is a draw
 */