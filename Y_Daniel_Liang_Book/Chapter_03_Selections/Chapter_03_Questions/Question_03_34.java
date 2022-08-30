/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Rewrite the following if statements using the conditional operator.
 * */
//                                                 _Solution_

public class Question_03_34 {
    public static void main(String[] args) {
        int ages = 25, ticketPrice;
        if (ages >= 16)
            ticketPrice = 20;
        else
            ticketPrice = 10;
        System.out.println("ticketPrice = " + ticketPrice);
        System.out.println("Rewrite the following if statements using the conditional operator.");
        ticketPrice = (ages >= 16) ? 20 : 10;
        System.out.println("ticketPrice = " + ticketPrice);
    }
}

/*                                                 _Output_
 * ticketPrice = 20
 * Rewrite the following if statements using the conditional operator.
 * ticketPrice = 20
 * */