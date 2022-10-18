/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 18/10/2022
 * */

package Chapter_04_Examples;

import java.util.Scanner;

public class Example_04_14 {
    public static void main(String[] args) {
        char characterFromUser;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        characterFromUser = input.nextLine().charAt(0);
        System.out.println("The character entered is '" + characterFromUser + "'");
    }
}

//                                                 _Output_
/*
Enter a character: S
The character entered is 'S'
 */