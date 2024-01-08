/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 08/01/2024
 * */

package Chapter_02_Questions;

public class Question_02_12 {
    public static void main(String[] args) {
        final String[] WEEK_DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("If today is Tuesday, what will be the day in 100 days?");
        System.out.print(WEEK_DAYS[(2 + 100) % 7]);
    }
}

//                                                 _Output_
/*
If today is Tuesday, what will be the day in 100 days?
Thursday
 */