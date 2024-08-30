/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_18 {
    public static void main(String[] args) {
        final String[] MAJOR = {"Mathematics", "Computer Science", "Information Technology"},
                STATUS = {"Freshman", "Sophomore", "Junior", "Senior"};
        String userInput;
        int major = 0, status = 0;
        boolean validInput = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        userInput = input.nextLine().trim();
        if (userInput.length() == 2 && Character.isLetter(userInput.charAt(0)) && Character.isDigit(userInput.charAt(1))) {
            major = (Character.toUpperCase(userInput.charAt(0)) == 'M') ? 0 : (Character.toUpperCase(userInput.charAt(0)) == 'C') ? 1 : (Character.toUpperCase(userInput.charAt(0)) == 'I') ? 2 : -1;
            status = (userInput.charAt(1) == '1') ? 0 : (userInput.charAt(1) == '2') ? 1 : (userInput.charAt(1) == '3') ? 2 : (userInput.charAt(1) == '4') ? 3 : -1;
            validInput = major != -1 && status != -1;
        }
        System.out.print((validInput) ? MAJOR[major].concat(" ").concat(STATUS[status]) : "Invalid input");
    }
}

//                                                 _Output One_
/*
Enter two characters: M1
Mathematics Freshman
 */

//                                                 _Output Two_
/*
Enter two characters: C3
Computer Science Junior
 */

//                                                 _Output Three_
/*
Enter two characters: T3
Invalid input
 */