/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 21/12/2022
 * */

package Chapter_05_Questions;

import java.util.Scanner;

//                                                 _Question_
                    /*Suppose the input is 2 3 4 5 0. What is the output of the following code?*/
//                                                 _Solution_
public class Question_05_04 {
    public static void main(String[] args) {
        int number, max;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        max = number;
        while (number != 0) {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if (number > max)
                max = number;
        }
        System.out.println("max is " + max);
        System.out.println("number " + number);
    }
}

//                                                 _Output_
/*
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
Enter a number: 0
max is 5
number 0
 */