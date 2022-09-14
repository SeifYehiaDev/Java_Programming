/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 14/9/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                    /*(Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper game.
                    (A scissor can cut a paper, a rock can knock a scissor, and a paper canwrap a rock.)
                    The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
                    The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether
                    the user or the computer wins, loses, or draws*/
//                                                 _Solution_
public class Exercise_03_17 {
    public static void main(String[] args) {
        int computer, userEnter;
        Scanner input = new Scanner(System.in);
        // Generate a random integer 0, 1, or 2
        computer = (int) (Math.random() * 3);
        System.out.print("scissor (0), rock (1), paper (2): ");
        userEnter = input.nextInt();
        if (userEnter < 0 || userEnter > 2) {
            System.out.println("Error: invalid input.\nExist...........");
            System.exit(0);
        }
        System.out.print("The computer is " + stringComputer(computer) + ". " + "You are " + stringComputer(userEnter));
        System.out.println((computer == userEnter) ? " too. It is a draw" : (userEnter == 0 && computer == 2 || userEnter == 1 && computer == 0 || userEnter == 2 && computer == 1) ? ". You won" : ". You lose");
}

    public static String stringComputer(int status) {
        String stringComputer = null;
        switch (status) {
            case 0:
                stringComputer = "scissor";
                break;
            case 1:
                stringComputer = "rock";
                break;
            case 2:
                stringComputer = "paper";
        }
        return stringComputer;
    }
}

/*                                                 _Output One_
 * scissor (0), rock (1), paper (2): 5
 * Error: invalid input.
 * Exist...........
 * */

/*                                                 _Output Two_
 * scissor (0), rock (1), paper (2): 0
 * The computer is paper. You are scissor. You won
 * */

/*                                                 _Output Three_
 * scissor (0), rock (1), paper (2): 2
 * The computer is scissor. You are paper. You lose
 * */