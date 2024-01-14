/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 14/01/2024
 * */

package Chapter_03_Questions;

import java.util.Scanner;

public class Question_03_10_V2 {
    public static void main(String[] args) {
        double score;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score: ");
        score = input.nextDouble();
        System.out.print((score > 100 || score < 0) ? "Invalid input" : (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F");
    }
}

//                                                 _Output_
/*
Enter your score: 70.5
C
 */