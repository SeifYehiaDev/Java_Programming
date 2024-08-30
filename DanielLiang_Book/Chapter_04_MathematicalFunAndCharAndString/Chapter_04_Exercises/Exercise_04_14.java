/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_14 {
    public static void main(String[] args) {
        int gradeDigit;
        char gradeLetter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        gradeLetter = input.nextLine().trim().charAt(0);
        if (Character.toUpperCase(gradeLetter) >= 'A' && Character.toUpperCase(gradeLetter) <= 'F' && Character.toUpperCase(gradeLetter) != 'E') {
            gradeDigit = (Character.toUpperCase(gradeLetter) == 'A') ? 4 : (Character.toUpperCase(gradeLetter) == 'B') ? 3 : (Character.toUpperCase(gradeLetter) == 'C') ? 2 : ((Character.toUpperCase(gradeLetter) == 'D')) ? 1 : 0;
            System.out.printf("The numeric value for grade %c is %d", gradeLetter, gradeDigit);
        } else
            System.out.printf("%c is an invalid grade", gradeLetter);
    }
}

//                                                 _Output One_
/*
Enter a letter grade: B
The numeric value for grade B is 3
 */

//                                                 _Output Two_
/*
Enter a letter grade: f
The numeric value for grade f is 0
 */

//                                                 _Output Three_
/*
Enter a letter grade: E
E is an invalid grade
 */

//                                                 _Output Four_
/*
Enter a letter grade: T
T is an invalid grade
 */