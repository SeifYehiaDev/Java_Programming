/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 22/12/2022
 * */

package Chapter_05_Questions;

import java.util.Scanner;

//                                                 _Question_
                        /*What are the differences between a while loop and a do-while loop?
                          Convert the following while loop into a do-while loop.*/
//                                                 _Solution_
public class Question_05_07 {
    public static void main(String[] args) {
        System.out.println("What are the differences between a while loop and a do-while loop?");
        System.out.println("Do-while loop if you have statements inside the loop that must be executed at least once.\n");
        System.out.println("_____________________________ Do-while loop _____________________________");
        int sum = 0, number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer " + "(the input ends if it is 0)");
        number = input.nextInt();
        while (number != 0) {
            sum += number;
            System.out.println("Enter an integer " + "(the input ends if it is 0)");
            number = input.nextInt();
        }
        System.out.println("The sum is " + sum);
        System.out.println("_____________________________ After converting while loop _____________________________");
        sum = 0;
        number = 0;
        do {
            System.out.println("Enter an integer " + "(the input ends if it is 0)");
            number = input.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println("The sum is " + sum);
    }
}

//                                                 _Output_
/*
What are the differences between a while loop and a do-while loop?
Do-while loop if you have statements inside the loop that must be executed at least once.

_____________________________ Do-while loop _____________________________
Enter an integer (the input ends if it is 0)
1
Enter an integer (the input ends if it is 0)
2
Enter an integer (the input ends if it is 0)
3
Enter an integer (the input ends if it is 0)
4
Enter an integer (the input ends if it is 0)
5
Enter an integer (the input ends if it is 0)
6
Enter an integer (the input ends if it is 0)
7
Enter an integer (the input ends if it is 0)
8
Enter an integer (the input ends if it is 0)
9
Enter an integer (the input ends if it is 0)
0
The sum is 45
_____________________________ After converting while loop _____________________________
Enter an integer (the input ends if it is 0)
1
Enter an integer (the input ends if it is 0)
2
Enter an integer (the input ends if it is 0)
3
Enter an integer (the input ends if it is 0)
4
Enter an integer (the input ends if it is 0)
5
Enter an integer (the input ends if it is 0)
6
Enter an integer (the input ends if it is 0)
7
Enter an integer (the input ends if it is 0)
8
Enter an integer (the input ends if it is 0)
9
Enter an integer (the input ends if it is 0)
0
The sum is 45
 */