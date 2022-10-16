/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 16/10/2022
 * */

package Chapter_04_Questions;

//                                                 _Question_
                           /*Write the code that generates a random lowercase letter.*/
//                                                 _Solution_
public class Question_04_14 {
    public static void main(String[] args) {

        System.out.println((char) (Math.random() * ('z' - 'a' + 1) + 'a'));
    }
}

//                                                 _Output_
/*
e
 */