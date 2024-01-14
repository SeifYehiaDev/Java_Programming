/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 14/01/2024
 * */

package Chapter_03_Questions;

import java.util.Scanner;

public class Question_03_10_V1 {
    public static void main(String[] args) {
        double score;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score: ");
        score = input.nextDouble();
        if (score >= 90.0)
            System.out.println("A");
        else if (score >= 80.0)
            System.out.println("B");
        else if (score >= 70.0)
            System.out.println("C");
        else if (score >= 60.0)
            System.out.println("D");
        else
            System.out.println("F");
    }
}

//                                                 _Output_
/*
Enter your score: 56.36
F
 */