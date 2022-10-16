/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 16/10/2022
 * */

package Chapter_04_Questions;

//                                                 _Question_
            /*Write a statement that converts 47 degrees to radians and assigns the result to a
            variable.*/
//                                                 _Solution_
public class Question_04_03 {
    public static void main(String[] args) {
        final int DEGREES = 47;
        double radians = Math.toRadians(DEGREES);
        System.out.println("47 degrees are " + radians + " radians");
    }
}

//                                                 _Output_
/*
47 degrees are 0.8203047484373349 radians
 */