/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/10/2022
 * */

package Chapter_04_Exercises;


//                                                 _Question_
            /*(Generate vehicle plate numbers) Assume a vehicle plate number consists of three
            uppercase letters followed by four digits. Write a program to generate a plate
            number.*/
//                                                 _Solution_
public class Exercise_04_25 {
    public static void main(String[] args) {
        System.out.println((char) (Math.random() * ('Z' - 'A' + 1) + 'A') + "" + (char) (Math.random() * ('Z' - 'A' + 1) + 'A') + (char) (Math.random() * ('Z' - 'A' + 1) + 'A') + (int) (Math.random() * (9999 - 1000 + 1) + 1000));
    }
}

//                                                 _Output_
/*
XQI4584
 */