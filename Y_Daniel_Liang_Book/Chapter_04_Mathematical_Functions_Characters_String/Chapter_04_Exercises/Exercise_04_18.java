/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 21/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Student major and status) Write a program that prompts the user to enter two
                characters and displays the major and status represented in the characters. The first
                character indicates the major and the second is number character 1, 2, 3, 4, which
                indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
                the following chracters are used to denote the majors:
                M: Mathematics
                C: Computer Science
                I: Information Technology*/
//                                                 _Solution_
public class Exercise_04_18 {
    public static void main(String[] args) {
        String majorAndState;
        String major, status;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters : ");
        majorAndState = input.nextLine();
        if (majorAndState.length() != 2) {
            System.out.println("Error: You must enter exactly two characters");
            System.exit(1);
        }
        majorAndState = majorAndState.toUpperCase();
        major = (majorAndState.contains("M")) ? "Mathematics" : (majorAndState.contains("C")) ? "Computer Science" : (majorAndState.contains("I")) ? "Information Technology" : "";
        status = (majorAndState.contains("1")) ? "freshman" : (majorAndState.contains("2")) ? "sophomore" : (majorAndState.contains("3")) ? "junior" : (majorAndState.contains("3")) ? "senior" : "";
        System.out.println((major.isEmpty() || status.isEmpty()) ? "Invalid input" : major.concat(" ").concat(status));
    }
}

//                                                 _Output One_
/*
Enter two characters : M1
Mathematics freshman
 */

//                                                 _Output Two_
/*
Enter two characters : 1m
Mathematics freshman
 */

//                                                 _Output Three_
/*
Enter two characters : C3
Computer Science junior
 */

//                                                 _Output Four_
/*
Enter two characters : T3
Invalid input
 */

//                                                 _Output Five_
/*
Enter two characters : S9
Invalid input
 */

//                                                 _Output Six_
/*
Enter two characters : SeifYehia
Error: You must enter exactly two characters
 */