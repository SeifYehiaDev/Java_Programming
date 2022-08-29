/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * What is the output of the following code if number is 14, 15, or 30?
 * */
//                                                 _Solution_

public class Question_03_14 {
    public static void main(String[] args) {
        int number = 14;
        if_Tracing(number);
        System.out.println("**************************");
        number = 15;
        if_Tracing(number);
        System.out.println("**************************");
        number = 30;
        if_Tracing(number);
    }

    public static void if_Tracing(int number) {
        System.out.println("number is " + number);
        System.out.println("In case a");
        if (number % 2 == 0)
            System.out.println
                    (number + " is even");
        if (number % 5 == 0)
            System.out.println
                    (number + " is multiple of 5");
        System.out.println("In case b");
        if (number % 2 == 0)
            System.out.println
                    (number + " is even");
        else if (number % 5 == 0)
            System.out.println
                    (number + " is multiple of 5");
    }
}

/*                                                 _Output_
 * number is 14
 * In case a
 * 14 is even
 * In case b
 * 14 is even
 * **************************
 * number is 15
 * In case a
 * 15 is multiple of 5
 * In case b
 * 15 is multiple of 5
 * **************************
 * number is 30
 * In case a
 * 30 is even
 * 30 is multiple of 5
 * In case b
 * 30 is even
 * */