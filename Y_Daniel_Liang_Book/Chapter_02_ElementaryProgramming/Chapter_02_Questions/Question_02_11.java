/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_02_Questions;

/*                                                 _Question_
 * Show the result of the following remainders.
 * 56 % 6
 * 78 % -4
 * -34 % 5
 * -34 % -5
 * 5 % 1
 * 1 % 5
 * */
//                                                 _Solution_
public class Question_02_11 {
    public static void main(String[] args) {
        System.out.println("56 % 6 = " + (56 - ((56 / 6) * 6)));
        System.out.println("56 % 6 = " + 56 % 6);
        System.out.println("________________________________________________");
        System.out.println("78 % -4 = " + (78 - ((78 / -4) * -4)));
        System.out.println("78 % -4 = " + 78 % -4);
        System.out.println("________________________________________________");
        System.out.println("-34 % 5= " + (-34 - ((-34 / 5) * 5)));
        System.out.println("-34 % 5= " + -34 % 5);
        System.out.println("________________________________________________");
        System.out.println("-34 % -5= " + (-34 - ((-34 / -5) * -5)));
        System.out.println("-34 % -5= " + -34 % -5);
        System.out.println("________________________________________________");
        System.out.println("5 % 1 = " + (5 - ((5 / 1) * 1)));
        System.out.println("5 % 1 = " + 5 % 1);
        System.out.println("________________________________________________");
        System.out.println("1 % 5 = " + (1 - ((1 / 5) * 5)));
        System.out.println("1 % 5 = " + 1 % 5);
        System.out.println("1 % 5 = 1 because 1 less than 5.");
    }
}

/*                                                 _Output_
 * 56 % 6 = 2
 * 56 % 6 = 2
 * ________________________________________________
 * 78 % -4 = 2
 * 78 % -4 = 2
 * ________________________________________________
 * -34 % 5= -4
 * -34 % 5= -4
 * ________________________________________________
 * -34 % -5= -4
 * -34 % -5= -4
 * ________________________________________________
 * 5 % 1 = 0
 * 5 % 1 = 0
 * ________________________________________________
 * 1 % 5 = 1
 * 1 % 5 = 1
 * 1 % 5 = 1 because 1 less than 5.
 * */