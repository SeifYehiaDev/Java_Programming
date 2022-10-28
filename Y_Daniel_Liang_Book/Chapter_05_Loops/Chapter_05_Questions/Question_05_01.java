/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 28/10/2022
 * */

package Chapter_05_Questions;

//                                                 _Question_
                /*Analyze the following code. Is count < 100 always true, always false, or sometimes
                true or sometimes false at Point A, Point B, and Point C?*/
//                                                 _Solution_
public class Question_05_01 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
// Point A
            System.out.println("Welcome to Java!");
            count++;
// Point B
        }
// Point C
        System.out.println("**************************************************");
        System.out.println("Point A is always true");
        System.out.println("Point B is sometimes true or false");
        System.out.println("Point C is always false");
    }
}

//                                                 _Output_
/*
Welcome to Java!
Welcome to Java!
Welcome to Java!
Welcome to Java!
Welcome to Java!
Welcome to Java!
Welcome to Java!
Welcome to Java!
Welcome to Java!
Welcome to Java!
**************************************************
Point A is always true
Point B is sometimes true or false
Point C is always false
 */