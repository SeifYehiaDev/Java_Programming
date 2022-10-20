/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 20/10/2022
 * */

package Chapter_04_Exercises;

//                                                 _Question_
                    /*4.16 (Random character) Write a program that displays a random uppercase letter
                    using the Math.random() method.*/
//                                                 _Solution_
public class Exercise_04_16 {
    public static void main(String[] args) {
        System.out.println((char) (Math.random() * ('Z' - 'A' + 1) + 'A'));
    }
}

//                                                 _Output_
/*
Y
 */