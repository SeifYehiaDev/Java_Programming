/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_02_Questions;

/*                                                 _Question_
 * If today is Tuesday, what will be the day in 100 days?
 * */
//                                                 _Solution_
public class Question_02_12 {
    public static void main(String[] args) {
        final int TODAY = 2 , DAY = 100; // Mean's today is Tuesday
        int day = (TODAY + DAY) % 7;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }
    }
}

/*                                                 _Output_
 * Thursday
 * */