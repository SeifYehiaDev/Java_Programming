/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/12/2022
 * */

package Chapter_05_Lists;

import java.util.Scanner;

public class Listing_05_14_Palindrome {
    public static void main(String[] args) {
        int low = 0, high;
        boolean isPalindrome = true;
        String message;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        message = input.nextLine();
        high = message.length() - 1;
        while (low < high) {
            if (message.charAt(low) != message.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        System.out.println(message.concat(" is ").concat((isPalindrome) ? "a palindrome" : "not a palindrome"));
    }
}

//                                                 _Output One_
/*
Enter a string: noon
noon is a palindrome
 */

//                                                 _Output Two_
/*
Enter a string: moon
moon is not a palindrome
 */