/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 22/12/2022
 * */

package Chapter_05_Questions;

import java.util.Scanner;

//                                                 _Question_
                    /*Suppose the input is 2 3 4 5 0. What is the output of the following code?*/
//                                                 _Solution_
public class Question_05_10 {
    public static void main(String[] args) {
        int number, sum = 0, count;
        Scanner input = new Scanner(System.in);
        for (count = 0; count < 5; count++) {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            sum += number;
        }
        System.out.println("sum is " + sum);
        System.out.println("count is " + count);
    }
}

//                                                 _Output_
/*
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
Enter a number: 0
sum is 14
count is 5
 */