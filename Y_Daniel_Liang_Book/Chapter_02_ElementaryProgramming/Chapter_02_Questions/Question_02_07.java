/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_02_Questions;

/*                                                 _Question_
 * What are the benefits of using constants? Declare an int constant SIZE with value 20.
 * */
//                                                 _Solution_
public class Question_02_07 {
    public static void main(String[] args) {
        final int SIZE = 20;
        /*
         * What are the benefits of using constants?
         * it can not change on any place because it is constant
         * */
        // SIZE = 30; Error
        System.out.println("SIZE = " + SIZE);
    }
}

/*                                                 _Output_
 * SIZE = 20
 * */