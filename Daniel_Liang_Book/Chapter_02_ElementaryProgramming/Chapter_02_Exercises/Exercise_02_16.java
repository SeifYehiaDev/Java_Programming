/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 09/01/2024
 * */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_16 {
    public static void main(String[] args) {
        double side, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        side = input.nextDouble();
        area = 3 * Math.sqrt(3) / 2 * Math.pow(side, 2);
        System.out.printf("The area of the hexagon is %.4f", area);
    }
}

//                                                 _Output_
/*
Enter the side: 5.5
The area of the hexagon is 78.5918
 */