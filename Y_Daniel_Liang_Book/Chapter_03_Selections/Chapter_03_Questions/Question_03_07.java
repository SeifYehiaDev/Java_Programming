/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 28/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * What is the output of the code in (a) and (b) if number is 30? What if number is 35?
 * a-                                                        b-
 * if (number % 2 == 0)                                      if (number % 2 == 0)
 *  System.out.println(number + " is even.");                 System.out.println(number + " is even.");
 *                                                           else
 * System.out.println(number + " is odd.");                  System.out.println(number + " is odd.");
 * */
//                                                 _Solution_

public class Question_03_07 {
    public static void main(String[] args) {
        int number = 30;
        System.out.println("Case a when number = " + number);
        if (number % 2 == 0)
            System.out.println(number + " is even.");

        System.out.println(number + " is odd.");

        System.out.println("Case b when number = " + number);
        if (number % 2 == 0)
            System.out.println(number + " is even.");
        else
            System.out.println(number + " is odd.");
        System.out.println("_________________________________________");
        number = 35;
        System.out.println("Case a when number = " + number);
        if (number % 2 == 0)
            System.out.println(number + " is even.");

        System.out.println(number + " is odd.");

        System.out.println("Case b when number = " + number);
        if (number % 2 == 0)
            System.out.println(number + " is even.");
        else
            System.out.println(number + " is odd.");
        System.out.println();
    }
}

/*                                                 _Output_
 * Case a when number = 30
 * 30 is even.
 * 30 is odd.
 * Case b when number = 30
 * 30 is even.
 * _________________________________________
 * Case a when number = 35
 * 35 is odd.
 * Case b when number = 35
 * 35 is odd.
 * */