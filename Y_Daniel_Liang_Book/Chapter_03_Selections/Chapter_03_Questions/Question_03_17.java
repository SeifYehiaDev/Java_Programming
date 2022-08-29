/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Are the following two statements equivalent?
 * */
//                                                 _Solution_

public class Question_03_17 {
    public static void main(String[] args) {
        double income = 19_500, taxOne = 0.0D, taxTwo = 0.0D;
        System.out.println("In case one");
        if (income <= 10_000)
            taxOne = income * 0.1;
        else if (income <= 20_000)
            taxOne = 1000 + (income - 1000) * 0.15;
        System.out.println("tax = " + taxOne);
        System.out.println("In case Two");
        if (income <= 10000)
            taxTwo = income * 0.1;
        else if (income > 10000 && income <= 20000)
            taxTwo = 1000 + (income - 1000) * 0.15;
        System.out.println("tax = " + taxTwo);
        if (taxOne == taxTwo)
            System.out.println("Two statements are equivalent");
        else
            System.out.println("Two statements aren't equivalent");
    }
}

/*                                                 _Output_
 * In case one
 * tax = 3775.0
 * In case Two
 * tax = 3775.0
 * Two statements are equivalent
 * */