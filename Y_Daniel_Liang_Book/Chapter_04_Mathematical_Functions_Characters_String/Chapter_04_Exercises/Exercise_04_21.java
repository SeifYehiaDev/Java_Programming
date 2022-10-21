/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 21/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

//                                                 _Question_
                /*(Check SSN) Write a program that prompts the user to enter a Social Security
                number in the format DDD-DD-DDDD, where D is a digit. Your program should
                check whether the input is valid.*/
//                                                 _Solution_
public class Exercise_04_21 {
    public static void main(String[] args) {
        String ssn, firstPart, secondPart, thirdPart, ssnDigit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        ssn = input.nextLine();
        if (ssn.length() != 11 || ssn.indexOf('-') != 3 || ssn.lastIndexOf('-') != 6) {
            System.out.println(ssn.concat(" an invalid social security number"));
            System.exit(1);
        }
        firstPart = ssn.substring(0, ssn.indexOf('-')).trim();
        secondPart = ssn.substring(ssn.indexOf('-') + 1, ssn.lastIndexOf('-')).trim();
        thirdPart = ssn.substring(ssn.lastIndexOf('-') + 1).trim();
        ssnDigit = firstPart.concat(secondPart).concat(thirdPart);
        System.out.println(ssn.concat(" is ").concat((isDigit(ssnDigit)) ? "a valid social security number" : "an invalid social security number"));
    }

    public static boolean isDigit(String isbn) {
        boolean isDigit = true;
        for (int index = 0; index < isbn.length(); index++)
            if (!Character.isDigit(isbn.charAt(index))) {
                isDigit = false;
                break;
            }
        return isDigit;
    }
}

//                                                 _Output One_
/*
Enter a SSN: 232-23-5435
232-23-5435 is a valid social security number
 */

//                                                 _Output Two_
/*
Enter a SSN: 23-23-5435
23-23-5435 an invalid social security number
 */

//                                                 _Output Three_
/*
Enter a SSN: 232-SE-5435
232-SE-5435 is an invalid social security number
 */

//                                                 _Output Four_
/*
Enter a SSN: 232-231-5435
232-231-5435 an invalid social security number
 */