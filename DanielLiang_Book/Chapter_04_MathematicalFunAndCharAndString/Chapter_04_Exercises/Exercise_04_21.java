/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_21 {
    public static void main(String[] args) {
        String ssn;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        ssn = input.nextLine().trim();
        boolean validSsn = ssn.length() == 11 && ssn.charAt(3) == '-' && ssn.charAt(6) == '-';
        if (validSsn)
            for (int digit = 0; digit < ssn.length() && validSsn; digit++) {
                if (ssn.charAt(digit) == '-') continue;
                else if (!Character.isDigit(ssn.charAt(digit))) validSsn = false;
            }
        System.out.printf("%s is %s social security number", ssn, (validSsn) ? "a valid" : "an invalid");
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
23-23-5435 is an invalid social security number
 */

//                                                 _Output Three_
/*
Enter a SSN: 232-2B-54#5
232-2B-54#5 is an invalid social security number
 */