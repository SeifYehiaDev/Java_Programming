/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 22/12/2022
 * */

package Chapter_05_Questions;

//                                                 _Question_
                /*Convert the following for loop statement to a while loop and to a do-while loop*/
//                                                 _Solution_
public class Question_05_13 {
    public static void main(String[] args) {
        System.out.println("__________________ Using For loop __________________");
        long sum = 0;
        for (int i = 0; i <= 1000; i++)
            sum = sum + i;
        System.out.println("The sum is " + sum);
        System.out.println("__________________ Using While loop __________________");
        sum = 0;
        int i = 0;
        while (i <= 1000) {
            sum = sum + i;
            i++;
        }
        System.out.println("The sum is " + sum);
        System.out.println("__________________ Using Do-While loop __________________");
        sum = 0;
        i = 0;
        do {
            sum = sum + i;
            i++;
        } while (i <= 1000);
        System.out.println("The sum is " + sum);
    }
}

//                                                 _Output_
/*
__________________ Using For loop __________________
The sum is 500500
__________________ Using While loop __________________
The sum is 500500
__________________ Using Do-While loop __________________
The sum is 500500
 */