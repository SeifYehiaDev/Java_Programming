/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 16/10/2022
 * */

package Chapter_04_Questions;

//                                                 _Question_
                    /*Write an expression that obtains a random integer between 34 and 55. Write an
                    expression that obtains a random integer between 0 and 999. Write an expression
                    that obtains a random number between 5.5 and 55.5.*/
//                                                 _Solution_
public class Question_04_05 {
    public static void main(String[] args) {
        System.out.println("Write an expression that obtains a random integer between 34 and 55.");
        System.out.println((int) (Math.random() * (55 - 34 + 1) + 34));
        System.out.println("Write an expression that obtains a random integer between 0 and 999.");
        System.out.println((int) (Math.random() * (999 - 0 + 1) + 0));
        System.out.println("Write an expression that obtains a random integer between 5.5 and 55.5.");
        System.out.println(Math.round((Math.random() * (55.5 - 5.5 + 1) + 5.5) * 10) / 10.0);
    }
}

//                                                 _Output_
/*
Write an expression that obtains a random integer between 34 and 55.
55
Write an expression that obtains a random integer between 0 and 999.
438
Write an expression that obtains a random integer between 5.5 and 55.5.
47.4
 */