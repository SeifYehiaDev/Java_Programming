/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 16/10/2022
 * */

package Chapter_04_Questions;

//                                                 _Question_
            /*Write a statement that converts π / 7 to an angle in degrees and assigns the result to a variable.*/
//                                                 _Solution_
public class Question_04_04 {
    public static void main(String[] args) {
        final double AngleInRadians = Math.PI / 7;
        double angleInDegree = Math.toDegrees(AngleInRadians);
        System.out.println("converts π / 7 to an angle in degrees are " + angleInDegree);
        System.out.println("_________________ At the Same _________________");
        angleInDegree = AngleInRadians / (Math.PI / 180);
        System.out.println("converts π / 7 to an angle in degrees are " + angleInDegree);
    }
}

//                                                 _Output_
/*
converts π / 7 to an angle in degrees are 25.714285714285715
_________________ At the Same _________________
converts π / 7 to an angle in degrees are 25.714285714285715
 */